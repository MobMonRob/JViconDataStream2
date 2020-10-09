package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.api.Version;
import de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient;

/**
 *
 * @author Oliver Rettig
 */
public class Test {

    //-Djava.library.path="C:\Users\mobmonrob\Documents\jdk-12\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Python27\;C:\Program Files\OpenNI\Bin64;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\system32\config\systemprofile\.dnx\bin;C:\Program Files\Microsoft DNX\Dnvm\;C:\Program Files\Microsoft SQL Server\120\Tools\Binn\;C:\Program Files\Microsoft SQL Server\130\Tools\Binn\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\swigwin-3.0.12\swigwin-3.0.12;C:\Program Files (x86)\Windows Kits\8.1\Windows Performance Toolkit\;C:\Program Files\jdk-12\bin;C:\Users\mobmonrob\AppData\Local\Microsoft\WindowsApps;C:\Users\mobmonrob\AppData\Local\GitHubDesktop\bin;C:\Users\mobmonrob\Documents\NetBeansProjects\JViconDataStream2\lib;."
    public static void main(String argv[]) throws InterruptedException {

        DataStreamClient client = new DataStreamClient();
        // ViconDataStreamSDKRetimingClient retimingClient = new ViconDataStreamSDKRetimingClient();

        //String hostname ="192.168.10.1:51001";//127.0.0.2:801";"192.168.10.1:51001"
        String hostname = "192.168.10.1:801"; //Port 51001 ClientConnectionFailed after 2 Minutes

        Version version = client.getVersion();

        System.out.println("Version: " + version.getMajor() + "." + version.getMinor() + "." + version.getPoint());

        System.out.println("Try to connect to: " + hostname);
        client.connect(hostname);
        if (client.isConnected()) {
            System.out.println("is conected");
        }
        if (client.isMarkerDataEnabled() == true) {
            System.out.println("IsMarkerDataEnabled is enabeled");
        } else {
            System.out.println("IsMarkerDataEnabled is not enabeled");
        }
        client.getFrame(true);
        System.out.println("Subject Count = " + client.getSubjectCount());

        int SubjectIndex = 1;
        // retimingClient.connect(hostname);
        // retimingClient.updateFrame();
        //String SubjectName=retimingClient.getSubjectName(SubjectIndex);
        //String SubjectName = "LeftElbow";
        // System.out.println("subject name= "+SubjectName);
        String SubjectName = client.getSubjectName(SubjectIndex);
        //String SubjectName = "LeftElbow";
        System.out.println("subject name= " + SubjectName);
        // System.out.println(client.IsSegmentDataEnabled());

        client.enableMarkerData();
        client.enableSegmentData();
        if (client.isMarkerDataEnabled() == true) {
            System.out.println("IsMarkerDataEnabled is enabeled");
        } else {
            System.out.println("IsMarkerDataEnabled is not enabeled");
        }
        client.enableUnlabeledMarkerData();
        if (client.isUnlabeledMarkerDataEnabled() == true) {
            System.out.println("UnlabeledMarkerData is enabeled");
        }
        //client.enableUnlabeledMarkerData();
        // System.out.println(client.IsSegmentDataEnabled());
        client.getFrame(true);
        long FrameRateCount = client.getFrameRateCount();
        System.out.println("Frame rate Count is " + FrameRateCount);
        long FrameRateIndex = 1;
        // String FrameRateName =client.getFrameRateName(FrameRateIndex);
        //System.out.println( "Frame rate Name is "+FrameRateName );
        System.out.println("Unlabeled Marker Count is " + client.getUnlabeledMarkerCount());
        // System.out.println( "Frame rate Value is "+client.getFrameRateValue(FrameRateName));
        long MarkerIndex = 0;
        double[] Translation = client.getUnlabeledMarkerGlobalTranslation(MarkerIndex);
        System.out.println("Unlabeled Marker Global Translation x= " + Translation[0] + "Y= " + Translation[1] + "Z= " + Translation[2]);
        System.out.println("Subject Count = " + client.getSubjectCount());

        //System.out.println("Subject Name is "+ SubjectName);
        //System.out.println("Subject Root Segment Name is "+ client.getSubjectRootSegmentName(SubjectName));
        // System.out.println("Segment Count is  "+client.getSegmentCount( SubjectName));
        long segmentCount = client.getSegmentCount(SubjectName);
        for (long i = 0; i < segmentCount; i++) {
            String SegmentName = client.getSegmentName(SubjectName, i);
            System.out.println("Segment Name Is´" + SegmentName);
            System.out.println("Segment Child Count is " + client.getSegmentChildCount(SubjectName, SegmentName));
            System.out.println("Segment Child Name is " + client.getSegmentChildName(SubjectName, SegmentName, i));
            System.out.println("Segment Parent Name is " + client.getSegmentParentName(SubjectName, SegmentName));

            double[] SST = client.getSegmentStaticTranslation(SubjectName, SegmentName);
            System.out.println("Segment Static Translation is X= " + SST[0] + "Y= " + SST[1] + "Z= " + SST[2]);
            double[] SSRH = client.getSegmentStaticRotationHelical(SubjectName, SegmentName);
            System.out.println("Segment Static Rotation Helicalis X= " + SSRH[0] + "Y= " + SSRH[1] + "Z= " + SSRH[2]);
            double[] SSRM = client.getSegmentStaticRotationMatrix(SubjectName, SegmentName);
            System.out.println("Segment Static Rotation Matrix X= " + SSRM[0] + "Y= " + SSRM[1] + "Z= " + SSRM[2]);
            double[] SSRQ = client.getSegmentStaticRotationQuaternion(SubjectName, SegmentName);
            System.out.println("Segment Static Rotation Quaternion X= " + SSRQ[0] + "Y= " + SSRQ[1] + "Z= " + SSRQ[2]);
        }

        System.out.println("Frame rate is " + client.getFrameRate());
        long frameNumber = client.getFrameNumber();
        System.out.println("frame " + frameNumber);

        //printSubjectHierarchie(client);
        /*for (int markerIndex = 0; markerIndex < client.getUnlabeledMarkerCount(); markerIndex++){
            double[] translation = client.getUnlabeledMarkerGlobalTranslation(markerIndex);
            //TODO
        }*/
        // String subjectName = "test1"; //50621_HAT";//54562";
        //String markerName = "M1";// HATX";
        /// String segmentName = "test1";
//         while(true){
//            client.getFrame(true);
//            
//            
//            // framenumber bestimmen
//            frameNumber = client.getFrameNumber();
//            
//            try {
//               
//                double[] m = client.getSegmentLocalRotationMatrix(SubjectName, SegmentName);
//                if (m== null){
//                    System.out.println("m==null");
//                } else {
//                    System.out.println("frame "+frameNumber+": x="+m[0]+" y="+m[1]+" z="+m[2]);
//                }
//                 
//            } catch (RuntimeException e){
//                System.out.println(e);
//            }
//            // Count the number of markers
//            //long markerCount = client.getMarkerCount(subjectName);
//        
//        }
        // Note: this invokes the virtual destructor
        // You could leave this to the garbage collector
        //client.delete();
        //System.out.println( "Goodbye" );
    }

    private static void printSubjectHierarchie(DataStreamClient client) {
        long subjects = client.getSubjectCount();
        System.out.println("subjects " + subjects);
        for (long subjectIndex = 0; subjectIndex < subjects; subjectIndex++) {
            String SubjectName = client.getSubjectName(subjectIndex);
            System.out.println("Found subject: " + SubjectName);
            long segments = client.getSegmentCount(SubjectName);
            for (int segmentIndex = 0; segmentIndex < segments; segmentIndex++) {
                String SegmentName = client.getSegmentName(SubjectName, segmentIndex);
                System.out.println("   Found segment: " + SegmentName);
            }
            for (int markerIndex = 0; markerIndex < client.getMarkerCount(SubjectName); markerIndex++) {
                String markerName = client.getMarkerName(SubjectName, markerIndex);
                System.out.println("      Found marker: " + markerName);
            }
        }
    }
}
