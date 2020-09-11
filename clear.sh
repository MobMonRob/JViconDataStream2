#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

git ls-files -ci --exclude-standard -z | xargs -0 git rm &> /dev/null

