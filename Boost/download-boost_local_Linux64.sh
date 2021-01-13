#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

boostLibDir="./target/_tmp/Linux64/boost"

mkdir -p "$boostLibDir"

git clone https://github.com/boostorg/boost.git --branch=boost-1.58.0 --depth=1 --recursive -j8 --shallow-submodules "$boostLibDir"

echo "Boost src downloaded"

