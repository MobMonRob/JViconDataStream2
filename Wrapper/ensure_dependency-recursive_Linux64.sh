#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

if [ ! -d "./target/Linux64/" ]
then
	../ViconDataStreamSDK/ensure_local_Linux64.sh

    ./regenerate_local_Linux64.sh
fi

echo "Wrapper ensured"

