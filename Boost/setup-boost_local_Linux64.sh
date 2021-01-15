#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

boostLibDir="./target/_tmp/Linux64/boost"

cd "$boostLibDir"

./bootstrap.sh

./b2 -a --jobs="$((2*"$(nproc)"))" --toolset=gcc architecture=x86 address-model=64 target-os=linux optimization=speed define=flto cxxflags=-fPIC variant=release threading=multi link=static runtime-link=shared stage

cd "$scriptDir"

echo "Boost setup"

