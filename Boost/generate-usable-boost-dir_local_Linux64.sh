#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

boostRepoRoot="./target/_tmp/Linux64/boost"
targetDir="./target/Linux64/"

rm -rdf "$targetDir"

mkdir -p "$targetDir"
cp -u -r -L -l $boostRepoRoot/stage/lib "$targetDir"

mkdir -p "$targetDir/include/boost"
cp -u -r -L -l $boostRepoRoot/boost "$targetDir/include"

echo "Boost generated"

