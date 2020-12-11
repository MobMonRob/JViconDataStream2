#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear.sh

../ViconDataStreamSDK/generate.sh

mkdir -p "./target/java/de/dhbw/rahmlab/vicon/datastream/impl/"

#-debug-tmsearch
swig -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.impl -outdir "./target/java/de/dhbw/rahmlab/vicon/datastream/impl" -o ./target/ViconDataStreamSDK_wrap.cpp -I../ViconDataStreamSDK/target/ ./PlatformIndependent.i

echo "swig finished"

