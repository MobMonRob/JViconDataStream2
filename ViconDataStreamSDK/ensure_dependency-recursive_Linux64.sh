#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

if [ ! -d "./target/Linux64/" ]
then
	../Boost/ensure_dependency-recursive_Linux64.sh

    ./regenerate_local_Linux64.sh
fi

echo "ViconDataStreamSDK ensured"

