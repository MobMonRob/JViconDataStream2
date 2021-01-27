#pragma once

#include <string>

#include "IDataStreamClientBase.h"


namespace ViconDataStreamSDK
{
namespace CPP
{


///////////////////////////////////////////
class ViconStringToJavaStringTest
{
public:
	ViconDataStreamSDK::CPP::String getViconStringHallo();

	const char* getCharStringHallo();

	std::string getStdStringHallo();
};
///////////////////////////////////////////

///////////////////////////////////////////
class JavaStringToViconStringTest
{
public:
	std::string testJavaStringInput(ViconDataStreamSDK::CPP::String javaString);

	std::string testJavaStringReferenceInput(const ViconDataStreamSDK::CPP::String& javaString);
};
///////////////////////////////////////////

///////////////////////////////////////////
class ViconConnectTest
{
public:
	Output_Connect testConnect();

	std::string testConnectGiven(const ViconDataStreamSDK::CPP::String& javaString);
};
///////////////////////////////////////////


}
}

