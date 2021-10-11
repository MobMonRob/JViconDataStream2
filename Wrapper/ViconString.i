%ignore ViconDataStreamSDK::CPP::String;
%ignore ViconDataStreamSDK::CPP::IStringFactory;
%ignore ViconDataStreamSDK::CPP::operator<<;

//namespace ViconDataStreamSDK
//{
//namespace CPP
//{

%naturalvar ViconDataStreamSDK::CPP::String;

//class String;

//Typemap ViconDataStreamSDK::CPP::String <-> java.lang.String
//Angelehnt an https://github.com/swig/swig/blob/master/Lib/java/std_string.i


%{
    //std::unique_ptr
    #include <memory>
    
    //theStringFactory
    #include "IDataStreamClientBase.h"
    #include "StringFactory.h"
    ViconDataStreamSDK::CPP::VStringFactory theVStringFactory;
    ViconDataStreamSDK::CPP::IStringFactory & theStringFactory = theVStringFactory;
%}


%fragment("ViconString", "header")
%{
    std::unique_ptr<ViconDataStreamSDK::CPP::String> toViconString(JNIEnv* jenv, jstring theJavaString)
    {
        if(!theJavaString)
        {
            SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "null String");
            return 0;
        }
  
        const char *javaStringChars = (const char *)jenv->GetStringUTFChars(theJavaString, 0);
        if (!javaStringChars)
        {
            SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "GetStringUTFChars returned null");
            return 0;
        }
  
        ViconDataStreamSDK::CPP::String* viconString = new ViconDataStreamSDK::CPP::String();
        viconString->Set(javaStringChars, theStringFactory);
        
        jenv->ReleaseStringUTFChars(theJavaString, javaStringChars);
        
        return std::unique_ptr<ViconDataStreamSDK::CPP::String>(viconString);
    }
%}


/////////////////////////////////////////////////////
// C++ Typemaps : in
/////////////////////////////////////////////////////


//Java -> C++
// const version auto generated
//$1: ViconDataStreamSDK::CPP::String
//$input: java.lang.String
%typemap(in, fragment="ViconString") ViconDataStreamSDK::CPP::String
%{
    //Typemap: in
    
    $1 = *(toViconString(jenv, $input).get());
%}


//Java -> C++
// const version auto generated
//tmpViconString is needed because it still lives after the end
//of the typemap and in that way we ensure that a pointer to it
//is still valid when passed to a function.
%typemap(in) ViconDataStreamSDK::CPP::String & (std::unique_ptr<ViconDataStreamSDK::CPP::String> tmpViconString)
%{
    //Typemap: in&
    
    tmpViconString = toViconString(jenv, $input);
    $1 = tmpViconString.get();
%}


//Java -> C++
// const version auto generated
//tmpViconString is needed because it still lives after the end
//of the typemap and in that way we ensure that a pointer to it
//is still valid when passed to a function.
%typemap(in) ViconDataStreamSDK::CPP::String * (std::unique_ptr<ViconDataStreamSDK::CPP::String> tmpViconString)
%{
    //Typemap: in*
    
    tmpViconString = toViconString(jenv, $input);
    $1 = tmpViconString.get();
%}


/////////////////////////////////////////////////////
// C++ Typemaps : out
/////////////////////////////////////////////////////


//C++ -> Java
// const version auto generated
%typemap(out) ViconDataStreamSDK::CPP::String
%{
    $result = jenv->NewStringUTF($1.operator std::string().c_str());
%}


//Functions should not return pointer. If them do: clarify who shall delete.
//Maybe checkout in the SWIG documentation: "newfree" typemap
/*
//C++ -> Java
// const version auto generated
%typemap(out) ViconDataStreamSDK::CPP::String &
%{
    $result = jenv->NewStringUTF($1->operator std::string().c_str());
%}
*/


//Functions should not return pointer. If them do: clarify who shall delete.
//Maybe checkout in the SWIG documentation: "newfree" typemap
/*
//C++ -> Java
// const version auto generated
%typemap(out) ViconDataStreamSDK::CPP::String *
%{
    $result = jenv->NewStringUTF($1->operator std::string().c_str());
%}
*/


/////////////////////////////////////////////////////
// Java Typemaps
/////////////////////////////////////////////////////


//http://www.swig.org/Doc4.0/SWIGDocumentation.html#Java_typemaps_c_to_java_types


// String
// const version auto generated
%typemap(jni) ViconDataStreamSDK::CPP::String "jstring"
%typemap(jtype) ViconDataStreamSDK::CPP::String "String"
%typemap(jstype) ViconDataStreamSDK::CPP::String "String"
%typemap(javain) ViconDataStreamSDK::CPP::String "$javainput"
%typemap(javaout) ViconDataStreamSDK::CPP::String {
    return $jnicall;
}


// String &
// const version auto generated
%typemap(jni) ViconDataStreamSDK::CPP::String & = ViconDataStreamSDK::CPP::String;
%typemap(jtype) ViconDataStreamSDK::CPP::String & = ViconDataStreamSDK::CPP::String;
%typemap(jstype) ViconDataStreamSDK::CPP::String & = ViconDataStreamSDK::CPP::String;
%typemap(javain) ViconDataStreamSDK::CPP::String & = ViconDataStreamSDK::CPP::String;
%typemap(javaout) ViconDataStreamSDK::CPP::String & = ViconDataStreamSDK::CPP::String;


// String *
// const version auto generated
%typemap(jni) ViconDataStreamSDK::CPP::String * = ViconDataStreamSDK::CPP::String;
%typemap(jtype) ViconDataStreamSDK::CPP::String * = ViconDataStreamSDK::CPP::String;
%typemap(jstype) ViconDataStreamSDK::CPP::String * = ViconDataStreamSDK::CPP::String;
%typemap(javain) ViconDataStreamSDK::CPP::String * = ViconDataStreamSDK::CPP::String;
%typemap(javaout) ViconDataStreamSDK::CPP::String * = ViconDataStreamSDK::CPP::String;


//}
//}

