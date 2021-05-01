#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	./clear_local_all.sh

	bash "./generate-wrapper_local_$platform.sh"

	bash "./generate-so_local_$platform.sh"

	cp -L -l $viconLibDir/*.dll $localTarget
	cp -L -l $viconLibDir/*.lib $localTarget
}

run_bash run $@

