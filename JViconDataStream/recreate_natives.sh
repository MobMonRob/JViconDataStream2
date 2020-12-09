#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear.sh

../Linux64/generate.sh

#Has to be: <Project Folder>/natives/<os-arch> !!
mkdir -p ./natives/linux-amd64/
cp ../Linux64/target/*.so* ./natives/linux-amd64/
cp ../Linux64/DataStreamSDK_1.10/*.so* ./natives/linux-amd64/

cp -R ../swig/target/java/de/ ./src/main/java/

echo "recreate_natives finished"

