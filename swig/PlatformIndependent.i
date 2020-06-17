%module ViconDataStreamSDKSwig; //Wichtig: Modul muss anders heißen, als die Namespaces! Sonst gibt es den Namen als Klasse (wegen dem Modul) und als Namespace. Das ist doof.

//%feature("nspace"); //Wäre so schön. Aber ich finde keine Möglichkeit, die Pakete der Template Instantzierungen zu ändern.

%include "std_shared_ptr.i";
%include "std_string.i";
%include "arrays_java.i";
%include "std_vector.i"
%include "typemaps.i";
%include <windows.i>; //Has no effect in Linux
%include "enumtypesafe.swg";
%javaconst(1);

%rename (ViconString) ViconDataStreamSDK::CPP::String; //Wichtig! Swig benennt den Java String nicht mit vollständigem Pfad. Innerhalb des Namespaces gibt es sonst Mehrdeutigkeit.
%rename (assignmentOperator) ViconDataStreamSDK::CPP::String::operator=;
%rename (toStdString) ViconDataStreamSDK::CPP::String::operator std::string;
%ignore ViconDataStreamSDK::CPP::String::String(char const *);
%ignore ViconDataStreamSDK::CPP::operator<<;

%rename (Direction_Enum) ViconDataStreamSDK::CPP::Direction::Enum;
%rename (ServerOrientation_Enum) ViconDataStreamSDK::CPP::ServerOrientation::Enum;
%rename (StreamMode_Enum) ViconDataStreamSDK::CPP::StreamMode::Enum;
%rename (TimecodeStandard_Enum) ViconDataStreamSDK::CPP::TimecodeStandard::Enum;
%rename (DeviceType_Enum) ViconDataStreamSDK::CPP::DeviceType::Enum;
%rename (Unit_Enum) ViconDataStreamSDK::CPP::Unit::Enum;
%rename (Result_Enum) ViconDataStreamSDK::CPP::Result::Enum;

%template(VectorUint) std::vector<unsigned int>; //Gebraucht von DataStreamClient
%template(VectorVectorUchar) std::vector<std::vector<unsigned char>>; //Gebraucht von Output_GetGreyscaleBlob
%template(VectorUchar) std::vector<unsigned char>; //Gebraucht von VectorVectorUchar
%template(SharedPtrVectorUchar) std::shared_ptr<std::vector<unsigned char>>; //Gebraucht von Output_GetVideoFrame


%{
#include <new>
//using namespace std; //Vermeiden
#include <stdexcept>
#include "jni.h"

//A stash area embedded in each allocation to hold java handles
struct Jalloc {
  jbyteArray jba;
  jobject ref;
};

static JavaVM *cached_jvm = 0;

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *jvm, void *reserved) {
  cached_jvm = jvm;
  return JNI_VERSION_1_2;
}

static JNIEnv * JNU_GetEnv() {
  JNIEnv *env;
  jint rc = cached_jvm->GetEnv((void **)&env, JNI_VERSION_1_2);
  if (rc == JNI_EDETACHED)
    throw std::runtime_error("current thread not attached");
  if (rc == JNI_EVERSION)
    throw std::runtime_error("jni version not supported");
  return env;
}

void * operator new(size_t t) {
  if (cached_jvm != 0) {
    JNIEnv *env = JNU_GetEnv();
    jbyteArray jba = env->NewByteArray((int) t + sizeof(Jalloc));
    if (env->ExceptionOccurred())
      throw std::bad_alloc();
    void *jbuffer = static_cast<void *>(env->GetByteArrayElements(jba, 0));
    if (env->ExceptionOccurred())
      throw std::bad_alloc();
    Jalloc *pJalloc = static_cast<Jalloc *>(jbuffer);
    pJalloc->jba = jba;
    //Assign a global reference so byte array will persist until deleted
    pJalloc->ref = env->NewGlobalRef(jba);
    if (env->ExceptionOccurred())
      throw std::bad_alloc();
    return static_cast<void *>(static_cast<char *>(jbuffer) + sizeof(Jalloc));
  }
  else { //JNI_OnLoad not called, use malloc and mark as special
    Jalloc *pJalloc = static_cast<Jalloc *>(malloc((int) t + sizeof(Jalloc)));
    if (!pJalloc)
      throw std::bad_alloc();
    pJalloc->ref = 0;
    return static_cast<void *>(
        static_cast<char *>(static_cast<void *>(pJalloc)) + sizeof(Jalloc));
  }
}

void operator delete(void *v) {
  if (v != 0) {
    void *buffer = static_cast<void *>( static_cast<char *>(v) - sizeof(Jalloc));
    Jalloc *pJalloc = static_cast<Jalloc *>(buffer);
    if (pJalloc->ref) {
      JNIEnv *env = JNU_GetEnv();
      env->DeleteGlobalRef(pJalloc->ref);
      env->ReleaseByteArrayElements(pJalloc->jba, static_cast<jbyte *>(buffer), 0);
    }
    else {
      free(buffer);
    }
  }
}
%}

