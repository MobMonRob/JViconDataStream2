#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	local -r viconTarget="$viconDir/$currentTarget"
	local -r swigJavaOutDir="$currentTarget/java/de/dhbw/rahmlab/vicon/datastream/impl/"

	mkdir -p "$swigJavaOutDir"
	mkdir -p "$currentTmp"

	#-debug-tmsearch
	swig -doxygen -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.impl -outdir "$swigJavaOutDir" -o "$currentTmp/ViconDataStreamSDK_wrap.cpp" -I"$viconTarget" ./PlatformIndependent.i
}

run_bash run $@

