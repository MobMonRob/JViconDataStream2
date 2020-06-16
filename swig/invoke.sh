#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

mkdir "../JViconDataStreamTest/src/main/java/de/dhbw/mobmonrob/vicon/datastreamapi/impl/"

swig -Wall -c++ -java -package de.dhbw.mobmonrob.vicon.datastreamapi.impl -outdir "../JViconDataStreamTest/src/main/java/de/dhbw/mobmonrob/vicon/datastreamapi/impl" -o "../swig/ViconDataStreamSDK_wrap.cpp" ViconDataStreamSDK.i

echo "SWIG finished"

