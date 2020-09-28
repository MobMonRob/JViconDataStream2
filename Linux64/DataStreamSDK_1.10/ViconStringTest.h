#pragma once

#include <string>

namespace ViconDataStreamSDK
{
namespace CPP
{

class ViconStringTest
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

}
}

