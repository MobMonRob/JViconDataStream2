@echo off

call "clear.bat"

md "..\JViconDataStreamTest\src\main\java\de\dhbw\mobmonrob\vicon\datastreamapi\impl\" > nul 2> nul

swig -c++ -java -package de.dhbw.mobmonrob.vicon.datastreamapi.impl -outdir "..\JViconDataStreamTest\src\main\java\de\dhbw\mobmonrob\vicon\datastreamapi\impl" -o "..\swig\ViconDataStreamSDK_wrap.cpp" ViconDataStreamSDK.i

echo SWIG invoked

