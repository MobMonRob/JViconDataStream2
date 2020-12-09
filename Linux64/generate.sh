#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear.sh

../swig/generate.sh

mkdir -p "./target/"

echo "gcc started"

#https://web.archive.org/web/20201007174747/https://stackoverflow.com/questions/54373254/load-dependent-so-from-other-shared-library-via-jni/58842312#58842312
gcc -shared -fPIC -cpp -std=c++17 -O3 -flto ../swig/target/ViconDataStreamSDK_wrap.cpp -IDataStreamSDK_1.10 -LDataStreamSDK_1.10 -lViconDataStreamSDK_CPP -o ./target/libjViconDataStreamSDK.so -I/usr/lib/jvm/default-java/include/linux -I/usr/lib/jvm/default-java/include -Wl,-rpath,'$ORIGIN/.'

echo "gcc finished"

echo "Linux64 finished"

