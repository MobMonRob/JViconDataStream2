#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	if [ ! -d "$localTarget" ]
	then
		#bash "$ViconDir/ensure_dependency-recursive_$platform.sh"

		bash "./regenerate_local_$platform.sh"
	fi
}

run_bash run $@

