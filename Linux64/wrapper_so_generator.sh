#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

../swig/invoke.sh

gcc -shared -fPIC -cpp -std=c++17 ../swig/ViconDataStreamSDK_wrap.cpp -LDataStreamSDK_1.10 -lViconDataStreamSDK_CPP -o libjViconDataStreamSDK.so -I/usr/lib/jvm/default-java/include/linux -I/usr/lib/jvm/default-java/include

