#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

localTmp="./target/_tmp/Linux64"
localTarget="./target/Linux64"
viconTarget="../ViconDataStreamSDK/target/Linux64"
swigJavaOutDir="$localTarget/java/de/dhbw/rahmlab/vicon/datastream/impl/"

mkdir -p "$swigJavaOutDir"
mkdir -p "$localTmp"

#-debug-tmsearch
swig -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.impl -outdir "$swigJavaOutDir" -o "$localTmp/ViconDataStreamSDK_wrap.cpp" -I"$viconTarget" ./PlatformIndependent.i

echo "swig wrapper generation finished"

