#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

oldBoostDir="./target/_tmp/Linux64/boost"
newBoostDir="./target/Linux64/boost"

rm -rdf "$newBoostDir"

mkdir -p "$newBoostDir"

src() {
for libpath in `find "$oldBoostDir/libs" -maxdepth 1 -mindepth 1 -type d`; do
	#includes_old "$libpath"

	#cpp files
	libname=$(basename $libpath)
	oldSrcDir="$libpath/src"
	newSrcDir="$newBoostDir/$libname"
	if [[ -e  "$oldSrcDir" ]]; then
		mkdir -p "$newSrcDir"
		cp -u -r -L -l $oldSrcDir/* "$newSrcDir"
		#echo "fi" &>/dev/null
	fi
done
}

includes_old() {
	local -r libpath="$1"

	libname=$(basename $libpath)
	oldIncludeDir="$libpath/include/boost"
	if [[ -e  "$oldIncludeDir" ]]; then
		cp -u -r -L -l $oldIncludeDir/* "$newBoostDir"
		#echo "fi" &>/dev/null
	fi

}
src


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
		cp -r -L -l $oldIncludeDir/* "$newBoostDir"
		#echo "fi" &>/dev/null
	fi

	includes_rekursive "$subFolderPath"
done
}
includes_rekursive "$oldBoostDir/libs"


echo "Boost dir generated"

