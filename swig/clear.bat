@echo off

cd %~dp0

del /q *.cpp > nul 2> nul
del /q gen*.i > nul 2> nul

RD /S /Q "..\JViconDataStreamTest\src\main\java\de\dhbw\rahmlab\vicon\datastream\api\impl\" > nul 2> nul

