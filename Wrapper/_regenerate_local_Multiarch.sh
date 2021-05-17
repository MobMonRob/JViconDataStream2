#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	./_clear_local_all.sh

	./generate-wrapper_Linux64.sh

	./generate-so_Linux64.sh

	local -r viconLibDir="$viconDir/$currentTarget"
	cp -L -l $viconLibDir/lib* $currentTarget
}

run_bash run $@

