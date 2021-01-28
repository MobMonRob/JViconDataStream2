#!/bin/bash

scriptPath="$(realpath "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	if [ ! -d "./target/Linux64/" ]
	then
		../ViconDataStreamSDK/ensure_local_Linux64.sh

		./regenerate_local_Linux64.sh
	fi
}

run_bash run $@

