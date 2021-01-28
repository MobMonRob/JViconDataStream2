#!/bin/bash

source "./_bash_config.sh"
setScriptDir "${BASH_SOURCE[0]}"

run() {
	mkdir -p "$localTarget"

	viconTarget="$ViconDir/$localTarget"
	javaInclude="/usr/lib/jvm/default-java/include"

	#-c für nicht linken (nur .o erzeugen)
	#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
	g++ -c -fPIC -O3 -flto -cpp -std=c++14 "$localTmp/ViconDataStreamSDK_wrap.cpp" \
	-I"$javaInclude/linux" -I"$javaInclude" -I"$viconTarget" \
	-o "$localTmp/libViconDataStreamSDK_wrap.o"

	g++ -shared -flto "$localTmp/libViconDataStreamSDK_wrap.o" -L"$viconTarget" -lViconDataStreamSDK_CPP -Wl,-rpath,'$ORIGIN/.' -o "$localTarget/libjViconDataStreamSDK.so" \
	-Wl,--as-needed -Wl,--no-undefined -Wl,--no-allow-shlib-undefined
}

#Unnötig machen, indem per Konvention diese Methode so heißen muss.
run_bash run $@

