%module ViconDataStreamSDKSwig;
//Wichtig: Modul muss anders heissen, als die Namespaces! Sonst gibt es den Namen als Klasse (wegen dem Modul) und als Namespace. Das gibt Probleme.

//%feature("nspace");
//Muss unbedingt vor den Template Instanzierungen stehen, damit die zugreifbar bleiben.
//Refer to end of section of http://www.swig.org/Doc4.0/Java.html#Java_code_typemaps
//Nur notwendig, wenn nspace Feature aktiv
//SWIG_JAVABODY_PROXY(public, public, SWIGTYPE)
//SWIG_JAVABODY_TYPEWRAPPER(public, public, public, SWIGTYPE)
//SWIG_JAVABODY_METHODS(public, public, SWIGTYPE)

%include "std_shared_ptr.i";
%include "std_string.i";
%include "arrays_java.i";
%include "std_vector.i"

%include "./ViconString.i"

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
