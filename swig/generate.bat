@echo off

cd %~dp0

call "clear.bat"

md "..\JViconDataStream\src\main\java\de\dhbw\rahmlab\vicon\datastream\impl\" > nul 2> nul

type PlatformIndependent.i >> genWindows.i
type Windows.patch >> genWindows.i

swig -Wall -c++ -java -package de.dhbw.rahmlab.vicon.datastream.impl -outdir "..\JViconDataStream\src\main\java\de\dhbw\rahmlab\vicon\datastream\impl" -o ViconDataStreamSDK_wrap.cpp genWindows.i

echo SWIG finished
