@echo off

cd %~dp0

call "clear.bat"

md "..\JViconDataStreamTest\src\main\java\de\dhbw\mobmonrob\vicon\datastreamapi\impl\" > nul 2> nul

type PlatformIndependent.i >> genWindows.i
type Windows.patch >> genWindows.i

swig -Wall -c++ -java -package de.dhbw.mobmonrob.vicon.datastreamapi.impl -outdir "..\JViconDataStreamTest\src\main\java\de\dhbw\mobmonrob\vicon\datastreamapi\impl" -o ViconDataStreamSDK_wrap.cpp genWindows.i

echo SWIG finished

