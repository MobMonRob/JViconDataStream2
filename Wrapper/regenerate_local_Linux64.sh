#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

targetDir="./target/Linux64"
viconLibDir="../ViconDataStreamSDK/target/Linux64"

./clear_local_all.sh

./generate-wrapper_local_Linux64.sh

./generate-so_local_Linux64.sh

cp -L -l $viconLibDir/lib* $targetDir

echo "Wrapper regenerated"

