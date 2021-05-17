#!/bin/bash

readonly projectDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
readonly viconDir="$projectDir/../ViconDataStreamNative"
readonly javaIncludeLinux="/usr/lib/jvm/default-java/include"
readonly javaIncludeWindows="$projectDir/jdk-11.0.11+9/include"
readonly mingwLibPath1="/usr/x86_64-w64-mingw32/lib"
readonly mingwLibPath2="/usr/lib/gcc/x86_64-w64-mingw32/7.3-posix"

