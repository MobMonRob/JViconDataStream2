#pragma once

#include <string>
#include "DataStreamClient.h"

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

	Output_Connect testConnectGiven(const ViconDataStreamSDK::CPP::String& javaString)
	{
		Client client;
		Output_Connect result = client.Connect(javaString);
		client.Disconnect();
		return result;
	}
};

}
}

