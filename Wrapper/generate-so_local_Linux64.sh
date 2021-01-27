#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

mkdir -p "./target/Linux64/"

echo "gcc started"

localTmp="./target/_tmp/Linux64"
localTarget="./target/Linux64"
viconTarget="../ViconDataStreamSDK/target/Linux64"
javaInclude="/usr/lib/jvm/default-java/include"

#-c für nicht linken (nur .o erzeugen)
#-shared .so muss tun, damit sicher der Fehler nicht hier liegt.
gcc -c -fPIC -O3 -flto -cpp -std=c++14 "$localTmp/ViconDataStreamSDK_wrap.cpp" \
-I"$javaInclude/linux" -I"$javaInclude" -I"$viconTarget" \
-o "$localTmp/libViconDataStreamSDK_wrap.o"

gcc -shared -flto "$localTmp/libViconDataStreamSDK_wrap.o" -L"$viconTarget" -lViconDataStreamSDK_CPP -o "$localTarget/libjViconDataStreamSDK.so"

echo "gcc finished"

echo "Wrapper so generation finished"

