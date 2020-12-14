#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear_local_all.sh

./generate_wrapper.sh

./generate_so.sh

echo "Wrapper finished"

