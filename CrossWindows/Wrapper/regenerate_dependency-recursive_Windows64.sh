#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	#bash "$ViconDir/regenerate_dependency-recursive_$platform.sh"

	bash "./regenerate_local_$platform.sh"
}

run_bash run $@

