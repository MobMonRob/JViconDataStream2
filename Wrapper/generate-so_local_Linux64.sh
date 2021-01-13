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
gcc -c -fPIC -O3 -cpp -std=c++14 "$localTmp/ViconDataStreamSDK_wrap.cpp" \
-I"$javaInclude/linux" -I"$javaInclude" -I"$viconTarget" \
-o "$localTmp/libViconDataStreamSDK_wrap.o"

gcc -shared "$localTmp/libViconDataStreamSDK_wrap.o" -o "$localTmp/libViconDataStreamSDK_wrap.so"


#-fuse-linker-plugin
#-flto seems to be problamtic for swig generated code
#-shared
#-fPIC
#-O3
#-D_GLIBCXX_USE_CXX11_ABI=0
#"$localTmp/libViconDataStreamSDK_wrap.o"
#-shared -fPIC
#gcc -fPIC \
#-I"$viconTarget" -L"$viconTarget" \
#-rdynamic -Wl,--start-group -Wl,--whole-archive -lViconDataStreamSDK_CPP -Wl,--no-whole-archive -lpthread -Wl,--end-group -Wl,-rpath,'$ORIGIN/.' -o "$localTarget/libjViconDataStreamSDK.so"
#-fvisibility-inlines-hidden -fvisibility=hidden
#-Wl,--unresolved-symbols=ignore-in-object-files
#-rdynamic

echo "gcc finished"

echo "Wrapper so generation finished"

