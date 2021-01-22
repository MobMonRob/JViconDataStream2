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


#localTmp="../target/_tmp/Linux64"
#localTarget="../target/Linux64"
#boostLibPath="../../Boost/target/Linux64/lib"

#boostLibs=$(find "$boostLibPath" -maxdepth 1 -mindepth 1 -type f)

#-fPIC -O3 -flto
#gcc -shared -pthread -Wl,--start-group -Wl,--whole-archive "$localTmp/libViconDataStreamSDK_CPP.a" -Wl,--no-whole-archive $boostLibs -Wl,--end-group -o "$localTarget/libViconDataStreamSDK.so"


cp -L -l ../target/_tmp/Linux64/lib* ../target/Linux64/

cp -L -l ../current_Linux64_source/Vicon/CrossMarket/DataStream/ViconDataStreamSDK_CPP/*DataStream*Client*.h ../target/Linux64/

cp -l ../ViconStringTest.h ../target/Linux64/

echo "ViconDataStreamSDK regenerated"

