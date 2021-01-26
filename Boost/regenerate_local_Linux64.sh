#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

./clear_local_all.sh

./download-boost_local_Linux64.sh

./regenerate-soft_local_Linux64.sh

echo "Boost regenerated local"

