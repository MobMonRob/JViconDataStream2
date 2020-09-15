#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

../swig/generate.sh

gcc -shared -fPIC -cpp -std=c++17 -O3 -flto ../swig/ViconDataStreamSDK_wrap.cpp -LDataStreamSDK_1.10 -lViconDataStreamSDK_CPP -o libjViconDataStreamSDK.so -I/usr/lib/jvm/default-java/include/linux -I/usr/lib/jvm/default-java/include

echo "gcc finished"

mkdir -p ../JViconDataStream/src/main/natives/linux-amd64/
cp ./*.so ../JViconDataStream/src/main/natives/linux-amd64/

echo "Linux64 finished"

