#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	mkdir -p $currentNativesPath

	local -r WrapperTarget="$(realpath "$wrapperDir/$currentTarget")"

	cp -L -l $WrapperTarget/lib* $currentNativesPath

	cp -L -l -R $WrapperTarget/java/de/ ./src/main/java/
}

run_bash run $@

