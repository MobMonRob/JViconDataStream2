#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

# Dependencies beforehand

# We usually don't want to redownload boost.
# Use ./clear_local_all.sh instead if necessary.
if [[ ! -d "./target/_tmp/Linux64/boost" ]]; then
    ./regenerate_local_Linux64.sh

else
	./regenerate-soft_local_Linux64.sh
fi

echo "Boost regenerated dependency-recursive"

