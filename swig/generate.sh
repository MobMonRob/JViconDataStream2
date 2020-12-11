#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear.sh

../ViconDataStreamSDK/generate.sh

./generate_wrapper.sh

./generate_so.sh

echo "swig finished"

