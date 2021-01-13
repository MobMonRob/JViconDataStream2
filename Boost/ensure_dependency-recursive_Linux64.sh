#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

if [ ! -d "./target/Linux64/" ]
then
	# Dependencies here

    ./regenerate_local_Linux64.sh
fi

echo "Boost src ensured dependency-recursive"

