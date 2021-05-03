#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	mkdir -p "$localTarget"

	x86_64-w64-mingw32-g++ \
	"$ViconIncludeDir/ViconDataStreamSDK_CPPTest.cpp" \
	-I"$ViconIncludeDir" \
	-L"$ViconLibDir" -l:ViconDataStreamSDK_CPP.lib -l:ViconDataStreamSDK_CPP.dll \
	-o "$localTarget/ViconDataStreamSDK_CPPTest.exe"
}

run_bash run $@

