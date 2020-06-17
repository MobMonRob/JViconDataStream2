#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

rm -f *.cpp
rm -f gen*.i

rm -rdf "../JViconDataStreamTest/src/main/java/de/dhbw/mobmonrob/vicon/datastreamapi/impl/"

