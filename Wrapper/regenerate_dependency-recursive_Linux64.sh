#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

../ViconDataStreamSDK/regenerate_local_Linux64.sh

./regenerate_local_Linux64.sh

echo "Wrapper regenerated"

