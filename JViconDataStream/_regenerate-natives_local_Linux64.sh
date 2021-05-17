#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	./_clear_local_all.sh

	#Has to be: <Project Folder>/natives/<os-arch> !!
	mkdir -p ./natives/linux-amd64/
	#windows-amd64

	local -r WrapperTarget="$(realpath "$wrapperDir/$linuxTarget")"

	cp -L -l $WrapperTarget/*.so* ./natives/linux-amd64/

	cp -L -l -R $WrapperTarget/java/de/ ./src/main/java/
}

run_bash run $@

