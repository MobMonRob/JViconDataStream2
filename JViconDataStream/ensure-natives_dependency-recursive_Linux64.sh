#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	if [ ! -d "./natives/linux-amd64/" ]
	then
		../Wrapper/ensure_dependency-recursive_Linux64.sh

		./regenerate-natives_local_Linux64.sh
	fi
}

run_bash run $@

