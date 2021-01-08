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

cp -L -l ../target/_tmp/Linux64/libViconDataStreamSDK_CPP.* ../target/Linux64/

###Test
cp -L -l ../current_Linux64_source/thirdparty/Boost/*/installed/lib/*.a ../target/Linux64/

#Statisch gelinkte files in eine shared lib linken. Innerhalb CMake gibt es Probleme.
gcc -fPIC -O3 -flto -Wl,--unresolved-symbols=ignore-in-object-files -o ../target/Linux64/libViconDataStreamSDK.so -L../target/Linux64/ -Wl,--whole-archive -lViconDataStreamSDK_CPP -lboost_system -lboost_thread -Wl,--no-whole-archive -pthread -Wl,-rpath,'$ORIGIN/.' -rdynamic

rm ../target/Linux64/*.a

cp -L -l ../current_Linux64_source/Vicon/CrossMarket/DataStream/ViconDataStreamSDK_CPP/*DataStream*Client*.h ../target/Linux64/

#cp -L -l ../current_Linux64_source/thirdparty/Boost/*/installed/lib/libboost_system-mt.so.* ../target/Linux64/

cp -l ../ViconStringTest.h ../target/Linux64/

echo "ViconDataStreamSDK regenerated"

