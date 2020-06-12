@echo off

cd %~dp0

del /q *.cpp > nul 2> nul

RD /S /Q "..\JViconDataStreamTest\src\main\java\de\dhbw\mobmonrob\vicon\datastreamapi\impl\" > nul 2> nul

