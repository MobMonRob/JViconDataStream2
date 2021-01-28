#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	../Wrapper/regenerate_dependency-recursive_Linux64.sh

	./regenerate-natives_local_Linux64.sh
}

run_bash run $@

