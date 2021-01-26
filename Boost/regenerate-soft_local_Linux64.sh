#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

targetDir="./target/Linux64"
rm -rdf "$targetDir"
mkdir -p "$targetDir"

./setup-boost_local_Linux64.sh

./generate-usable-boost-dir_local_Linux64.sh

echo "Boost soft regenerated local"

