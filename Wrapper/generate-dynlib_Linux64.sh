#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	mkdir -p "$linuxTarget"

	local -r viconTarget="$ViconDir/$linuxTarget"

	#-c für nicht linken (nur .o erzeugen)
	#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
	g++ -c -fPIC -O3 -flto -cpp -std=c++14 "$linuxTmp/ViconDataStreamSDK_wrap.cpp" \
	-I"$javaIncludeLinux/linux" -I"$javaIncludeLinux" -I"$viconTarget" \
	-o "$linuxTmp/libViconDataStreamSDK_wrap.o"

	g++ -shared -flto "$linuxTmp/libViconDataStreamSDK_wrap.o" -L"$viconTarget" -lboost -lViconDataStreamSDK_CPP -Wl,-rpath,'$ORIGIN/.' -o "$linuxTarget/libjViconDataStreamSDK.so" \
	-Wl,--as-needed -Wl,--no-undefined -Wl,--no-allow-shlib-undefined
}

run_bash run $@

