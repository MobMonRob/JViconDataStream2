#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

mkdir -p "./target/Linux64/"

echo "gcc started"

localTmp="./target/_tmp/Linux64"
localTarget="./target/Linux64"
viconTarget="../ViconDataStreamSDK/target/Linux64"
javaInclude="/usr/lib/jvm/default-java/include"
boostLibPath="../Boost/target/Linux64/lib"

#-c für nicht linken (nur .o erzeugen)
#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
gcc -c -fPIC -O3 -flto -cpp -std=c++14 "$localTmp/ViconDataStreamSDK_wrap.cpp" \
-I"$javaInclude/linux" -I"$javaInclude" -I"$viconTarget" \
-o "$localTmp/libViconDataStreamSDK_wrap.o"

#boostLibs=$(find "$boostLibPath" -maxdepth 1 -mindepth 1 -type f)

# Seems to find boost Libs automatically??
# Explicit inklusion produces errors
gcc -shared -fPIC -O3 -flto -pthread $localTmp/libViconDataStreamSDK_wrap.o -L"$viconTarget" -Wl,--whole-archive -lViconDataStreamSDK_CPP -Wl,--no-whole-archive -o "$localTarget/libjViconDataStreamSDK.so"

echo "gcc finished"

echo "Wrapper so generation finished"

