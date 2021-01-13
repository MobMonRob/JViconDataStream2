#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

../Boost/regenerate_dependency-recursive_Linux64.sh

./regenerate_local_Linux64.sh

echo "Boost src regenerated dependency-recursive"

