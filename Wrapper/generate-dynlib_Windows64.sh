#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	mkdir -p "$windowsTarget"

	local -r viconTarget="$viconDir/$windowsTarget"

	#-flto
	#-c für nicht linken (nur .o erzeugen)
	#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
	x86_64-w64-mingw32-g++-posix -c -fPIC -O3 -cpp -std=c++14 "$windowsTmp/ViconDataStreamSDK_wrap.cpp" \
	-I"$javaIncludeWindows/win32" -I"$javaIncludeWindows" -I"$viconTarget" \
	-o "$windowsTmp/libViconDataStreamSDK_wrap.o"

	#-flto
	x86_64-w64-mingw32-g++-posix -shared -O3 "$windowsTmp/libViconDataStreamSDK_wrap.o" -L"$viconTarget" -lboost -lViconDataStreamSDK_CPP -Wl,-rpath,'$ORIGIN/.' -o "$windowsTarget/libjViconDataStreamSDK.dll" \
	-Wl,--as-needed -Wl,--no-undefined -Wl,--no-allow-shlib-undefined
}

run_bash run $@

