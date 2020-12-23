#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear_local_all.sh

./generate-wrapper_local_Linux64.sh

./generate-so_local_Linux64.sh

mkdir -p "./target/Linux64/ViconDataStreamSDK/"
cp -L -l ../ViconDataStreamSDK/target/Linux64/*.so* ./target/Linux64/ViconDataStreamSDK/

echo "Wrapper regenerated"

