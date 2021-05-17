#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	local -r viconTarget="$ViconDir/$localTarget"
	local -r swigJavaOutDir="$localTarget/java/de/dhbw/rahmlab/vicon/datastream/impl/"

	mkdir -p "$swigJavaOutDir"
	mkdir -p "$localTmp"

	#-debug-tmsearch
	swig -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.impl -outdir "$swigJavaOutDir" -o "$localTmp/ViconDataStreamSDK_wrap.cpp" -I"$viconTarget" ./PlatformIndependent.i
}

run_bash run $@

