#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

./clear.sh

mkdir -p "./target/java/de/dhbw/rahmlab/vicon/datastream/impl/"

cat PlatformIndependent.i >> ./target/genLinux.i
cat Linux.patch >> ./target/genLinux.i

#-debug-tmsearch
swig -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.impl -outdir "./target/java/de/dhbw/rahmlab/vicon/datastream/impl" -o ./target/ViconDataStreamSDK_wrap.cpp ./target/genLinux.i

echo "swig finished"

