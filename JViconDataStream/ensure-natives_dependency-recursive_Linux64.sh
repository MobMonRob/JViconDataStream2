#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

if [ ! -d "./natives/linux-amd64/" ]
then
	../Wrapper/ensure_dependency-recursive_Linux64.sh

    ./regenerate-natives_local_Linux64.sh
fi

echo "ensure-natives finished"

