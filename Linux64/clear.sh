#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

git clean -d -f -X &> /dev/null

../swig/clear.sh
../JViconDataStream/clear.sh

