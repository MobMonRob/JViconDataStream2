#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

../Wrapper/regenerate_dependency-recursive_Linux64.sh

./regenerate-natives_local_Linux64.sh

echo "regenerate-natives finished"

