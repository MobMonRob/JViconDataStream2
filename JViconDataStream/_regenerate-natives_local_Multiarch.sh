#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	./_clear_local_all.sh

	./copy-deps_Multiarch.sh

	setSuccessToken
}

run_bash run $@

