#pragma once

#include "./Vicon_DataStream SDK_Win64_CPP_1.9/DataStreamClient.h";

class TestSwig
{
public:
	int getI() { return i; };
	int gI();
private:
	int i;
};

