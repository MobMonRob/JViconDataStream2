#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

./clear.sh

cd current_Linux64_source
make ViconDataStreamSDK_CPP --jobs=2 CONFIG=Release
cd "$scriptDir"

mkdir -p "./target/"
cp -L -l ./current_Linux64_source/bin/Release/libViconDataStreamSDK_CPP.so ./target/
cp -L -l ./current_Linux64_source/Vicon/CrossMarket/DataStream/ViconDataStreamSDK_CPP/*DataStream*Client*.h ./target/
cp -L -l ./current_Linux64_source/thirdparty/Boost/*/installed/lib/libboost_system-mt.so.* ./target/
cp -L -l ./current_Linux64_source/thirdparty/Boost/*/installed/lib/libboost_thread-mt.so.* ./target/

echo "ViconDataStreamSDK generated"

