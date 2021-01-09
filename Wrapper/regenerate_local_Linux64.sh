#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear_local_all.sh

./generate-wrapper_local_Linux64.sh

./generate-so_local_Linux64.sh

echo "Wrapper regenerated"

