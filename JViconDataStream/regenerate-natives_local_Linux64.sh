#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear_local_all.sh

#Has to be: <Project Folder>/natives/<os-arch> !!
mkdir -p ./natives/linux-amd64/

cp ../Wrapper/target/Linux64/*.so* ./natives/linux-amd64/
cp ../ViconDataStreamSDK/target/Linux64/*.so* ./natives/linux-amd64/

cp -R ../Wrapper/target/Linux64/java/de/ ./src/main/java/

echo "regenerate-natives finished"

