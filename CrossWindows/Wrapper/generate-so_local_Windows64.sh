#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	mkdir -p "$localTarget"

	#-c für nicht linken (nur .o erzeugen)
	#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
	x86_64-w64-mingw32-g++ -c -fPIC -O3 -flto -cpp -std=c++14 "$localTmp/ViconDataStreamSDK_wrap.cpp" \
	-I"$javaIncludeDir/win32" -I"$javaIncludeDir" -I"$ViconIncludeDir" \
	-o "$localTmp/libViconDataStreamSDK_wrap.o"

	x86_64-w64-mingw32-g++ -shared -flto "$localTmp/libViconDataStreamSDK_wrap.o" -L"$ViconLibDir" -lViconDataStreamSDK_CPP -Wl,-rpath,'$ORIGIN/.' -o "$localTarget/libjViconDataStreamSDK.dll" \
	-Wl,--as-needed -Wl,--no-undefined -Wl,--no-allow-shlib-undefined
}

run_bash run $@

