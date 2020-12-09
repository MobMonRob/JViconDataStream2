#!/bin/bash

cd $(dirname "$(readlink -f "${BASH_SOURCE[0]}")")

if [ ! -d "./src/main/java/de/dhbw/rahmlab/vicon/datastream/impl/" ]
then
    ./recreate_natives.sh
fi

echo "ensure_natives finished"

