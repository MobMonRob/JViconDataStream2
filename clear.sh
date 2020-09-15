
#!/bin/bash

cd "$(dirname "$BASH_SOURCE")"

#remove ignored files and folders
git ls-files -c -o -i --exclude-standard --directory -z| xargs -0 rm -r &> /dev/null

echo "JViconDataStream2 cleared"