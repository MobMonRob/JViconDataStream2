#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

mkdir -p "./target/Linux64/"

echo "gcc started"

#-flto seems to be problamtic for swig generated code
gcc -shared -fPIC -O3 -cpp -std=c++17 ./target/Linux64/ViconDataStreamSDK_wrap.cpp -I/usr/lib/jvm/default-java/include/linux -I/usr/lib/jvm/default-java/include -I../ViconDataStreamSDK/target/Linux64/ -L../ViconDataStreamSDK/target/Linux64/ -Wl,--unresolved-symbols=ignore-in-object-files -Wl,--whole-archive -lViconDataStreamSDK_CPP -Wl,--no-whole-archive -Wl,-rpath,'$ORIGIN/.' -pthread -o ./target/Linux64/libjViconDataStreamSDK.so

echo "gcc finished"

echo "Wrapper so generation finished"

