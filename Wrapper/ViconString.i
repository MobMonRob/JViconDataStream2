%ignore ViconDataStreamSDK::CPP::String;
%ignore ViconDataStreamSDK::CPP::IStringFactory;
%ignore ViconDataStreamSDK::CPP::operator<<;

%naturalvar ViconDataStreamSDK::CPP::String;

//Typemap ViconDataStreamSDK::CPP::String <-> java.lang.String


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
%typemap(in, fragment="CppString") ViconDataStreamSDK::CPP::String & (std::unique_ptr<std::string> cppString, ViconDataStreamSDK::CPP::String viconString)
%{
    //Begin typemap: in&
    cppString = toCppString(jenv, $input);
    if (!cppString) return $null;
    viconString = ViconDataStreamSDK::CPP::String(cppString->c_str());
    $1 = &viconString;
    //End typemap: in&
%}


//Java -> C++
// const version auto generated
//cppString, viconString are needed to ensure all pointers are still valid after the typemap when the wrapped cpp function is called.
%typemap(in, fragment="CppString") ViconDataStreamSDK::CPP::String * (std::unique_ptr<std::string> cppString, ViconDataStreamSDK::CPP::String viconString)
%{
    //Begin typemap: in*
    cppString = toCppString(jenv, $input);
    if (!cppString) return $null;
    viconString = ViconDataStreamSDK::CPP::String(cppString->c_str());
    $1 = &viconString;
    //End typemap: in*
%}


/////////////////////////////////////////////////////
// C++ Typemaps : out
/////////////////////////////////////////////////////


//C++ -> Java
// const version auto generated
%typemap(out) ViconDataStreamSDK::CPP::String (std::string tmpString)
%{
	tmpString = $1.operator std::string();
    $result = jenv->NewStringUTF(tmpString.c_str());
%}


// Needed for Output_[...] classes' members wrapping.
//C++ -> Java
// const version auto generated
%typemap(out) ViconDataStreamSDK::CPP::String & (std::string tmpString)
%{
	tmpString = $1->operator std::string();
    $result = jenv->NewStringUTF(tmpString.c_str());
%}


// Two cases could occur:
// Pointer holds ownership: should be deleted after the typemap
// Pointer holds no ownership: should only be copied
//C++ -> Java
// const version auto generated
%typemap(out) ViconDataStreamSDK::CPP::String *
%{
    #error (%typemap(out) ViconDataStreamSDK::CPP::String *) : Unclear ownership
%}


/////////////////////////////////////////////////////
// Java Typemaps
/////////////////////////////////////////////////////


//http://www.swig.org/Doc4.0/SWIGDocumentation.html#Java_typemaps_c_to_java_types


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

