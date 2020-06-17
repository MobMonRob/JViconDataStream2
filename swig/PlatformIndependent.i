%module ViconDataStreamSDKSwig; //Wichtig: Modul muss anders heißen, als die Namespaces! Sonst gibt es den Namen als Klasse (wegen dem Modul) und als Namespace. Das ist doof.

//%feature("nspace"); //Wäre so schön. Aber ich finde keine Möglichkeit, die Pakete der Template Instanzierungen zu ändern.

%include "std_shared_ptr.i";
%include "std_string.i";
%include "arrays_java.i";
%include "std_vector.i"
//%include "typemaps.i";

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

