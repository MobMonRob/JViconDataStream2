#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

../clear_local_all.sh

mkdir -p "../target/_tmp/Linux64/"

cd "../target/_tmp/Linux64/"

cmake ../../../CmakeBuild/
make --jobs="$((2*"$(nproc)"))"

cd "$scriptDir"

mkdir -p "../target/Linux64/"

cp -L -l ../target/_tmp/Linux64/libViconDataStreamSDK_CPP.so ../target/Linux64/

cp -L -l ../current_Linux64_source/Vicon/CrossMarket/DataStream/ViconDataStreamSDK_CPP/*DataStream*Client*.h ../target/Linux64/

cp -L -l ../current_Linux64_source/thirdparty/Boost/*/installed/lib/libboost_system-mt.so.* ../target/Linux64/

cp -l ../ViconStringTest.h ../target/Linux64/

echo "ViconDataStreamSDK regenerated"

