#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

../swig/generate.sh

#https://web.archive.org/web/20201007174747/https://stackoverflow.com/questions/54373254/load-dependent-so-from-other-shared-library-via-jni/58842312#58842312
gcc -shared -fPIC -cpp -std=c++17 -O3 -flto ../swig/ViconDataStreamSDK_wrap.cpp -LDataStreamSDK_1.10 -lViconDataStreamSDK_CPP -o libjViconDataStreamSDK.so -I/usr/lib/jvm/default-java/include/linux -I/usr/lib/jvm/default-java/include -Wl,-rpath,'$ORIGIN/.'

echo "gcc finished"

#Has to be: <Project Folder>/natives/<os-arch> !!
mkdir -p ../JViconDataStream/natives/linux-amd64/
cp ./*.so* ../JViconDataStream/natives/linux-amd64/
cp ./DataStreamSDK_1.10/*.so* ../JViconDataStream/natives/linux-amd64/

echo "Linux64 finished"

