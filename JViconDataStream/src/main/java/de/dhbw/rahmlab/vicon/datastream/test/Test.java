package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.api.Version;
import de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient;

/**
 * @author Oliver Rettig
 */
public class Test {

    public static void main(String argv[]) throws InterruptedException {

        DataStreamClient client = new DataStreamClient();
        
        // auch mit OSC-Stream statt UDP und dem Port 51001 funktioniert es nicht
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
            // ich lande hier, d.h. streaming von marker data muss aktiv eingeschaltet werden
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
            // Ich lande hier, d.h. nach einem enableMarkerData() bekomme ich hier true
            // obwohl erst nach getFrame() dem Methoden zum Lesen von Daten Werte ungleich 0 zurückliefern
            System.out.println("MarkerDataEnabled is enabeled");
        } else {
            System.out.println("MarkerDataEnabled disabled");
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
            System.out.println("Segment Name of "+String.valueOf(i)+" is \"" + SegmentName+"\"!");
            
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
        
        

        // devices 
        
        System.out.println();
        
        client.enableDeviceData();
        if (client.isDeviceDataEnabled()){
            System.out.println("Device data enabled!");
        }
        long devices = client.getDeviceCount();
        System.out.println("found "+String.valueOf(devices)+" devices!");
        //client.getFrame();
        //devices = client.getDeviceCount();
        System.out.println("found "+String.valueOf(devices)+" devices!");
        for (long i=0;i<devices;i++){
            // z.B. RobotSync
            String[] deviceName = client.getDeviceName(i);
            for (int j=0;j<deviceName.length;j++){
                System.out.println("Device "+String.valueOf(i)+": "+deviceName[j]);
            }
            long deviceOutputCount = client.getDeviceOutputCount(SubjectName);
            for (int k=0;k<deviceOutputCount;k++){
                String[] deviceOutputName = client.getDeviceOutputName(SubjectName, k);
                // z.B. Status
                for (int l=0;l<deviceOutputName.length;l++){
                    System.out.println("  output names :"+deviceOutputName[l]);
                }
                
                double value = client.getDeviceOutputValue(deviceName[0], deviceOutputName[0]);
            }
        }
        
        //client.enableGreyscaleData(); //ok
        client.disableGreyscaleData(); //ok
        client.disableUnlabeledMarkerData(); //ok
        //client.enableUnlabeledMarkerData(); // ok
        client.disableVideoData(); // ok
        //client.enableVideoData(); // ok
        client.disableLightweightSegmentData(); //ok
        //client.enableLightweightSegmentData(); // damit bekomme ich keine marker daten mehr
        client.disableDeviceData(); // ok
        //client.enableDeviceData(); // ok
        client.disableCentroidData(); // ok
        //client.enableCentroidData(); // da fliege ich mit ex raus, wegen low jitter mode
        client.disableMarkerRayData(); //ok
        //client.enableMarkerRayData(); // ok
        
        int frames = 100;
        while(frames >9){
            client.getFrame();
            
            // framenumber bestimmen
            frameNumber = client.getFrameNumber();
            
            try {
                double[] m = client.getSegmentGlobalRotationQuaternion("TCP", "TCP");
                double[] t = client.getMarkerGlobalTranslation("GLOBE", "GLOBE1");
                
                if (t!= null){
                    System.out.println("frame "+frameNumber+": Markerposition von GLOBE1 t0="+t[0]+" t1="+t[1]+" t2="+t[2]);
                }
                if (m== null){
                    System.out.println("m==null");
                } else {
                    System.out.println("frame "+frameNumber+": Segmentorientation von TCP q0="+m[0]+" q1="+m[1]+" q2="+m[2]+" q3="+m[3]);
                }
                 
            } catch (RuntimeException e){
                System.out.println(e);
            }
            frames--;
        }
              

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
