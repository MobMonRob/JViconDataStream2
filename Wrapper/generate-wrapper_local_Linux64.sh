#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

mkdir -p "./target/Linux64/java/de/dhbw/rahmlab/vicon/datastream/impl/"

#-debug-tmsearch
swig -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.impl -outdir "./target/Linux64/java/de/dhbw/rahmlab/vicon/datastream/impl" -o ./target/Linux64/ViconDataStreamSDK_wrap.cpp -I../ViconDataStreamSDK/target/Linux64/ ./PlatformIndependent.i

echo "swig wrapper generation finished"

