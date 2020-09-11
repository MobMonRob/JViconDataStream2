namespace ViconDataStreamSDK
{
namespace CPP
{

%naturalvar String;

class String;

//Typemap ViconDataStreamSDK::CPP::String -> java.lang.String

// String
%typemap(jni) ViconDataStreamSDK::CPP::String "jstring"
%typemap(jtype) ViconDataStreamSDK::CPP::String "String"
%typemap(jstype) ViconDataStreamSDK::CPP::String "String"
%typemap(javadirectorin) ViconDataStreamSDK::CPP::String "$jniinput"
%typemap(javadirectorout) ViconDataStreamSDK::CPP::String "$javacall"

//Java -> C++
//$1: ViconDataStreamSDK::CPP::String
//$input: java.lang.String
%typemap(in) ViconDataStreamSDK::CPP::String
%{ if(!$input) {
     SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null String");
     return $null;
    }
    const char *$1_pstr = (const char *)jenv->GetStringUTFChars($input, 0);
    if (!$1_pstr) return $null;

    $1 = ViconDataStreamSDK::CPP::String($1_pstr);
    jenv->ReleaseStringUTFChars($input, $1_pstr); %}

//Java -> C++
//$result: return ViconDataStreamSDK::CPP::String
%typemap(directorout) ViconDataStreamSDK::CPP::String
%{ if(!$input) {
     if (!jenv->ExceptionCheck()) {
       SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null String");
     }
     return $null;
   }
   const char *$1_pstr = (const char *)jenv->GetStringUTFChars($input, 0);
   if (!$1_pstr) return $null;
   $result = ViconDataStreamSDK::CPP::String($1_pstr);
   jenv->ReleaseStringUTFChars($input, $1_pstr); %}

//C++ -> Java
%typemap(directorin,descriptor="Ljava/lang/String;") ViconDataStreamSDK::CPP::String
%{ $input = jenv->NewStringUTF($1.operator std::string().c_str());
   Swig::LocalRefGuard $1_refguard(jenv, $input); %}

//C++ -> Java
%typemap(out) ViconDataStreamSDK::CPP::String
%{ $result = jenv->NewStringUTF($1.operator std::string().c_str()); %}

%typemap(javain) ViconDataStreamSDK::CPP::String "$javainput"

%typemap(javaout) ViconDataStreamSDK::CPP::String {
    return $jnicall;
  }

%typemap(typecheck) ViconDataStreamSDK::CPP::String = char *;

%typemap(throws) ViconDataStreamSDK::CPP::String
%{ SWIG_JavaThrowException(jenv, SWIG_JavaRuntimeException, $1.operator std::string().c_str());
   return $null; %}


// const String &
%typemap(jni) const ViconDataStreamSDK::CPP::String & "jstring"
%typemap(jtype) const ViconDataStreamSDK::CPP::String & "String"
%typemap(jstype) const ViconDataStreamSDK::CPP::String & "String"
%typemap(javadirectorin) const ViconDataStreamSDK::CPP::String & "$jniinput"
%typemap(javadirectorout) const ViconDataStreamSDK::CPP::String & "$javacall"

%typemap(in) const ViconDataStreamSDK::CPP::String &
%{ if(!$input) {
     SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null String");
     return $null;
   }
   const char *$1_pstr = (const char *)jenv->GetStringUTFChars($input, 0);
   if (!$1_pstr) return $null;
   $*1_ltype $1_str($1_pstr);
   $1 = &$1_str;
   jenv->ReleaseStringUTFChars($input, $1_pstr); %}

%typemap(directorout,warning=SWIGWARN_TYPEMAP_THREAD_UNSAFE_MSG) const ViconDataStreamSDK::CPP::String &
%{ if(!$input) {
     SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null String");
     return $null;
   }
   const char *$1_pstr = (const char *)jenv->GetStringUTFChars($input, 0);
   if (!$1_pstr) return $null;
   //possible thread/reentrant code problem
   static $*1_ltype $1_str;
   $1_str = $1_pstr;
   $result = &$1_str;
   jenv->ReleaseStringUTFChars($input, $1_pstr); %}

%typemap(directorin,descriptor="Ljava/lang/String;") const ViconDataStreamSDK::CPP::String &
%{ $input = jenv->NewStringUTF($1.operator std::string().c_str());
   Swig::LocalRefGuard $1_refguard(jenv, $input); %}

%typemap(out) const ViconDataStreamSDK::CPP::String &
%{ $result = jenv->NewStringUTF($1->operator std::string().c_str()); %}

%typemap(javain) const ViconDataStreamSDK::CPP::String & "$javainput"

%typemap(javaout) const ViconDataStreamSDK::CPP::String & {
    return $jnicall;
  }

%typemap(typecheck) const ViconDataStreamSDK::CPP::String & = char *;

%typemap(throws) const ViconDataStreamSDK::CPP::String &
%{ SWIG_JavaThrowException(jenv, SWIG_JavaRuntimeException, $1.operator std::string().c_str());
   return $null; %}

}
}

