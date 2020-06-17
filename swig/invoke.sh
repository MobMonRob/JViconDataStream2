#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

mkdir "../JViconDataStreamTest/src/main/java/de/dhbw/mobmonrob/vicon/datastreamapi/impl/"

cat PlatformIndependent.i >> genLinux.i
cat Windows.patch >> genLinux.i

swig -Wall -c++ -java -package de.dhbw.mobmonrob.vicon.datastreamapi.impl -outdir "../JViconDataStreamTest/src/main/java/de/dhbw/mobmonrob/vicon/datastreamapi/impl" -o ViconDataStreamSDK_wrap.cpp genLinux.i
echo "SWIG finished"

