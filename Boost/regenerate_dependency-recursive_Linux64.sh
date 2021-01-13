#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

# Dependencies bevore

# Will take too long. Without benefit. Delete ./target/ by hand if needed.
#./regenerate_local_Linux64.sh
./ensure_dependency-recursive_Linux64.sh

echo "Boost src regenerated dependency-recursive"

