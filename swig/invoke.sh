#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

mkdir -p "../JViconDataStream/src/main/java/de/dhbw/rahmlab/vicon/datastream/api/impl/"

cat PlatformIndependent.i >> genLinux.i
cat Windows.patch >> genLinux.i

swig -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.api.impl -outdir "../JViconDataStream/src/main/java/de/dhbw/rahmlab/vicon/datastream/api/impl" -o ViconDataStreamSDK_wrap.cpp genLinux.i
echo "SWIG finished"

