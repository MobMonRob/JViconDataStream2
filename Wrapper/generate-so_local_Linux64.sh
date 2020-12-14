#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

mkdir -p "./target/Linux64/"

echo "gcc started"

#https://web.archive.org/web/20201007174747/https://stackoverflow.com/questions/54373254/load-dependent-so-from-other-shared-library-via-jni/58842312#58842312
gcc -shared -fPIC -cpp -std=c++17 -O3 -flto ./target/Linux64/ViconDataStreamSDK_wrap.cpp -I../ViconDataStreamSDK/target/Linux64/ -L../ViconDataStreamSDK/target/Linux64/ -lViconDataStreamSDK_CPP -o ./target/Linux64/libjViconDataStreamSDK.so -I/usr/lib/jvm/default-java/include/linux -I/usr/lib/jvm/default-java/include -Wl,-rpath,'$ORIGIN/.'

echo "gcc finished"

echo "Wrapper so generation finished"

