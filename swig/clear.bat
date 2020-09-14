@echo off

cd %~dp0

del /q *.cpp > nul 2> nul
del /q gen*.i > nul 2> nul

RD /S /Q "..\JViconDataStream\src\main\java\de\dhbw\rahmlab\vicon\datastream\impl\" > nul 2> nul

