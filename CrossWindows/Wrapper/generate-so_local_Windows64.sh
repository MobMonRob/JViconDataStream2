#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	mkdir -p "$localTarget"

	x86_64-w64-mingw32-g++ -c -fPIC -O3 -flto -cpp -std=c++14 \
	"$ViconStringTestDir/ViconStringTest.cpp" \
	-I"$ViconIncludeDir" -I"$ViconStringTestDir" \
	-o "$localTmp/ViconStringTest.o"

	#-c für nicht linken (nur .o erzeugen)
	#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
	x86_64-w64-mingw32-g++ -c -fPIC -O3 -flto -cpp -std=c++14 \
	"$localTmp/ViconDataStreamSDK_wrap.cpp" \
	-I"$javaIncludeDir/win32" -I"$javaIncludeDir" -I"$ViconIncludeDir" -I"$ViconStringTestDir" \
	-o "$localTmp/libViconDataStreamSDK_wrap.o"

	#"$localTmp/libViconDataStreamSDK_wrap.o"
	#-lViconDataStreamSDK_CPP
	#x86_64-w64-mingw32-g++ -shared -flto \
	#"$localTmp/ViconStringTest.o" \
	#-L"$ViconLibDir" -l:ViconDataStreamSDK_CPP.lib -l:ViconDataStreamSDK_CPP.dll \
	#-Wl,-rpath,'$ORIGIN/.' \
	#-o "$localTarget/libjViconDataStreamSDK.dll" \
	#-Wl,--as-needed -Wl,--no-undefined -Wl,--no-allow-shlib-undefined

	x86_64-w64-mingw32-g++ -shared \
	"$ViconStringTestDir/ViconStringTest.cpp" \
	-I"$ViconIncludeDir" -I"$ViconStringTestDir" \
	-L"$ViconLibDir" -l:ViconDataStreamSDK_CPP.lib -l:ViconDataStreamSDK_CPP.dll \
	-o "$localTarget/libjViconDataStreamSDK.dll"
}

run_bash run $@

