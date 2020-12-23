cmake_minimum_required(VERSION 3.9 FATAL_ERROR)
project(vicon-datastream-sdk
	VERSION 1.10.20200407.123216 #same as Vicon SDK
)

#Vicon SDK file gcc.mk defines this as minimum required version
set (CMAKE_CXX_STANDARD_REQUIRED 14)

set(CMAKE_THREAD_PREFER_PTHREAD TRUE)
set(THREADS_PREFER_PTHREAD_FLAG TRUE)
find_package(Threads REQUIRED)

SET (BOOST_ROOT "../current_Linux64_source/thirdparty/Boost/boost-1.58.0-dynamic-linux-x64/installed/")
SET (BOOST_INCLUDEDIR "../current_Linux64_source/thirdparty/Boost/boost-1.58.0-dynamic-linux-x64/installed/include")
SET (BOOST_LIBRARYDIR "../current_Linux64_source/thirdparty/Boost/boost-1.58.0-dynamic-linux-x64/installed/lib")

#Defined by Vicon SDK
SET (BOOST_MIN_VERSION "1.58.0")
set (Boost_NO_BOOST_CMAKE ON)
FIND_PACKAGE(Boost ${BOOST_MIN_VERSION} COMPONENTS system thread REQUIRED)
if (NOT Boost_FOUND)
  message(FATAL_ERROR "Fatal error: Boost (version >= 1.58.0) required.")
else()
  message(STATUS "Setting up BOOST")
  message(STATUS " Includes - ${Boost_INCLUDE_DIRS}")
  message(STATUS " Library  - ${Boost_LIBRARY_DIRS}")
  include_directories(${Boost_INCLUDE_DIRS})
  link_directories(${Boost_LIBRARY_DIRS})
endif (NOT Boost_FOUND)

SET (VICON_ROOT "../current_Linux64_source/Vicon/CrossMarket")
SET (DataStream_ROOT "${VICON_ROOT}/DataStream")


# Declare a cpp library
add_library(ViconDataStreamSDK_CPP SHARED
	${DataStream_ROOT}/ViconDataStreamSDKCore/CoreClient.h
	${VICON_ROOT}/StreamCommon/Type.h


	${DataStream_ROOT}/ViconDataStreamSDK_CPP/DataStreamClient.cpp
	${DataStream_ROOT}/ViconDataStreamSDK_CPP/DataStreamRetimingClient.cpp
)


target_include_directories(ViconDataStreamSDK_CPP PRIVATE
	"${DataStream_ROOT}"
	"${DataStream_ROOT}/ViconDataStreamSDK_CPP"
	"${DataStream_ROOT}/ViconDataStreamCore"
	"${VICON_ROOT}"
	"${VICON_ROOT}/StreamCommon"
)


set_target_properties(ViconDataStreamSDK_CPP PROPERTIES PUBLIC_HEADER
	${VICON_ROOT}/DataStream/ViconDataStreamSDK_CPP/DataStreamClient.h
	${VICON_ROOT}/DataStream/ViconDataStreamSDK_CPP/DataStreamRetimingClient.h
	${VICON_ROOT}/DataStream/ViconDataStreamSDK_CPP/IDataStreamClientBase.h
)


target_link_libraries(ViconDataStreamSDK_CPP
  #unbedingt benötigt scheinbar. (Ist in der API?)
  #vielleicht braucht man nicht mehr, wenn man den Wrapper dazwischen schiebt?
  Boost::system
  #Boost::thread

  #Boost braucht pthread scheinbar so oder so
  #Gibt aber kein Fehler, wenn nicht dagegen gelinkt wird?
  Threads::Threads
)



if (CMAKE_COMPILER_IS_GNUCXX AND CMAKE_CXX_COMPILER_VERSION VERSION_LESS 7.5.0)
    message(FATAL_ERROR "Not tested with gcc version lower than gcc-7.5.0. Change CMakeLists.txt if you can assure a lower version works!")
endif()


if(CMAKE_COMPILER_IS_GNUCXX)
	#taken from Vicon SDK file gcc.mk
	set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -Wno-sign-compare -Wno-unknown-pragmas -Wno-parentheses -Winvalid-pch -Wno-unused-variable -Wno-reorder -Wno-unused-but-set-variable -Wno-unused-function -Wno-deprecated-declarations -Wno-attributes")

	target_compile_options(ViconDataStreamSDK_CPP PRIVATE
		#Own Options
		-fPIC
		-O3
		-flto
		-Wl,-rpath,'$ORIGIN/.'
		#taken from Vicon SDK file gcc.mk
		-m64 #x86_64
		-mfpmath=sse
		#-msse2
		-fvisibility-inlines-hidden
		-D_GLIBCXX_HAVE_GTHR_DEFAULT
		-D_GLIBCXX_USE_CXX11_ABI=0
		#unsafe optimization. Comment out if problems occur.
		-mavx2
		-funroll-loops
		-Ofast
	)

endif()

