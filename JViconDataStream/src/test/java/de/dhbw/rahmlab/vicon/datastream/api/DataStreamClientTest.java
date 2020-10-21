package de.dhbw.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.impl.StreamMode_Enum;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
 * TODO
 * - Tests vervollständigen
 * - Tags einführen, um die Tests zu gruppieren
 * 
 * - As of JUnit Jupiter 5.4, it is also possible to use methods from JUnit 4’s 
 *   org.junit.Assume class for assumptions. Specifically, JUnit Jupiter supports 
 *   JUnit 4’s AssumptionViolatedException to signal that a test should be aborted 
 *   instead of marked as a failure. 
 * 
 * @author Oliver Rettig
 */
@TestInstance(Lifecycle.PER_CLASS)
class DataStreamClientTest {
    
    DataStreamClient client = new DataStreamClient();
    
    //String hostname ="192.168.10.1:51001";//127.0.0.2:801";"192.168.10.1:51001"
    String hostname = "192.168.10.1";

    String subjectName = "GLOBE";
    String segmentName = "GLOBE";
    String markerName = "GLOBE1";
        
    DataStreamClientTest() {}

    @BeforeAll
    void setUp() {
        Version version = client.getVersion();
        System.out.println("Version: " + version.getMajor() + "." + 
                version.getMinor() + "." + version.getPoint());
        client.connect(hostname, 4000l);
    }

    @AfterAll
    void close() {
        if (client.isConnected()) {
            client.disconnect();
        }
        client.delete();
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
        Assumptions.assumeTrue(client.isConnected(),"Client is not connected!");
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
        Version result = client.getVersion();
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
            client.enableMarkerData();
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
            client.enableDeviceData();
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
        System.out.println("getFrameRateCount");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getFrameRateCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrameRateName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameRateName() {
        System.out.println("getFrameRateName");
        long FrameRateIndex = 0L;
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String result = instance.getFrameRateName(FrameRateIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrameRateValue method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameRateValue() {
        System.out.println("getFrameRateValue");
        String FrameRateName = "";
        DataStreamClient instance = new DataStreamClient();
        double expResult = 0.0;
        double result = instance.getFrameRateValue(FrameRateName);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnlabeledMarkerCount method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetUnlabeledMarkerCount() {
        System.out.println("getUnlabeledMarkerCount");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getUnlabeledMarkerCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrameRate method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameRate() {
        System.out.println("getFrameRate");
        DataStreamClient instance = new DataStreamClient();
        double expResult = 0.0;
        double result = instance.getFrameRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnlabeledMarkerGlobalTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetUnlabeledMarkerGlobalTranslation_long() {
        System.out.println("getUnlabeledMarkerGlobalTranslation");
        long markerIndex = 0L;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getUnlabeledMarkerGlobalTranslation(markerIndex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSubjectCount() {
        System.out.println("getSubjectCount");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getSubjectCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSubjectName() {
        System.out.println("getSubjectName");
        long subjectIndex = 0L;
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String result = instance.getSubjectName(subjectIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubjectRootSegmentName method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSubjectRootSegmentName() {
        try {
            String result = client.getSubjectRootSegmentName(subjectName);
        // wrong subject name
        } catch (IllegalArgumentException e){
                
        // not connected
        } catch (RuntimeException e){
        
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
        System.out.println("getSegmentName");
        String subjectName = "";
        long segmentIndex = 0L;
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String result = instance.getSegmentName(subjectName, segmentIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentChildCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentChildCount() {
        System.out.println("getSegmentChildCount");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getSegmentChildCount(subjectName, segmentName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentChildName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentChildName() {
        System.out.println("getSegmentChildName");
        String subjectName = "";
        String segmentName = "";
        long segmentIndex = 0L;
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String result = instance.getSegmentChildName(subjectName, segmentName, segmentIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentParentName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentParentName() {
        System.out.println("getSegmentParentName");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String result = instance.getSegmentParentName(subjectName, segmentName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentStaticTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticTranslation() {
        System.out.println("getSegmentStaticTranslation");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentStaticTranslation(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentStaticRotationHelical method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticRotationHelical() {
        System.out.println("getSegmentStaticRotationHelical");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentStaticRotationHelical(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentStaticRotationMatrix method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticRotationMatrix() {
        System.out.println("getSegmentStaticRotationMatrix");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentStaticRotationMatrix(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentStaticRotationQuaternion method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentStaticRotationQuaternion() {
        System.out.println("getSegmentStaticRotationQuaternion");
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentStaticRotationQuaternion(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
            fail(e.getMessage());
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
        double[] result = client.getSegmentGlobalTranslation(subjectName, segmentName);
    }

    /**
     * Test of getSegmentLocalRotationHelical method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalRotationHelical() {
        double[] result = client.getSegmentLocalRotationHelical(subjectName, segmentName);
    }

    /**
     * Test of getSegmentGlobalRotationHelical method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalRotationHelical() {
        double[] result = client.getSegmentGlobalRotationHelical(subjectName, segmentName);
    }

    /**
     * Test of getSegmentGlobalRotationMatrix method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalRotationMatrix() {
        double[] result = client.getSegmentGlobalRotationMatrix(subjectName, segmentName);
    }

    /**
     * Test of getSegmentGlobalRotationQuaternion method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalRotationQuaternion() {
        double[] result = client.getSegmentGlobalRotationQuaternion(subjectName, segmentName);
    }

    /**
     * Test of getSegmentGlobalRotationEulerXYZ method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentGlobalRotationEulerXYZ() {
        double[] result = client.getSegmentGlobalRotationEulerXYZ(subjectName, segmentName);
    }

    /**
     * Test of getSegmentLocalTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalTranslation() {
        double[] result = client.getSegmentLocalTranslation(subjectName, segmentName);
    }

    /**
     * Test of getSegmentLocalRotationQuaternion method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalRotationQuaternion() {
        double[] result = client.getSegmentLocalRotationQuaternion(subjectName, segmentName);
    }

    /**
     * Test of getSegmentLocalRotationEulerXYZ method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetSegmentLocalRotationEulerXYZ() {
        double[] result = client.getSegmentLocalRotationEulerXYZ(subjectName, segmentName);
    }

    /**
     * Test of getObjectQuality method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetObjectQuality() {
        double result = client.getObjectQuality(subjectName);
    }

    /**
     * Test of getMarkerGlobalTranslation method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerGlobalTranslation() {
        double[] result = client.getMarkerGlobalTranslation(subjectName, markerName);
    }

    /**
     * Test of getMarkerRayContributionCount method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerRayContributionCount() {
        long result = client.getMarkerRayContributionCount(subjectName, markerName);
    }

    /**
     * Test of getMarkerRayContribution method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerRayContribution() {
        //TODO was soll dieses Argument?
        int MarkerRayContributionIndex = 0;
        long result = client.getMarkerRayContribution(subjectName, markerName, MarkerRayContributionIndex);
    }

    /**
     * Test of getMarkerCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerCount() {
        long result = client.getMarkerCount(subjectName);
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
        System.out.println("getDeviceCount");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getDeviceCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetDeviceName_int() {
        System.out.println("getDeviceName");
        int deviceIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String[] result = instance.getDeviceName(deviceIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceOutputName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetDeviceOutputName() {
        System.out.println("getDeviceOutputName");
        String deviceName = "";
        int deviceIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String[] result = instance.getDeviceOutputName(deviceName, deviceIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceOutputValue method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetDeviceOutputValue() {
        System.out.println("getDeviceOutputValue");
        String deviceName = "";
        String deviceOutputName = "";
        DataStreamClient instance = new DataStreamClient();
        double expResult = 0.0;
        double result = instance.getDeviceOutputValue(deviceName, deviceOutputName);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceOutputSubsamples method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetDeviceOutputSubsamples() {
        System.out.println("getDeviceOutputSubsamples");
        String deviceName = "";
        String deviceOutputName = "";
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getDeviceOutputSubsamples(deviceName, deviceOutputName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForcePlateCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetForcePlateCount() {
        System.out.println("getForcePlateCount");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getForcePlateCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForceVector method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetForceVector() {
        System.out.println("getForceVector");
        int ForceplateIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getGlobalForceVector(ForceplateIndex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGlobalMomentVector method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalMomentVector() {
        System.out.println("getGlobalMomentVector");
        int ForceplateIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getGlobalMomentVector(ForceplateIndex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGlobalCentreOfPressure method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalCentreOfPressure_int() {
        System.out.println("getGlobalCentreOfPressure");
        int ForceplateIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getGlobalCentreOfPressure(ForceplateIndex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForcePlateSubsamples method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetForcePlateSubsamples() {
        System.out.println("getForcePlateSubsamples");
        int ForceplateIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getForcePlateSubsamples(ForceplateIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGlobalForceVector method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalForceVector() {
        System.out.println("getGlobalForceVector");
        int ForceplateIndex = 0;
        int Subsample = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getGlobalForceVector(ForceplateIndex, Subsample);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGlobalMomentVecto method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalMomentVecto() {
        System.out.println("getGlobalMomentVecto");
        int ForceplateIndex = 0;
        int Subsample = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getGlobalMomentVector(ForceplateIndex, Subsample);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGlobalCentreOfPressure method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetGlobalCentreOfPressure_int_int() {
        int ForceplateIndex = 0;
        int subsample = 0;
        try {
            double[] result = client.getGlobalCentreOfPressure(ForceplateIndex, subsample);
        } catch (IllegalArgumentException e){
            Assumptions.assumeTrue(false,e.getLocalizedMessage());
        } catch (RuntimeException f){
            Assumptions.assumeTrue(client.isConnected(), "Client is not connected!");
            Assumptions.assumeTrue(false,"No frame available!");
        } 
    }

    /**
     * Test of getEyeTrackerCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetEyeTrackerCount() {
        System.out.println("getEyeTrackerCount");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getEyeTrackerCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEyeTrackerGlobalPosition method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetEyeTrackerGlobalPosition() {
        System.out.println("getEyeTrackerGlobalPosition");
        int EyeTrackerIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getEyeTrackerGlobalPosition(EyeTrackerIndex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEyeTrackerGlobalGazeVector method, of class
     * ViconDataStreamSDKClient.
     */
    @Test
    void testGetEyeTrackerGlobalGazeVector() {
        System.out.println("getEyeTrackerGlobalGazeVector");
        int EyeTrackerIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getEyeTrackerGlobalGazeVector(EyeTrackerIndex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableCentroidData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableCentroidData() {
        System.out.println("enableCentroidData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableCentroidData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableGreyscaleData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableGreyscaleData() {
        System.out.println("enableGreyscaleData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableGreyscaleData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableVideoData method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testEnableVideoData() {
        System.out.println("enableVideoData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableVideoData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCameraCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetCameraCount() {
        System.out.println("getCameraCount");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getCameraCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCameraName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetCameraName() {
        System.out.println("getCameraName");
        int CameraIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String result = instance.getCameraName(CameraIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkerName method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetMarkerName() {
        System.out.println("getMarkerName");
        String subjectName = "";
        long markerIndex = 0L;
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String result = instance.getMarkerName(subjectName, markerIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrameNumber method, of class ViconDataStreamSDKClient.
     */
    @Test
    void testGetFrameNumber() {
        System.out.println("getFrameNumber");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = client.getFrameNumber();
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
        boolean waiting = false;
        boolean result = client.getFrame(waiting);
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
