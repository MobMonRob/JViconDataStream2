#!/bin/bash

scriptPath="$(realpath -s "${BASH_SOURCE[0]}")"
scriptDir="$(dirname "$scriptPath")"
cd "$scriptDir"

source "./_bash_config.sh"

run() {
	./clear_local_all.sh

	#Has to be: <Project Folder>/natives/<os-arch> !!
	mkdir -p ./natives/linux-amd64/

	cp -L -l ../Wrapper/target/Linux64/*.so* ./natives/linux-amd64/

	cp -L -l -R ../Wrapper/target/Linux64/java/de/ ./src/main/java/
}

run_bash run $@

