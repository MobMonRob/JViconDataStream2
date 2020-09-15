#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

mkdir -p "../JViconDataStream/src/main/java/de/dhbw/rahmlab/vicon/datastream/impl/"

cat PlatformIndependent.i >> genLinux.i
cat Linux.patch >> genLinux.i

#-debug-tmsearch
swig -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.impl -outdir "../JViconDataStream/src/main/java/de/dhbw/rahmlab/vicon/datastream/impl" -o ViconDataStreamSDK_wrap.cpp genLinux.i

echo "swig finished"