#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

../clear_local_all.sh

targetDir="../target/Linux64"
tmpDir="../target/_tmp/Linux64"
boostLibDir="../../Boost/target/Linux64"

mkdir -p "$tmpDir"

build() {
	cd "$tmpDir"

	cmake ../../../CmakeBuild/
	make --jobs="$((2*"$(nproc)"))"

	cd "$scriptDir"
}
build

mkdir -p "$targetDir"

copy() {
	cp -L -l $boostLibDir/lib* $targetDir
	cp -L -l $tmpDir/lib* $targetDir

	cp -L -l ../current_Linux64_source/Vicon/CrossMarket/DataStream/ViconDataStreamSDK_CPP/*DataStream*Client*.h $targetDir

	cp -L -l ../ViconStringTest.h $targetDir
}
copy


echo "ViconDataStreamSDK regenerated"

