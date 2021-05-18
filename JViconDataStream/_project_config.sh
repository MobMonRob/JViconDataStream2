#!/bin/bash

readonly projectDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
readonly wrapperDir="$projectDir/../Wrapper"

#Has to be: <Project Folder>/natives/<os-arch> !!
readonly linuxNativesPath="./natives/linux-amd64"
readonly windowsNativesPath="./natives/windows-amd64"
if [[ "$currentPlatform" == "$platformLinux" ]]; then
	readonly currentNativesPath="$linuxNativesPath"
elif [[ "$currentPlatform" == "$platformWindows" ]]; then
	readonly currentNativesPath="$windowsNativesPath"
else
	echo "Error: currentPlatform=$currentPlatform not supported."
	exit 1
fi

