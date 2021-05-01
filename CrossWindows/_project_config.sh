#!/bin/bash


###########################
#needed by ./bash_config.sh
projectDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
projectFolderName="${projectDir##*/}"
###########################


#Project Definitions
###########################
platform="Windows64"
localTmp="./target/_tmp/$platform"
localTarget="./target/$platform"
WrapperDir="$projectDir/Wrapper"
ViconDir="$projectDir/DataStreamSDK_1.10"
ViconLibDir="$ViconDir"
ViconIncludeDir="$ViconDir"
javaIncludeDir="$projectDir/jdk/include"

