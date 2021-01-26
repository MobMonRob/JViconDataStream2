#!/bin/bash

scriptDir="$(dirname "$(readlink -f "${BASH_SOURCE[0]}")")"
cd "$scriptDir"

localTmp="$(realpath "./target/_tmp/Linux64")"
localTarget="$(realpath "./target/Linux64")"
boostDir="$localTmp/boost"
stageDir="$localTmp/stage"
buildDir="$localTmp/build"
boostLibDir="$stageDir/lib"

build_boost() {
cd "$boostDir"

if [[ ! -e "./b2" ]]; then
	echo "booststrapping..."
	./bootstrap.sh
else
	echo "cleaning..."
	#rm -rdf "$stageDir"
	#rm -rdf "$buildDir"
	rm -rdf "$boostLibDir"
fi

#-q to stop at first error
#1 target fails but seems to be not important for us.
./b2 --jobs="$((3*"$(nproc)"))" --layout=tagged --toolset=gcc architecture=x86 address-model=64 target-os=linux optimization=speed cflags="-fPIC -flto" cxxflags="-fPIC -flto" variant=release threading=multi link=static runtime-link=shared --stagedir="$stageDir" --build-dir="$buildDir" variant=release stage

cd "$scriptDir"
}
build_boost

link_so() {
rm -f $boostLibDir/*test*.a

boostLibs=$(find "$boostLibDir" -maxdepth 1 -mindepth 1 -type f)

gcc -shared -flto -pthread -Wl,--whole-archive -Wl,--start-group $boostLibs -Wl,--end-group -Wl,--no-whole-archive -o "$localTarget/libboost.so"
}
link_so


echo "Boost setup"

