#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

#remove untracked files and folders
git clean -d -f -x &> /dev/null

#remove ignored tracked files and folders
git ls-files -i --exclude-standard --directory -z| xargs -0 rm -r &> /dev/null

echo "JViconDataStream2 cleared hard"