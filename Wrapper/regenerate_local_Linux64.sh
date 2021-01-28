#!/bin/bash

scriptPath="$(realpath "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	local -r viconLibDir="$ViconDir/$localTarget"

	./clear_local_all.sh

	./generate-wrapper_local_Linux64.sh

	./generate-so_local_Linux64.sh

	cp -L -l $viconLibDir/lib* $targetDir
}

run_bash run $@

