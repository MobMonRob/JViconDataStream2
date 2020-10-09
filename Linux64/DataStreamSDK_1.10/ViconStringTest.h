#pragma once

#include <string>
#include "DataStreamClient.h"

#include <iostream>
#include <exception>
#include <typeinfo>
#include <stdexcept>
#include <sstream>

namespace ViconDataStreamSDK
{
namespace CPP
{

class ViconStringToJavaStringTest
{
public:
	ViconDataStreamSDK::CPP::String getViconStringHallo() {
		return ViconDataStreamSDK::CPP::String("ViconStringHallo");
	}

	const char* getCharStringHallo() {
		return "CharStringHallo";
	}

	std::string getStdStringHallo() {
		return std::string("StdStringHallo");
	}
};

class JavaStringToViconStringTest
{
public:
	std::string testJavaStringInput(ViconDataStreamSDK::CPP::String javaString)
	{
		std::string stdString = javaString;
		return stdString;
	}

	std::string testJavaStringReferenceInput(const ViconDataStreamSDK::CPP::String& javaString)
	{
		std::string stdString = javaString;
		return stdString;
	}
};


class ViconConnectTest
{
public:
	Output_Connect testConnect()
	{
		Client client;
		Output_Connect result = client.Connect("192.168.10.1:51001");
		client.Disconnect();
		return result;
	}

	std::string testConnectGiven(const ViconDataStreamSDK::CPP::String& javaString)
	{
		Client client;
		Output_Connect result;
		std::string output;

		try {
			result = client.Connect(javaString);
			if (result.Result == Result::Success)
			{
				output = "success";
			}
			else
			{
				output = "failure";
			}
			//exception schmeißen testen
		}
		catch(...)
		{
			std::ostringstream os;

			std::exception_ptr p = std::current_exception();
			os <<(p ? p.__cxa_exception_type()->name() : "null") << std::endl;

			return os.str();
		}

		client.Disconnect();
		return output;
	}
};

}
}

