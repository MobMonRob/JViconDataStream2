#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	./_clear_local_all.sh

	./generate-wrapper_Multiarch.sh

	bash "./generate-dynlib_$currentPlatform.sh"

	./copy-deps_Multiarch.sh

	if [[ "$currentPlatform" == "$platformWindows" ]]; then
		./copy-mingW-deps_Windows64.sh
	fi
}

run_bash run $@

