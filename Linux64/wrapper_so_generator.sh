#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

../swig/invoke.sh

gcc -shared -fPIC -cpp ../swig/ViconDataStreamSDK_wrap.cpp -LDataStreamSDK_1.10 -lViconDataStreamSDK_CPP -o viconWrapper.so -I/usr/lib/jvm/default-java/include/linux -I/usr/lib/jvm/default-java/include

