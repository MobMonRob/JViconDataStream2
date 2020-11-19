#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

if [ ! -d "./src/main/java/de/dhbw/rahmlab/vicon/datastream/impl/" ]
then
    ./recreate_natives.sh
fi

echo "ensure_natives finished"

