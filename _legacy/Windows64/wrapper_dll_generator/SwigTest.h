#pragma once

#include <string>

namespace ViconDataStreamSDK
{
    namespace CPP
    {

        class String;

        class SwigTest
        {
        public:
            int getI() { return i; }
            int blub() { return 5; }
            //friend std::ostream& operator<<(std::ostream& io_rStream, const std::string& i_rString);
        private:
            int i;
        };

        class IStringFactory
        {
        public:
            virtual char* AllocAndCopyString(const char* i_pSource) = 0;
            virtual void FreeString(char* i_pString) = 0;
        protected:
            virtual ~IStringFactory() {}
        };

        class String
        {
        public:
            // A string which we are not responsible for deallocating
            inline
                String(const char* i_pString = 0)
                : m_pString(0)
                , m_pConstString(i_pString)
                , m_pStringFactory(0)
            {
            }

            // A string which we are not responsible for deallocating
            String(const std::string& i_rString)
                : m_pString(0)
                , m_pConstString(i_rString.c_str())
                , m_pStringFactory(0)
            {
            }

            // Copy constructor
            inline
                String(const String& i_rString)
            {
                m_pConstString = i_rString.m_pConstString;
                m_pStringFactory = i_rString.m_pStringFactory;
                if (m_pStringFactory)
                {
                    m_pString = m_pStringFactory->AllocAndCopyString(i_rString.m_pString);
                }
                else
                {
                    m_pString = 0;
                }
            }

            inline
                String& operator=(const String& i_rString)
            {
                m_pConstString = i_rString.m_pConstString;
                m_pStringFactory = i_rString.m_pStringFactory;
                if (m_pStringFactory)
                {
                    m_pString = m_pStringFactory->AllocAndCopyString(i_rString.m_pString);
                }
                else
                {
                    m_pString = 0;
                }
                return *this;
            }

            inline
                ~String()
            {
                if (m_pStringFactory)
                {
                    m_pStringFactory->FreeString(m_pString);
                }
            }

            // A string which we are responsible for deallocating
            inline
                void Set(const char* i_pString, IStringFactory& i_rStringFactory)
            {
                m_pString = i_rStringFactory.AllocAndCopyString(i_pString);
                m_pStringFactory = &i_rStringFactory;
                m_pConstString = 0;
            }

            inline
                operator std::string() const
            {
                if (m_pStringFactory)
                {
                    return std::string(m_pString);
                }
                else
                {
                    return std::string(m_pConstString);
                }
            }

        private:
            char* m_pString;
            const char* m_pConstString;
            IStringFactory* m_pStringFactory;
        };


        // Streaming operator for String
        //const
        inline std::ostream& operator<<(std::ostream& io_rStream, const String& i_rString)
        {
            const std::string i = std::string(i_rString);
            std::ostream& j = io_rStream << i;
            return io_rStream;
        }

    }
}

