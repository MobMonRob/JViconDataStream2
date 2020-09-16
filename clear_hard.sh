#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

#remove untracked files and folders
git clean -d -f &> /dev/null

#remove ignored files and folders
git ls-files -c -o -i --exclude-standard --directory -z| xargs -0 rm -r &> /dev/null

echo "JViconDataStream2 cleared"
