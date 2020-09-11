#pragma once

#include <string>

namespace ViconDataStreamSDK::CPP
{
	class ViconStringTest;
}

class ViconDataStreamSDK::CPP::ViconStringTest
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

