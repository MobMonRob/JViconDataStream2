#include "ViconStringTest.h"

#include <string>
#include <iostream>
#include <exception>
#include <typeinfo>
#include <stdexcept>
#include <sstream>

#include "IDataStreamClientBase.h"
#include "DataStreamClient.h"


using namespace ViconDataStreamSDK;
using namespace CPP;


///////////////////////////////////////////
String ViconStringToJavaStringTest::getViconStringHallo() {
	return String("ViconStringHallo");
}

const char* ViconStringToJavaStringTest::getCharStringHallo() {
	return "CharStringHallo";
}

std::string ViconStringToJavaStringTest::getStdStringHallo() {
	return std::string("StdStringHallo");
}
///////////////////////////////////////////


///////////////////////////////////////////
std::string JavaStringToViconStringTest::testJavaStringInput(String javaString)
{
	std::string stdString = javaString;
	return stdString;
}

std::string JavaStringToViconStringTest::testJavaStringReferenceInput(const String& javaString)
{
	std::string stdString = javaString;
	return stdString;
}
///////////////////////////////////////////


///////////////////////////////////////////
Output_Connect ViconConnectTest::testConnect()
{
	Client client;
	Output_Connect result = client.Connect("192.168.10.1:51001");
	client.Disconnect();
	return result;
}

std::string ViconConnectTest::testConnectGiven(const String& javaString)
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
///////////////////////////////////////////

