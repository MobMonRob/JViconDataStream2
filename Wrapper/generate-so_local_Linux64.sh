#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

mkdir -p "./target/Linux64/"

echo "gcc started"

localTmp="./target/_tmp/Linux64"
localTarget="./target/Linux64"
viconTarget="../ViconDataStreamSDK/target/Linux64"
boostLibPath="../Boost/target/Linux64/lib"
javaInclude="/usr/lib/jvm/default-java/include"

#-c für nicht linken (nur .o erzeugen)
#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
#-flto
gcc -c -fPIC -O3 -cpp -std=c++14 "$localTmp/ViconDataStreamSDK_wrap.cpp" \
-I"$javaInclude/linux" -I"$javaInclude" -I"$viconTarget" \
-o "$localTmp/libViconDataStreamSDK_wrap.o"

boostLibs=$(find "$boostLibPath" -maxdepth 1 -mindepth 1 -type f)

gcc -shared -flto -pthread "$localTmp/libViconDataStreamSDK_wrap.o" -Wl,--start-group "$viconTarget/libViconDataStreamSDK_CPP.a" $boostLibs -Wl,--end-group -o "$localTarget/libjViconDataStreamSDK.so"

echo "gcc finished"

echo "Wrapper so generation finished"

