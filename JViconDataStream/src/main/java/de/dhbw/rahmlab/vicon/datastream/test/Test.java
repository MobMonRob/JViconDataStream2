package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.api.Version;
import de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient;

/**
 * @author Oliver Rettig
 */
public class Test {

    public static void main(String argv[]) throws InterruptedException {

        DataStreamClient client = new DataStreamClient();
        
        String hostname = "192.168.10.1:801"; //Port 51001 ClientConnectionFailed after 2 Minutes

        Version version = client.getVersion();
        System.out.println("Version: " + version.getMajor() + "." + version.getMinor() + "." + version.getPoint());

        System.out.println("Try to connect to: " + hostname);
        client.connect(hostname,4000l);
        if (client.isConnected()) {
            System.out.println("is conected");
        }
        if (client.isMarkerDataEnabled()) {
            System.out.println("IsMarkerDataEnabled is enabeled");
        } else {
            System.out.println("IsMarkerDataEnabled is not enabeled");
        }
        client.getFrame();
        System.out.println("Subject Count = " + client.getSubjectCount());

        int SubjectIndex = 0;
        String SubjectName = client.getSubjectName(SubjectIndex);
        System.out.println("Subject name of "+String.valueOf(SubjectIndex)+" = " + SubjectName);
        
        client.enableMarkerData();
        client.enableSegmentData();
        if (client.isMarkerDataEnabled()) {
            System.out.println("IsMarkerDataEnabled is enabeled");
        } else {
            System.out.println("IsMarkerDataEnabled is not enabeled");
        }
        client.enableUnlabeledMarkerData();
        if (client.isUnlabeledMarkerDataEnabled()) {
            System.out.println("UnlabeledMarkerData is enabeled");
        }
        client.getFrame();
        long FrameRateCount = client.getFrameRateCount();
        System.out.println("Frame rate Count is " + FrameRateCount);
        System.out.println("Unlabeled Marker Count is " + client.getUnlabeledMarkerCount());
        long MarkerIndex = 0;
        double[] Translation = client.getUnlabeledMarkerGlobalTranslation(MarkerIndex);
        System.out.println("Unlabeled Marker Global Translation x= " + Translation[0] + "Y= " + Translation[1] + "Z= " + Translation[2]);
        System.out.println("Subject Count = " + client.getSubjectCount());

        long segmentCount = client.getSegmentCount(SubjectName);
        for (long i = 0; i < segmentCount; i++) {
            String SegmentName = client.getSegmentName(SubjectName, i);
            System.out.println("Segment Name of "+String.valueOf(i)+" is" + SegmentName);
            
            long segmentChildCount = client.getSegmentChildCount(SubjectName, SegmentName);
            System.out.println("Segment Child Count is " + segmentChildCount);
            
            System.out.println("Segment Parent Name is " + client.getSegmentParentName(SubjectName, SegmentName));

            for (long j = 0; j < segmentChildCount; j++){
                System.out.println("Segment Child Name is " + client.getSegmentChildName(SubjectName, SegmentName, j));
            }
        }

        System.out.println("Frame rate is " + client.getFrameRate());
        long frameNumber = client.getFrameNumber();
        System.out.println("frame " + frameNumber);

        printSubjectHierarchie(client);
        
        SubjectIndex = 0;
        SubjectName = client.getSubjectName(SubjectIndex);
        System.out.println("Subject name of "+String.valueOf(SubjectIndex)+" = " + SubjectName);
        int SegmentIndex = 0;
        String SegmentName = client.getSegmentName(SubjectName, SegmentIndex);
        System.out.println("Segment name of "+String.valueOf(SegmentIndex)+" = " + SegmentName);
        
        /*while(true){
            client.getFrame();
            
            // framenumber bestimmen
            frameNumber = client.getFrameNumber();
            
            try {
                double[] m = client.getSegmentGlobalRotationQuaternion("TCP", "TCP");
                
                if (m== null){
                    System.out.println("m==null");
                } else {
                    System.out.println("frame "+frameNumber+": q0="+m[0]+" q1="+m[1]+" q2="+m[2]+" q3="+m[3]);
                }
                 
            } catch (RuntimeException e){
                System.out.println(e);
            }
        }*/

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
