#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

git clean -d -f -X &> /dev/null
git ls-files -c -o -i --exclude-standard -z| xargs -0 rm -r &> /dev/null

