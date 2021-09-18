**Before you start to do anything, please read the whole document!**


## How to update?
After each step in which you change code, test it and fix occuring errors. Beginn with the deepest dependency and work forward till the deepest dependant subproject/folder. If you mess up the sequence, it will be harder to fix errors! Of course somethimes you have to go back to fix an error that is only visible in a subsequent step. :)

[Download](https://www.vicon.com/software/datastream-sdk/?section=downloads) the newest Vicon DataStream SDK.

* CustomBoostBuild: Change the version in `_project_config.sh` so that it meets the requirement of the new SDK.
* ViconDataStreamNative: Replace the old source code with the new one. Remove every other path than `Linux64/source/Vicon`. Remove test folders. Update Link “current_Vicon_source”
* Wrapper: Just test and fix.
* JViconDataStream: Test, fix and then update the facade.


## How to test?
...if current subproject works? \
Execute the `_regenerate_local_Multiarch.sh` script within the respective folder of the current subproject.

...if current subproject and it's dependencies work? \
Execute the `_regenerate_dependency-recursive_Multiarch.sh` script within the respective folder of the current subproject.


## How to switch the target OS?
**Lokal build** \
Change the `standardPlatform` variable in the `_platform_config.sh` file.

**In a script** \
Use `changePlatformTo "$platformLinux"` or `changePlatformTo "$platformWindows"` and then run `_ensure_dependency-recursive_Multiarch.sh`.


## How to recognize and fix problems
Sometimes obscure problems can be solved when you clear generated files.

Java files with the name `SWIGTYPE[...].java` mean that SWIG failed to generate a proper wrapper for a type. You have to fix that! You can find the classes which uses that type with the `Find usages` functionality of netbeans. In such a situation it is helpful to inspect the C++ Version of the class which uses the type that cannot be wrapped. Depending on the underlying problem, SWIG offers different ways to fix this. Just consult the swig documentation. The fixes have to be implemented in “PlatformIndependent.i” in which you can find examples for such fixes (%shared_ptr, %rename, %template).

The reason for linking errors can sometimes be found if you analyze the generated artifacts. \
\- .dll: x86_64-w64-mingw32-objdump \
\- .so: nm, readelf, ldd, objdump

Sometimes the reason for a linker error is just that a necessary file was not compilated.

Keep in mind that new versions of Vicon DataStream SDK could need additional prebuild Boost libraries. Only those Boost libs are currently built which the current version depends on.


## What do the recurring names of some files and folders mean?
They are part of a little Bash build system.

Please do not mess up with the logic if you change something. If so, do it consistently everywhere and update the documentation.


#### Definitions
A (sub-)project is every ordinary folder or git submodule which contains `_bash_config.sh`, `_platform_config.sh` and `_project_config.sh` as ordinary files and not links.


#### Folders
`<Project>/target/<Platform>/` contains files which the respective project offers and other projects can depend on. \
`<Project>/target/_tmp/<Platform>/` contains temporary files of the respective project.

`<Project>/_dependencies/` contains links to all other projects the respective project depends on.


#### Scripts
Scripts that begin with `_` are part of the build system. They can mutually depend on each other between different projects. \
Scripts that begin with a letter implement project specific routines.

`_bash_config.sh` enables better logging, error handling and other black magic. \
`_platform_config.sh` sets some variables that are needed to build the platform specific files correctly. \
These both files should be identical in all projects.

`_project_config.sh` sets variables which are specific for a project.


#### Script name affixes
**1. part** \
ensure: only regenerate, if current project files are not present. \
regenerate: regenerate always. \
**2. part** \
local: Only code within the current project will be executed. \
dependency-recursive: Code of dependencies will be executed beforehand. \
**3. part** \
Multiarch: Supports multiple platforms. \
Linux64/Windows64: Contains code for the respective platform only. \
Noarch: Code which does not depend on the target platform.


## Boost information
boost::thread uses win32 threading model internally for Windows target. \
std::thread needs posix threading model used in mingw-w64 g++ to work. \
Vicon DataStream SDK uses boost::thread and std::thread. \
Since they are separated by means of the type system there should not be the hazard to mess them up.
But if so then random and difficult to debug run time errors would show up. \
https://stackoverflow.com/questions/17242516/mingw-w64-threads-posix-vs-win32

Most Boost libs are Header only. (V. 1.66!) \
https://www.boost.org/doc/libs/1_66_0/more/getting_started/unix-variants.html#header-only-libraries

How to build the boost threading lib (V. 1.66!) \
https://www.boost.org/doc/libs/1_66_0/doc/html/thread/build.html

