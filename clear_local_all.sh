#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	#remove untracked AND ignored files and folders &> /dev/null
	git clean -d -ff -X 

	#remove ignored tracked files and folders
	git ls-files -i --exclude-standard --directory -z| xargs -0 rm -r -f 
}

run_bash run $@

