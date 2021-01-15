#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

boostLibDir="./target/_tmp/Linux64/boost"

$boostLibDir/bootstrap.sh

$boostLibDir/b2 -a --jobs="$((2*"$(nproc)"))" --toolset=gcc architecture=x86 address-model=64 target-os=linux optimization=speed define=flto variant=release threading=multi link=static runtime-link=shared stage

echo "Boost setup"

