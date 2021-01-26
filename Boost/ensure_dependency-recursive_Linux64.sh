#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

if [[ ! -d "./target/_tmp/Linux64/boost" ]]; then
	# Dependencies here

    ./regenerate_local_Linux64.sh

elif [[ ! -d "./target/Linux64" ]]; then
	./regenerate-soft_local_Linux64.sh
fi

echo "Boost ensured dependency-recursive"

