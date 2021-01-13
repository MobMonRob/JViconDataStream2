#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

# Dependencies bevore

./regenerate_local_Linux64.sh

echo "Boost src regenerated dependency-recursive"

