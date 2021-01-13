cmake_minimum_required(VERSION 3.9 FATAL_ERROR)
project(vicon-datastream-sdk
	VERSION 1.10.20200407.123216 #same as Vicon SDK
)

#useful for debugging
#SET(CMAKE_VERBOSE_MAKEFILE ON)

#Vicon SDK file gcc.mk defines this as minimum required version
set (CMAKE_CXX_STANDARD_REQUIRED 14)

set(CMAKE_THREAD_PREFER_PTHREAD TRUE)
set(THREADS_PREFER_PTHREAD_FLAG TRUE)
find_package(Threads REQUIRED)

SET (VICON_ROOT "../current_Linux64_source/Vicon/CrossMarket")
SET (DataStream_ROOT "${VICON_ROOT}/DataStream")
SET (BOOST_ROOT "../../Boost/target/Linux64/")
SET (LIB_TYPE STATIC) #SHARED / STATIC

# Declare a cpp library
add_library(ViconDataStreamSDK_CPP ${LIB_TYPE} ""
)

file(GLOB_RECURSE VICON_SRC FOLLOW_SYMLINKS ${VICON_ROOT} "${VICON_ROOT}/*.cpp")
#file(GLOB_RECURSE BOOST_SRC FOLLOW_SYMLINKS ${BOOST_ROOT} "${BOOST_ROOT}/*.c*")

message("--------------------------------")
message("${GLOB_VAR}")

target_sources(ViconDataStreamSDK_CPP
	PUBLIC
		${DataStream_ROOT}/ViconDataStreamSDK_CPP/IDataStreamClientBase.h
		${DataStream_ROOT}/ViconDataStreamSDK_CPP/DataStreamClient.h
		${DataStream_ROOT}/ViconDataStreamSDK_CPP/DataStreamRetimingClient.h
	PRIVATE
		#${DataStream_ROOT}/ViconDataStreamSDK_CPP/DataStreamClient.cpp
		#${DataStream_ROOT}/ViconDataStreamSDK_CPP/DataStreamRetimingClient.cpp
		${VICON_SRC}
)

target_include_directories(ViconDataStreamSDK_CPP PRIVATE
	"${DataStream_ROOT}"
	"${DataStream_ROOT}/ViconDataStreamSDK_CPP"
	"${DataStream_ROOT}/ViconDataStreamCore"
	"${VICON_ROOT}"
	"${VICON_ROOT}/StreamCommon"
	"${BOOST_ROOT}"
)

target_link_libraries(ViconDataStreamSDK_CPP
  Threads::Threads
)

if (CMAKE_COMPILER_IS_GNUCXX AND CMAKE_CXX_COMPILER_VERSION VERSION_LESS 7.5.0)
    message(FATAL_ERROR "Not tested with gcc version lower than gcc-7.5.0. Change CMakeLists.txt if you can assure a lower version works!")
endif()

if(CMAKE_COMPILER_IS_GNUCXX)
	#taken from Vicon SDK file gcc.mk
	set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -Wno-sign-compare -Wno-unknown-pragmas -Wno-parentheses -Winvalid-pch -Wno-unused-variable -Wno-reorder -Wno-unused-but-set-variable -Wno-unused-function -Wno-deprecated-declarations -Wno-attributes")

	## More Platform independend than -flto
	#include(CheckIPOSupported)
	#check_ipo_supported() # fatal error if IPO is not supported
	#set_property(TARGET ViconDataStreamSDK_CPP PROPERTY INTERPROCEDURAL_OPTIMIZATION TRUE)

	target_compile_options(ViconDataStreamSDK_CPP PRIVATE
		## Own Options
		-fdata-sections
		-ffunction-sections
		-Wl,--gc-sections
		-fPIC
		#-O3
		-flto
		-fwhole-program
		-fvisibility=hidden
		-fvisibility-inlines-hidden
		## Taken from Vicon SDK file gcc.mk
		-m64 #x86_64
		-mfpmath=sse
		#-msse2
		#-fvisibility-inlines-hidden
		#-D_GLIBCXX_HAVE_GTHR_DEFAULT
		-D_GLIBCXX_USE_CXX11_ABI=0
		## Unsafe optimization. Comment out if problems occur.
		-mavx2
		-funroll-loops
		###-Ofast
	)

	if(UNIX AND (${LIB_TYPE} STREQUAL SHARED))
		#possible error source: this sets .so RUNPATH, not RPATH.
		#RUNPATH is possibly used after LD_LIBRARY_PATH system variable.
		set_target_properties(ViconDataStreamSDK_CPP PROPERTIES
			BUILD_WITH_INSTALL_RPATH TRUE
			INSTALL_RPATH "$ORIGIN/."
		)
	endif()
endif()

