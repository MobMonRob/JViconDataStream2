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
//Inspired by: https://github.com/swig/swig/blob/master/Lib/java/std_string.i


%fragment("CppString", "header")
%{
    //std::unique_ptr
    #include <memory>
    //std::string
    #include <string>

    static std::unique_ptr<std::string> toCppString(JNIEnv* jenv, jstring theJavaString)
    {
        if(!theJavaString)
        {
            SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "theJavaString is null.");
            return nullptr;
        }
  
        const char* javaStringChars = jenv->GetStringUTFChars(theJavaString, 0);
        if (!javaStringChars)
        {
            SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "GetStringUTFChars returned null.");
            return nullptr;
        }
  
        std::unique_ptr<std::string> cppString = std::make_unique<std::string>(javaStringChars);

        jenv->ReleaseStringUTFChars(theJavaString, javaStringChars);
        
        return cppString;
    }
%}


/////////////////////////////////////////////////////
// C++ Typemaps : in
/////////////////////////////////////////////////////


//Java -> C++
// const version auto generated
//$1: ViconDataStreamSDK::CPP::String
//$input: java.lang.String
//cppString is needed to ensure all pointers are still valid after the typemap when the wrapped cpp function is called.
%typemap(in, fragment="CppString") ViconDataStreamSDK::CPP::String (std::unique_ptr<std::string> cppString)
%{
    //Begin typemap: in
    cppString = toCppString(jenv, $input);
    if (!cppString) return $null;
    $1 = ViconDataStreamSDK::CPP::String(cppString->c_str());
    //End typemap: in
%}


//Java -> C++
// const version auto generated
//cppString, viconString are needed to ensure all pointers are still valid after the typemap when the wrapped cpp function is called.
%typemap(in, fragment="CppString") ViconDataStreamSDK::CPP::String & (std::unique_ptr<std::string> cppString, std::unique_ptr<ViconDataStreamSDK::CPP::String> viconString)
%{
    //Begin typemap: in&
    cppString = toCppString(jenv, $input);
    if (!cppString) return $null;
    viconString = std::make_unique<ViconDataStreamSDK::CPP::String>(cppString->c_str());
    $1 = viconString.get();
    //End typemap: in&
%}


//Java -> C++
// const version auto generated
//cppString, viconString are needed to ensure all pointers are still valid after the typemap when the wrapped cpp function is called.
%typemap(in, fragment="CppString") ViconDataStreamSDK::CPP::String * (std::unique_ptr<std::string> cppString, std::unique_ptr<ViconDataStreamSDK::CPP::String> viconString)
%{
    //Begin typemap: in*
    cppString = toCppString(jenv, $input);
    if (!cppString) return $null;
    viconString = std::make_unique<ViconDataStreamSDK::CPP::String>(cppString->c_str());
    $1 = viconString.get();
    //End typemap: in*
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

