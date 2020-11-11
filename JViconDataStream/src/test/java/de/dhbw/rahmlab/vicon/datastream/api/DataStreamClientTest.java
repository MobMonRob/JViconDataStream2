package de.dhbw.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.impl.StreamMode_Enum;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Timeout;

/**
 * JUnit5 Test class.
 * 
 * TODO<br>
 * - herausfinden, warum ohne laufenden Vicon-System die tests hängen
 * - Tests vervollständigen
 * - display names setzen
 * - Tags einführen, um die Tests zu gruppieren
 * 
 * @author Oliver Rettig
 */
@TestInstance(Lifecycle.PER_CLASS)
class DataStreamClientTest {
    
    DataStreamClient client;
    
    //String hostname ="192.168.10.1:51001";//127.0.0.2:801";"192.168.10.1:51001"
    String hostname = "192.168.10.1";

    String subjectName = "GLOBE";
    String segmentName = "GLOBE";
    String markerName = "GLOBE1";
        
    DataStreamClientTest() {}

    private DataStreamClient getClient(){
        if (client == null){
            client = new DataStreamClient();
        }
        Version version = client.getVersion();
        System.out.println("Version: " + version.getMajor() + "." + 
                version.getMinor() + "." + version.getPoint());
        client.connect(hostname, 4000l);
        return client;
    }
    @BeforeAll
    void setUp() {
        /*System.out.println("Test setup");
        client = new DataStreamClient(); // Initialisierung hängt, wenn kein Vicon-system aktiv ist
        Version version = client.getVersion();
        System.out.println("Version: " + version.getMajor() + "." + 
                version.getMinor() + "." + version.getPoint());
        client.connect(hostname, 4000l);*/
    }

    @AfterAll
    void close() {
        if (getClient().isConnected()) {
            getClient().disconnect();
        }
        getClient().delete();
    }

    /**
     * Test of connect method, of class DataStreamClient.
     */
    @Test
    @DisplayName("Connect to Vicon Data Stream")
    @Timeout(5)
    void testConnect() {
        DataStreamClient client2 = new DataStreamClient();
        client2.connect(hostname,4000l);
        if (client2.isConnected()) {
            client2.disconnect();
        } else {
            fail("connection failed!");
        }
        client2.delete();
    }

    /**
     * Test of connectToMulticast method, of class DataStreamClient.
     */
    /*@Test
    void testConnectToMulticast() {
        System.out.println("connectToMulticast");
        String multicastHostname = "";
        client.connectToMulticast(hostname, multicastHostname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of startTransmittingMulticast method, of class DataStreamClient.
     */
    /*@Test
    void testStartTransmittingMulticast() {
        System.out.println("startTransmittingMulticast");
        String serverIP = "";
        String multicastIP = "";
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.startTransmittingMulticast(serverIP, multicastIP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of stopTransmittingMulticast method, of class
     * ViconDataStreamSDKClient.
     */
    /*@Test
    void testStopTransmittingMulticast() {
        System.out.println("stopTransmittingMulticast");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.stopTransmittingMulticast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of isConnected method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testIsConnected() {
        Assumptions.assumeTrue(getClient().isConnected(),"Client is not connected!");
    }

    /**
     * Test of disconnect method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testDisconnect() {
        DataStreamClient client2 = new DataStreamClient();
        client2.connect(hostname, 4000l);
        Assumptions.assumeTrue(client2.isConnected(),"Client cauld not be connected!");
        assertEquals(true, client2.disconnect());
        Assumptions.assumeFalse(client2.isConnected(),"Client cauld not be disconnected!");
    }

    /**
     * Test of getVersion method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetVersion() {
        Version result = getClient().getVersion();
        System.out.println("Version "+result.toString());
    }

    /**
     * Test of getDeviceName method, of class ViconDataStreamSDKClient.
     */
    /*@Test
    void testGetDeviceName_0args() {
        System.out.println("getDeviceName");
        DataStreamClient instance = new DataStreamClient();
        String expResult = null;
        String result = instance.getDeviceName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    /**
     * Test of enableDebugData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableDebugData() {
        try {
            client.enableDebugData(); 
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(false, e.getLocalizedMessage());
        }
    }

    /**
     * Test of enableMarkerData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableMarkerData() {
        try {
            getClient().enableMarkerData();
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of enableDeviceData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableDeviceData() {
        try {
            getClient().enableDeviceData();
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of enableMarkerRayData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableMarkerRayData() {
        try {
            client.enableMarkerRayData();
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of enableSegmentData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableSegmentData() {
        try {
            client.enableSegmentData();
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of disableSegmentData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testDisableSegmentData() {
        try {
            client.disableSegmentData();
            // wie kann ich überprüfen, ob segment data dann wirklich ausgeschaltet sind?
            //TODO
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of enableLightweightSegmentData method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testEnableLightweightSegmentData() {
        try {
            client.enableLightweightSegmentData();
            assertEquals(true, client.isLightweightSegmentDataEnabled());
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of isLightweightSegmentDataEnabled method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testIsLightweightSegmentDataEnabled() {
        try {
            client.isLightweightSegmentDataEnabled();
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of enableUnlabeledMarkerData method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testEnableUnlabeledMarkerData() {
        try {
            client.enableUnlabeledMarkerData();
            //TODO
            // wie kann ich überprüfen, dass jetzt unlabeld markes enabled sind
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of isSegmentDataEnabled method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testIsSegmentDataEnabled() {
        try {
            boolean result = client.isSegmentDataEnabled();
            //TODO
            // wie kann ich überprüfen, dass jetzt segment data eingeschaltet ist
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of isDebugDataEnabled method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testIsDebugDataEnabled() {
        try {
            boolean result = client.isDebugDataEnabled();
            //TODO
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of isMarkerDataEnabled method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testIsMarkerDataEnabled() {
        try {
            boolean result = client.isMarkerDataEnabled();
            //TODO
        // client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of isUnlabeledMarkerDataEnabled method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testIsUnlabeledMarkerDataEnabled() {
        try {
            boolean result = client.isUnlabeledMarkerDataEnabled();// client is not connected
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of setStreamMode method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testSetStreamMode() {
        //TODO
        StreamMode_Enum mode = StreamMode_Enum.ClientPull;
        try {
            client.setStreamMode(mode);
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
    }

    /**
     * Test of getFrameRateCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameRateCount() {
        getFrameRateCount();
    }

    private long getFrameRateCount(){
        try {
            return client.getFrameRateCount();
        } catch (RuntimeException e){
            Assumptions.assumeTrue(true, e.getLocalizedMessage());
        }
        return -1;
    }
    /**
     * Test of getFrameRateName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameRateName() {
        long frameRateCount = getFrameRateCount();
        for (int i=0;i<frameRateCount;i++){
            try {
                String result = client.getFrameRateName(i);
            } catch (IllegalArgumentException e){
                fail("Illegal frame rate type name index \""+String.valueOf(i)+"\"!");
            }
        }
    }

    /**
     * Test of getFrameRateValue method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameRateValue() {
        String FrameRateName = "";
        //TODO woher den frameRateName nehmen
        try {
            double result = client.getFrameRateValue(FrameRateName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }
    }

    /**
     * Test of getUnlabeledMarkerCount method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetUnlabeledMarkerCount() {
        try {
            long result = client.getUnlabeledMarkerCount();
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getFrameRate method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameRate() {
        try {
            double result = client.getFrameRate();
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getUnlabeledMarkerGlobalTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetUnlabeledMarkerGlobalTranslation_long() {
        long markerIndex = 0L;
        try {
            double[] result = client.getUnlabeledMarkerGlobalTranslation(markerIndex);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getSubjectCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSubjectCount() {
        try {
            long result = client.getSubjectCount();
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getSubjectName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSubjectName() {
        long subjectIndex = 0;
        //TODO
        
        try {
            String result = client.getSubjectName(subjectIndex);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }
        
    /**
     * Test of getSubjectRootSegmentName method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSubjectRootSegmentName() {
        try {
            String result = client.getSubjectRootSegmentName(subjectName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentCount() {
        try {
            long result = client.getSegmentCount(subjectName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentName() {
        long segmentIndex = 0L;
        String expResult = "";
        try {
            String result = client.getSegmentName(subjectName, segmentIndex);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentChildCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentChildCount() {
        try {
            long result = client.getSegmentChildCount(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        }
    }

    /**
     * Test of getSegmentChildName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentChildName() {
        long segmentIndex = 0L;
        try {
            String result = client.getSegmentChildName(subjectName, segmentName, segmentIndex);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        }
    }

    /**
     * Test of getSegmentParentName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentParentName() {
        try {
            String result = client.getSegmentParentName(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        }
    }

    /**
     * Test of getSegmentStaticTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticTranslation() {
        try {
            double[] result = client.getSegmentStaticTranslation(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        }    
    }

    /**
     * Test of getSegmentStaticRotationHelical method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticRotationHelical() {
        try {
            double[] result = client.getSegmentStaticRotationHelical(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentStaticRotationMatrix method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticRotationMatrix() {
        try {
            double[] result = client.getSegmentStaticRotationMatrix(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentStaticRotationQuaternion method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticRotationQuaternion() {
        try {
            double[] result = client.getSegmentStaticRotationQuaternion(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentStaticRotationEulerXYZ method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticRotationEulerXYZ() {
        try {
            double[] result = client.getSegmentStaticRotationEulerXYZ(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentGlobalTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalTranslation() {
        try {
            double[] result = client.getSegmentGlobalTranslation(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentLocalRotationHelical method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalRotationHelical() {
        try {
            double[] result = client.getSegmentLocalRotationHelical(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        } 
    }

    /**
     * Test of getSegmentGlobalRotationHelical method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalRotationHelical() {
        try {
            double[] result = client.getSegmentGlobalRotationHelical(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }    
    }

    /**
     * Test of getSegmentGlobalRotationMatrix method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalRotationMatrix() {
        try {
            double[] result = client.getSegmentGlobalRotationMatrix(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getSegmentGlobalRotationQuaternion method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalRotationQuaternion() {
        try {
            double[] result = client.getSegmentGlobalRotationQuaternion(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getSegmentGlobalRotationEulerXYZ method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalRotationEulerXYZ() {
        try {
            double[] result = client.getSegmentGlobalRotationEulerXYZ(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getSegmentLocalTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalTranslation() {
        try {
            double[] result = client.getSegmentLocalTranslation(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getSegmentLocalRotationQuaternion method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalRotationQuaternion() {
        try {
            double[] result = client.getSegmentLocalRotationQuaternion(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getSegmentLocalRotationEulerXYZ method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalRotationEulerXYZ() {
        try {
            double[] result = client.getSegmentLocalRotationEulerXYZ(subjectName, segmentName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getObjectQuality method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetObjectQuality() {
        try {
            double result = client.getObjectQuality(subjectName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getMarkerGlobalTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerGlobalTranslation() {
        try {
            double[] result = client.getMarkerGlobalTranslation(subjectName, markerName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getMarkerRayContributionCount method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerRayContributionCount() {
        try {
            long result = client.getMarkerRayContributionCount(subjectName, markerName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getMarkerRayContribution method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerRayContribution() {
        //TODO was soll dieses Argument?
        int MarkerRayContributionIndex = 0;
        try {
            long result = client.getMarkerRayContribution(subjectName, markerName, MarkerRayContributionIndex);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getMarkerCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerCount() {
        try {
            long result = client.getMarkerCount(subjectName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getUnlabeledMarkerGlobalTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetUnlabeledMarkerGlobalTranslation_int() {
        int markerIndex = 0;
        try {
            double[] result = client.getUnlabeledMarkerGlobalTranslation(markerIndex);
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        } 
    }

    /** 
     * Test of getDeviceCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetDeviceCount() {
        getDeviceCount();
    }

    private long getDeviceCount(){
        try {
            return client.getDeviceCount();
        } catch (RuntimeException e){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }
        return -1;
    }
    /**
     * Test of getDeviceName method, of class ViconDataStreamSDKClient.
     */
    @Test
    @DisplayName("getDeviceName()")
    void testGetDeviceName_int() {
        long deviceCount = getDeviceCount();
        for (int i=0;i<deviceCount;i++){
            try {
                String[] result = client.getDeviceName(i);
            } catch (IllegalArgumentException e){
                fail("Invalid device index \""+String.valueOf(i)+"\"!");
            }
        }
    }

    /**
     * Test of getDeviceOutputName method, of class ViconDataStreamSDKClient.
     */
    @Test
    @DisplayName("getDeviceOutputName()")
    void testGetDeviceOutputName() {
        String deviceName = "";
        //TODO woeher deviceName
        int deviceOutputIndex = 0 ;
        //TODO woher bekomme ich den index?
        try {
            String[] result = client.getDeviceOutputName(deviceName, deviceOutputIndex);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }  
    }

    /**
     * Test of getDeviceOutputValue method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetDeviceOutputValue() {
        String deviceName = "";
        String deviceOutputName = "";
        try {
            double result = client.getDeviceOutputValue(deviceName, deviceOutputName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        }
    }

    /**
     * Test of getDeviceOutputSubsamples method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetDeviceOutputSubsamples() {
        String deviceName = "";
        String deviceOutputName = "";
        try {
            long result = client.getDeviceOutputSubsamples(deviceName, deviceOutputName);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
        } 
    }

    /**
     * Test of getForcePlateCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetForcePlateCount() {
        getForcePlateCount(); 
    }

    private long getForcePlateCount(){
        try {
            return client.getForcePlateCount();
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(true,"No frame available!");
            return -1;
        } 
    }
    /**
     * Test of getForceVector method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetForceVector() {
        long forcePlateCount = getForcePlateCount();
        if (forcePlateCount == 0) Assumptions.assumeTrue(true,"No force plates available!");
        for (int i=0;i<forcePlateCount;i++){
            double[] result = client.getGlobalForceVector(i);
        }
    }

    /**
     * Test of getGlobalMomentVector method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalMomentVector() {
        long forcePlateCount = getForcePlateCount();
        if (forcePlateCount == 0) Assumptions.assumeTrue(true,"No force plates available!");
        for (int i=0;i<forcePlateCount;i++){
            double[] result = client.getGlobalMomentVector(i);
        }
    }

    /**
     * Test of getGlobalCentreOfPressure method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalCentreOfPressure_int() {
        long forcePlateCount = getForcePlateCount();
        if (forcePlateCount == 0) Assumptions.assumeTrue(true,"No force plates available!");
        for (int i=0;i<forcePlateCount;i++){
            double[] result = client.getGlobalCentreOfPressure(i);
        }
    }

    /**
     * Test of getForcePlateSubsamples method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetForcePlateSubsamples() {
        long forcePlateCount = getForcePlateCount();
        if (forcePlateCount == 0) Assumptions.assumeTrue(true,"No force plates available!");
        for (int i=0;i<forcePlateCount;i++){
            long result = client.getForcePlateSubsamples(i);
        }
    }

    /**
     * Test of getGlobalForceVector method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalForceVector() {
        int Subsample = 0;
        long forcePlateCount = getForcePlateCount();
        if (forcePlateCount == 0) Assumptions.assumeTrue(true,"No force plates available!");
        for (int i=0;i<forcePlateCount;i++){
            double[] result = client.getGlobalForceVector(i, Subsample);
        } 
    }

    /**
     * Test of getGlobalCentreOfPressure method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalCentreOfPressure_int_int() {
        long forcePlateCount = getForcePlateCount();
        if (forcePlateCount == 0) Assumptions.assumeTrue(true,"No force plates available!");
        int subsample = 0;
        //TODO wie spiele ich hier subsamples durch?
        for (int i=0;i<forcePlateCount;i++){
            client.getGlobalCentreOfPressure(i, subsample);
        }
    }

    /**
     * Test of getEyeTrackerCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetEyeTrackerCount() {
       getEyeTrackerCount();
    }
    
    private long getEyeTrackerCount(){
        try {
            return client.getEyeTrackerCount();
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
        return -1;
    }

    /**
     * Test of getEyeTrackerGlobalPosition method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetEyeTrackerGlobalPosition() {
        long eyeTrackerCount = getEyeTrackerCount();
        for (int i=0;i<eyeTrackerCount;i++){
            try {
                double[] result = client.getEyeTrackerGlobalPosition(i);
            } catch (IllegalArgumentException e){
                fail("Invalid eye tracker index \""+String.valueOf(i)+"\"!");
            }
        } 
    }

    /**
     * Test of getEyeTrackerGlobalGazeVector method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetEyeTrackerGlobalGazeVector() {
        long eyeTrackerCount = getEyeTrackerCount();
        for (int i=0;i<eyeTrackerCount;i++){
            client.getEyeTrackerGlobalGazeVector(i);
        }
    }

    /**
     * Test of enableCentroidData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableCentroidData() {
        try {
            client.enableCentroidData();
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
        } 
    }

    /**
     * Test of enableGreyscaleData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableGreyscaleData() {
        try {
            client.enableGreyscaleData();
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
        } 
    }

    /**
     * Test of enableVideoData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableVideoData() {
        try {
            client.enableVideoData(); 
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
        } 
    }

    /**
     * Test of getCameraCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetCameraCount() {
        long result = getCameraCount();
    }

    private long getCameraCount(){
        try {
            return client.getCameraCount();
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            return -1;
        } 
    }
        
    /**
     * Test of getCameraName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetCameraName() {
        long cameraCount = getCameraCount();
        for (int i=0;i<cameraCount;i++){
            try {
                String result = client.getCameraName(i);
            } catch (IllegalArgumentException e){
                fail("Wrong camera index \""+String.valueOf(i)+"\"!");
            }
        }
    }

    /**
     * Test of getMarkerName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerName() {
        try {
            long markerIndex = 0;
            String result = client.getMarkerName(subjectName, markerIndex);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getFrameNumber method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameNumber() {
        try {
            long result = client.getFrameNumber();
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getTimeCode method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetTimeCode() {
        TimeCode result = client.getTimeCode();
    }

    /**
     * Test of getFrame method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrame() {
        boolean result = client.getFrame();
    }

    /**
     * Test of delete method, of class ViconDataStreamSDKClient.
     */
    /*@Test
    void testDelete() {
        client.delete();
    }*/

    /**
     * Test of getSegmentLocalRotationMatrix method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalRotationMatrix() {
        double[] result = client.getSegmentLocalRotationMatrix(subjectName, segmentName);
    }
}
