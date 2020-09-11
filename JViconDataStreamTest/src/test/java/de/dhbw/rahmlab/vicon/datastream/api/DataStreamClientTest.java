package de.dhbw.rahmlab.vicon.datastream.api;

import de.dhbw.mobmonrob.vicon.datastreamapi.impl.StreamMode_Enum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Oliver Rettig
 */
public class DataStreamClientTest {
    
    public DataStreamClient client;
    
    //String hostname ="192.168.10.1:51001";//127.0.0.2:801";"192.168.10.1:51001"
    String hostname = "localhost";
       
    public DataStreamClientTest() {}
    
    // Achtung: Das wir vor dem Aufruf jeder Testmethode aufgerufen.
    // Ich will aber eigentlich das nur einmal aufgerufen haben!
    @BeforeEach
    public void setUp() {
        client = new DataStreamClient();
        Version version = client.getVersion();
        System.out.println("Version: " + version.getMajor() + "." + 
                version.getMinor() + "." + version.getPoint());
    }

    /**
     * Test of connect method, of class DataStreamClient.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        client.connect(hostname);
        if (client.isConnected()) {
            System.out.println("is conected");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of connectToMulticast method, of class DataStreamClient.
     */
    @Test
    public void testConnectToMulticast() {
        System.out.println("connectToMulticast");
        String multicastHostname = "";
        client.connectToMulticast(hostname, multicastHostname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startTransmittingMulticast method, of class DataStreamClient.
     */
    @Test
    public void testStartTransmittingMulticast() {
        System.out.println("startTransmittingMulticast");
        String serverIP = "";
        String multicastIP = "";
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.startTransmittingMulticast(serverIP, multicastIP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopTransmittingMulticast method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testStopTransmittingMulticast() {
        System.out.println("stopTransmittingMulticast");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.stopTransmittingMulticast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isConnected method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testIsConnected() {
        System.out.println("isConnected");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.isConnected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disconnect method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testDisconnect() {
        System.out.println("disconnect");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.disconnect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVersion method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        DataStreamClient instance = new DataStreamClient();
        Version expResult = null;
        Version result = instance.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceName method, of class ViconDataStreamSDKClient.
     */
    /*@Test
    public void testGetDeviceName_0args() {
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
    public void testEnableDebugData() {
        System.out.println("enableDebugData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableDebugData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableMarkerData method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testEnableMarkerData() {
        System.out.println("enableMarkerData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableMarkerData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableDeviceData method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testEnableDeviceData() {
        System.out.println("enableDeviceData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableDeviceData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableMarkerRayData method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testEnableMarkerRayData() {
        System.out.println("enableMarkerRayData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableMarkerRayData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableSegmentData method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testEnableSegmentData() {
        System.out.println("enableSegmentData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableSegmentData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disableSegmentData method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testDisableSegmentData() {
        System.out.println("disableSegmentData");
        DataStreamClient instance = new DataStreamClient();
        instance.disableSegmentData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableLightweightSegmentData method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testEnableLightweightSegmentData() {
        System.out.println("enableLightweightSegmentData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableLightweightSegmentData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLightweightSegmentDataEnabled method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testIsLightweightSegmentDataEnabled() {
        System.out.println("isLightweightSegmentDataEnabled");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.isLightweightSegmentDataEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableUnlabeledMarkerData method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testEnableUnlabeledMarkerData() {
        System.out.println("enableUnlabeledMarkerData");
        DataStreamClient instance = new DataStreamClient();
        instance.enableUnlabeledMarkerData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSegmentDataEnabled method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testIsSegmentDataEnabled() {
        System.out.println("isSegmentDataEnabled");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.isSegmentDataEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDebugDataEnabled method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testIsDebugDataEnabled() {
        System.out.println("isDebugDataEnabled");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.isDebugDataEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarkerDataEnabled method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testIsMarkerDataEnabled() {
        System.out.println("isMarkerDataEnabled");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.isMarkerDataEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUnlabeledMarkerDataEnabled method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testIsUnlabeledMarkerDataEnabled() {
        System.out.println("isUnlabeledMarkerDataEnabled");
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.isUnlabeledMarkerDataEnabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStreamMode method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testSetStreamMode() {
        System.out.println("setStreamMode");
        StreamMode_Enum mode = null;
        DataStreamClient instance = new DataStreamClient();
        instance.setStreamMode(mode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrameRateCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetFrameRateCount() {
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
    public void testGetFrameRateName() {
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
    public void testGetFrameRateValue() {
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
     * Test of getUnlabeledMarkerCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetUnlabeledMarkerCount() {
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
    public void testGetFrameRate() {
        System.out.println("getFrameRate");
        DataStreamClient instance = new DataStreamClient();
        double expResult = 0.0;
        double result = instance.getFrameRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnlabeledMarkerGlobalTranslation method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetUnlabeledMarkerGlobalTranslation_long() {
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
    public void testGetSubjectCount() {
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
    public void testGetSubjectName() {
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
     * Test of getSubjectRootSegmentName method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSubjectRootSegmentName() {
        System.out.println("getSubjectRootSegmentName");
        String subjectName = "";
        DataStreamClient instance = new DataStreamClient();
        String expResult = "";
        String result = instance.getSubjectRootSegmentName(subjectName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentCount() {
        System.out.println("getSegmentCount");
        String subjectName = "";
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getSegmentCount(subjectName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentName method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentName() {
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
    public void testGetSegmentChildCount() {
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
    public void testGetSegmentChildName() {
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
    public void testGetSegmentParentName() {
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
     * Test of getSegmentStaticTranslation method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentStaticTranslation() {
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
     * Test of getSegmentStaticRotationHelical method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentStaticRotationHelical() {
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
     * Test of getSegmentStaticRotationMatrix method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentStaticRotationMatrix() {
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
     * Test of getSegmentStaticRotationQuaternion method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentStaticRotationQuaternion() {
        System.out.println("getSegmentStaticRotationQuaternion");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentStaticRotationQuaternion(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentStaticRotationEulerXYZ method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentStaticRotationEulerXYZ() {
        System.out.println("getSegmentStaticRotationEulerXYZ");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentStaticRotationEulerXYZ(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentGlobalTranslation method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentGlobalTranslation() {
        System.out.println("getSegmentGlobalTranslation");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentGlobalTranslation(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentLocalRotationHelical method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentLocalRotationHelical() {
        System.out.println("getSegmentLocalRotationHelical");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentLocalRotationHelical(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentGlobalRotationHelical method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentGlobalRotationHelical() {
        System.out.println("getSegmentGlobalRotationHelical");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentGlobalRotationHelical(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentGlobalRotationMatrix method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentGlobalRotationMatrix() {
        System.out.println("getSegmentGlobalRotationMatrix");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentGlobalRotationMatrix(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentGlobalRotationQuaternion method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentGlobalRotationQuaternion() {
        System.out.println("getSegmentGlobalRotationQuaternion");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentGlobalRotationQuaternion(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentGlobalRotationEulerXYZ method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentGlobalRotationEulerXYZ() {
        System.out.println("getSegmentGlobalRotationEulerXYZ");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentGlobalRotationEulerXYZ(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentLocalTranslation method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentLocalTranslation() {
        System.out.println("getSegmentLocalTranslation");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentLocalTranslation(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentLocalRotationQuaternion method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentLocalRotationQuaternion() {
        System.out.println("getSegmentLocalRotationQuaternion");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentLocalRotationQuaternion(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentLocalRotationEulerXYZ method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentLocalRotationEulerXYZ() {
        System.out.println("getSegmentLocalRotationEulerXYZ");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentLocalRotationEulerXYZ(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectQuality method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetObjectQuality() {
        System.out.println("getObjectQuality");
        String subjectName = "";
        DataStreamClient instance = new DataStreamClient();
        double expResult = 0.0;
        double result = instance.getObjectQuality(subjectName);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkerGlobalTranslation method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetMarkerGlobalTranslation() {
        System.out.println("getMarkerGlobalTranslation");
        String subjectName = "";
        String markerName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getMarkerGlobalTranslation(subjectName, markerName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkerRayContributionCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetMarkerRayContributionCount() {
        System.out.println("getMarkerRayContributionCount");
        String subjectName = "";
        String markerName = "";
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getMarkerRayContributionCount(subjectName, markerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkerRayContribution method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetMarkerRayContribution() {
        System.out.println("getMarkerRayContribution");
        String subjectName = "";
        String markerName = "";
        int MarkerRayContributionIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getMarkerRayContribution(subjectName, markerName, MarkerRayContributionIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarkerCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetMarkerCount() {
        System.out.println("getMarkerCount");
        String subjectName = "";
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getMarkerCount(subjectName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnlabeledMarkerGlobalTranslation method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetUnlabeledMarkerGlobalTranslation_int() {
        System.out.println("getUnlabeledMarkerGlobalTranslation");
        int markerIndex = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getUnlabeledMarkerGlobalTranslation(markerIndex);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviceCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetDeviceCount() {
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
    public void testGetDeviceName_int() {
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
    public void testGetDeviceOutputName() {
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
    public void testGetDeviceOutputValue() {
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
     * Test of getDeviceOutputSubsamples method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetDeviceOutputSubsamples() {
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
    public void testGetForcePlateCount() {
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
    public void testGetForceVector() {
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
    public void testGetGlobalMomentVector() {
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
     * Test of getGlobalCentreOfPressure method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetGlobalCentreOfPressure_int() {
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
     * Test of getForcePlateSubsamples method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetForcePlateSubsamples() {
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
    public void testGetGlobalForceVector() {
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
    public void testGetGlobalMomentVecto() {
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
     * Test of getGlobalCentreOfPressure method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetGlobalCentreOfPressure_int_int() {
        System.out.println("getGlobalCentreOfPressure");
        int ForceplateIndex = 0;
        int subsample = 0;
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getGlobalCentreOfPressure(ForceplateIndex, subsample);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEyeTrackerCount method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetEyeTrackerCount() {
        System.out.println("getEyeTrackerCount");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getEyeTrackerCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEyeTrackerGlobalPosition method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetEyeTrackerGlobalPosition() {
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
     * Test of getEyeTrackerGlobalGazeVector method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetEyeTrackerGlobalGazeVector() {
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
    public void testEnableCentroidData() {
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
    public void testEnableGreyscaleData() {
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
    public void testEnableVideoData() {
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
    public void testGetCameraCount() {
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
    public void testGetCameraName() {
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
    public void testGetMarkerName() {
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
    public void testGetFrameNumber() {
        System.out.println("getFrameNumber");
        DataStreamClient instance = new DataStreamClient();
        long expResult = 0L;
        long result = instance.getFrameNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeCode method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetTimeCode() {
        System.out.println("getTimeCode");
        DataStreamClient instance = new DataStreamClient();
        TimeCode expResult = null;
        TimeCode result = instance.getTimeCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrame method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetFrame() {
        System.out.println("getFrame");
        boolean waiting = false;
        DataStreamClient instance = new DataStreamClient();
        boolean expResult = false;
        boolean result = instance.getFrame(waiting);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        DataStreamClient instance = new DataStreamClient();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegmentLocalRotationMatrix method, of class ViconDataStreamSDKClient.
     */
    @Test
    public void testGetSegmentLocalRotationMatrix() {
        System.out.println("getSegmentLocalRotationMatrix");
        String subjectName = "";
        String segmentName = "";
        DataStreamClient instance = new DataStreamClient();
        double[] expResult = null;
        double[] result = instance.getSegmentLocalRotationMatrix(subjectName, segmentName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
