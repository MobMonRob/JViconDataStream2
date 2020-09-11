#pragma once

namespace ViconDataStreamSDK
{
	namespace CPP {


class ViconStringTest
{
public:
	ViconDataStreamSDK::CPP::String getViconStringHallo() {
		return ViconDataStreamSDK::CPP::String("Hallo");
	}

	const char* getCharStringHallo() {
		return "Hallo";
	}
};

}
}

