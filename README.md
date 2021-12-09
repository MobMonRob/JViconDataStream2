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
* Kubuntu 20.04 x64 LTS
* git 2.25.1: `sudo apt install git`
* g++ 9.3.0: `sudo apt install build-essential`
* x86_64-w64-mingw32-g++ 9.3: `sudo apt install mingw-w64 mingw-w64-tools`
* CMake 3.16.3 `sudo apt install cmake`
* SWIG 4.0.1 (3.x does not work!) `sudo apt install swig`
* openjdk 11 LTS: `sudo apt install openjdk-11-jdk openjdk-11-demo openjdk-11-doc openjdk-11-jre-headless openjdk-11-source`
* Snap 2.51.7 `sudo apt install snap`
* Netbeans 12.0 LTS `sudo snap install netbeans --channel=12.0/stable --classic`


## Prepare build
Ensure you checked out all needed submodules properly. To do that, open a terminal and execute `./_git_pull_remote_super_repo_with_current_submodules.sh`.
Sometimes the previous command fails silently. It is therefore recommended to have a look into the submodule folders to ensure they are properly filled. If this is not the case, try to delete the respective submodule folder an re-run the command.

Build the Netbeans Maven project `./JNativeLibLoader/NativeLibLoader`. You will need to rebuild it if it's codebase has changed and if you want to use the changes in JViconDataStream2.


## How to build
Open and build the Netbeans Maven project `./JViconDataStream`.

The deployable jar should now be in the following path: `./JViconDataStream/target/JViconDataStream-1.0-SNAPSHOT-jar-with-dependencies.jar`.


## Problems, Details, Developer information
If Netbeans ignores the automatically generated java files, it helps to deactivate git within the IDE: Navigate `Tools -> Plugins -> Installed -> Show Details`, Select `Git`, right-click on it and click `Deactivate`.

If something is wrong with native lib loading, writing log messages can be switched on in the class `de.dhbw.rahmlab.vicon.datastream.nativelib.NativeLibLoader`. Set the parameter given in the method `de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader.init(false)` from `false` to `true`. It can be found inside the method
`private static void loadActually()`.

For more details be free to consult the README's in the folder of the subprojects.

More Developer Info [here](DEVELOPER_INFO.md).

## How to Use
