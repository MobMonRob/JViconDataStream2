#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

rm -r "./target/"

mkdir -p "./target/_tmp/"

cd "./target/_tmp/"

cmake ../..

make --jobs="$((2*"$(nproc)"))"

