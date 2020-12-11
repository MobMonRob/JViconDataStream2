#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

mkdir -p "./target/"

echo "gcc started"

#https://web.archive.org/web/20201007174747/https://stackoverflow.com/questions/54373254/load-dependent-so-from-other-shared-library-via-jni/58842312#58842312
gcc -shared -fPIC -cpp -std=c++17 -O3 -flto ./target/ViconDataStreamSDK_wrap.cpp -I../ViconDataStreamSDK/target/Linux64/ -L../ViconDataStreamSDK/target/Linux64/ -lViconDataStreamSDK_CPP -o ./target/libjViconDataStreamSDK.so -I/usr/lib/jvm/default-java/include/linux -I/usr/lib/jvm/default-java/include -Wl,-rpath,'$ORIGIN/.'

echo "gcc finished"

echo "swig so generation finished"

