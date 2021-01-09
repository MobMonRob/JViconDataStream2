#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

../clear_local_all.sh

oldBoostDir="../_Boost/boost/libs"
newBoostDir="../target/_tmp/Linux64/boost"

mkdir -p "$newBoostDir"

for libpath in `find $oldBoostDir -maxdepth 1 -mindepth 1 -type d`; do
	libname=$(basename $libpath)

	oldIncludeDir="$libpath/include/boost"
	if [[ -e  "$oldIncludeDir" ]]; then
		cp -r -L -l $oldIncludeDir/* "$newBoostDir"
		#echo "fi" &>/dev/null
	fi

	oldSrcDir="$libpath/src"
	newSrcDir="$newBoostDir/$libname"
	if [[ -e  "$oldSrcDir" ]]; then
		mkdir -p "$newSrcDir"
		cp -r -L -l $oldSrcDir/* "$newSrcDir"
		#echo "fi" &>/dev/null
	fi
done

echo "Boost dir generated"

