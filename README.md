## Description
JViconDataStream2 is a java wrapper for [Vicon DataStream SDK 1.10.0](https://www.vicon.com/software/datastream-sdk/?section=downloads).

It is easy and fast to update the project to a newer version of the SDK.

Supported target systems: Linux x86-64, Windows x86-64 (via preconfigured cross-compilation) \
Supported build systems: Linux


## Features
* A neat manually optimized java facade around automatically generated java wrap code.
* Easy deployment with a single jar file.

## Limitations 
* Untested API methods: setApexDeviceFeedback(), getGreyscaleBlob(), get/setEyeTracker...(), configureWireless()
* SetTimingLogFile() is not supported

## Tested prerequisites
* Kubuntu 18.04 x64
* git 2.17.1: `sudo apt install git`
* (optional) dolphin git integration: `sudo apt install dolphin-plugins`
* openjdk 11: `sudo apt install openjdk-11-jdk openjdk-11-demo openjdk-11-doc openjdk-11-jre-headless openjdk-11-source`
* g++ 7.5.0: `sudo apt install build-essential`
* g++-mingw-w64-x86-64 7.3.0: `sudo apt install mingw-w64 mingw-w64-tools`
* PCRE Library (for SWIG wrapper): `sudo apt install libpcre3 libpcre3-dev`
* [SWIG 4.0.1](http://www.swig.org/download.html)
    * `cd ./swig-4.0.1`
    * `./configure`
    * `make`
    * `sudo make install`
    * SWIG 3.x does not work
    * please refer: https://github.com/swig/swig/wiki/Getting-Started
* [Netbeans 12 LTS](https://netbeans.apache.org/download/nb120/nb120.html)


## Prepare build
Ensure you checked out all needed submodules properly. To do that, open a terminal and execute `./_git_pull_remote_super_repo_with_current_submodules.sh`.

Build the Netbeans Maven project `./JNativeLibLoader/NativeLibLoader`. You will need to rebuild it if it's codebase has changed and if you want to use the changes in JViconDataStream2.


## How to build
Open and build the Netbeans Maven project `./JViconDataStream`.

The deployable jar should now be in the following path: `./JViconDataStream/target/JViconDataStream-1.0-SNAPSHOT-jar-with-dependencies.jar`.


## Problems, Details, Developer information
If Netbeans ignores the automatically generated java files, it helps to deactivate git within the IDE: Navigate `Tools -> Plugins -> Installed -> Show Details`, Select `Git` and click `Disable`.

For more details be free to consult the README's in the subfolders.

More Developer Info [here](DEVELOPER_INFO.md).

