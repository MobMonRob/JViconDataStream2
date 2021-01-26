#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

boostRepoRoot="./target/_tmp/Linux64/boost"
targetDir="./target/Linux64"
targetIncludeDir="$targetDir/include/boost"

## Naive copying is not sufficient - unclear why some files are missing in that case.
## Workaround:
rm -rdf "$targetIncludeDir"
mkdir -p "$targetIncludeDir"
includes_rekursive()
{
	local folder="$1"

	if [[ ! -e  "$folder" ]]; then
		return
	fi

	local folderPath=$(find "$folder" -maxdepth 1 -mindepth 1 -type d)

for subFolderPath in $folderPath; do
	local subFolderName=$(basename $subFolderPath)
	local oldIncludeDir="$subFolderPath/include/boost/"

	if [[ -e  "$oldIncludeDir" ]]; then
		echo $oldIncludeDir
		cp -r -L -l $oldIncludeDir/* "$targetIncludeDir"
		#echo "fi" &>/dev/null
	fi

	includes_rekursive "$subFolderPath"
done
}
includes_rekursive "$boostRepoRoot/libs"


echo "Boost includes generated"

