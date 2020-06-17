package de.dhbw.mobmonrob.vicon.datastreamapi.api;

import de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconString;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Client;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_Connect;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_Disconnect;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableCentroidData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableLightweightSegmentData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableSegmentData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableMarkerData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableUnlabeledMarkerData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetCameraCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetCameraId;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetCameraName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsSegmentDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsUnlabeledMarkerDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetFrameRateCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetFrameNumber;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetFrameRate;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetMarkerCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetFrameRateName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetFrameRateValue;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetMarkerGlobalTranslation;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetMarkerName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsMarkerDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSubjectCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSubjectName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSubjectRootSegmentName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentChildName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentChildCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentParentName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentStaticTranslation;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentStaticRotationHelical;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentStaticRotationMatrix;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentStaticRotationQuaternion;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentStaticRotationEulerXYZ;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalTranslation;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentLocalRotationEulerXYZ;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentLocalRotationHelical;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentLocalRotationQuaternion;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentLocalTranslation;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentLocalRotationMatrix;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetMarkerRayContribution;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetMarkerRayContributionCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceOutputName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceOutputSubsamples;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceOutputValue;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetEyeTrackerCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetEyeTrackerGlobalGazeVector;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetEyeTrackerGlobalPosition;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetForcePlateCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetForcePlateSubsamples;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetGlobalCentreOfPressure;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetGlobalForceVector;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetGlobalMomentVector;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetObjectQuality;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalRotationEulerXYZ;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalRotationHelical;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalRotationMatrix;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalRotationQuaternion;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetUnlabeledMarkerCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetUnlabeledMarkerGlobalTranslation;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Result_Enum;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Oliver Rettig
 */
public class ViconDataStreamSDKClient {

    private final Client client;

    static {
        try {
            // Adding a directory to java.library.path here will not change anything.
            // System.loadLibrary will still look in the directories listed in java.library.path
            // as it existed at the very start of the program.
            // The extra directory path added to java.library.path will not
            // be searched by loadLibrary.
            //String libpath = System.getProperty("java.library.path");
            //libpath = libpath + ";V:\\Hardware\\Platformen\\Mir\\PROJECTS\\ViconDataStream\\libs";
            //System.setProperty("java.library.path",libpath);

            //System.out.println(System.getProperty("java.library.path"));
            System.loadLibrary("jViconDataStreamSDK");
        } catch (UnsatisfiedLinkError e) {
            System.out.println(System.getProperty("java.library.path"));
            System.err.println("Native code library failed to load. See the chapter on Dynamic Linking Problems in the SWIG Java documentation for help.\n" + e);
            System.exit(1);
        }
    }

    /**
     * You can create many instances of the Vicon DataStream Client which can
     * connect to multiple Vicon DataStream Servers.
     */
    public ViconDataStreamSDKClient() {
        client = new Client();
    }

    /**
     * Establish a dedicated connection to a Vicon DataStream Server.
     *
     * See Also : ConnectToMulticast, Disconnect, IsConnected<p>
     *
     * @param hostname The DNS identifiable name, or IP address of the PC
     * hosting the DataStream server. The function defaults to connecting on
     * port 801. You can specify an alternate port number after a colon. E.g.:
     * "localhost" "MyViconPC:804", "10.0.0.2"
     *
     * @throws RuntimeException if given hostname is invalid
     */
    public void connect(String hostname) {
        while (!isConnected()) {

            Output_Connect result = client.Connect(new ViconString(hostname));

            //Output_ConnectToMulticast result = client.ConnectToMulticast(new ViconString(hostname), new ViconString(hostname));
            // tritt seltsamerweise auch für localhost ab und zu auf
            //if (result.getResult() == Result_Enum.InvalidHostName) 
            //    throw new RuntimeException("connect() but invalid hostname \""+hostname+"\"!");
            //if (result.getResult() == Result_Enum.ClientAlreadyConnected) 
            //  throw new RuntimeException("Client is Already Connected ");
            //if (result.getResult() == Result_Enum.ClientConnectionFailed) 
            //throw new RuntimeException("Client Connection is Failed ");
            // Result.Success --> beendet die while schleife
            // Result.ClientAlreadyConnected --> kann innerhalb der while schleife nicht auftreten
            // Result.ClientConnectionFailed --> dafür ist die while schleife da
            //System.out.println("connect result = \""+result.getResult().toString()+"\"!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ViconDataStreamSDKClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Discover whether client is connected to the Vicon DataStream Server.
     *
     * See Also : Connect, Disconnect<p>
     *
     * @return true, if you are connected to the stream, otherwise false.
     */
    public boolean isConnected() {
        return client.IsConnected().getConnected();
    }

    /**
     * Disconnect from the Vicon DataStream Server.
     *
     * See Also : Connect, IsConnected<p>
     *
     * @return success status
     */
    public boolean disconnect() {
        Output_Disconnect result = client.Disconnect();
        if (result.getResult().equals(Result_Enum.Success)) {
            return true;
        } else if (result.getResult().equals(Result_Enum.NotConnected)) {
            System.out.println("disconnect: but client was not connected!");
        }
        return false;
    }

    /**
     * Get the version of the Vicon DataStream SDK.
     *
     * @return version /** Get the version of the Vicon DataStream SDK.
     *
     * @return version
     */
    public Version getVersion() {
        return new Version(client.GetVersion());
    }

    public DeviceName getDeviceName() {
        int DeviceIndex = 0;
        return new DeviceName(client.GetDeviceName(DeviceIndex));
    }

    /**
     * Enable labeled reconstructed marker data in the Vicon DataStream.
     *
     * Call this function on startup, after connecting to the server, and before
     * trying to read labeled marker data.<p>
     *
     * See Also : IsMarkerDataEnabled, DisableMarkerData, EnableSegmentData,
     * EnableUnlabelledMarkerData, EnableDeviceData, GetMarkerCount,
     * GetMarkerName, GetMarkerGlobalTranslation
     */
    public void enableMarkerData() {
        Output_EnableMarkerData result = client.EnableMarkerData();
        //System.out.println("Enable marker data: "+result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("enableMarkerData() but client was not connected!");
        }
    }

    /**
     * Enable kinematic segment data in the Vicon DataStream.
     *
     * You should call this function on startup, after connecting to the server,
     * and before trying to read local or global segment data.<p>
     *
     * See Also : IsSegmetnDataEnabled, DisableSegmentData, EnableMarkerData,
     * EnableUnlabelledMarkerData, EnableDeviceData, GetSegmentCount,
     * GetSegmentName, GetSegmentGlobalTranslation, GetSegmentGlobalRotationXXX,
     * GetSegmentLocalTranslation, GetSegmentLocalRotationXXX
     */
    public void enableSegmentData() {
        Output_EnableSegmentData result = client.EnableSegmentData();
        System.out.println("Enable segment data: " + result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("enableSegmentData() but client was not connected!");
        }
    }

    public void enableLightweightSegmentData() {
        Output_EnableLightweightSegmentData result = client.EnableLightweightSegmentData();
        System.out.println("Enable Light weight Segment Data : " + result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("enableLightweightSegmentData () but client was not connected!");
        }
    }

    public boolean isLightweightSegmentDataEnabled() {
        return client.IsLightweightSegmentDataEnabled().getEnabled();
    }

    /**
     * Enable unlabeled reconstructed marker data in the Vicon DataStream.
     *
     * You should call this function on startup, after connecting to the server,
     * and before trying to read global unlabeled marker data.<p>
     *
     * See Also : IsUnlabeledMarkerDataEnabled, DisableUnlabeledMarkerData,
     * EnableSegmentData, EnableMarkerData, EnableDeviceData,
     * GetUnlabeledMarkerCount, GetUnlabeledMarkerGlobalTranslation
     *
     * @throws RuntimeException, if client not connected.
     *
     */
    public void enableUnlabeledMarkerData() {
        Output_EnableUnlabeledMarkerData result = client.EnableUnlabeledMarkerData();
        //System.out.println("Enable unlabeled marker data: "+result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("enableUnlabeledMarkerData() but client was not connected!");
        }
    }

    public boolean isSegmentDataEnabled() {
        Output_IsSegmentDataEnabled result = client.IsSegmentDataEnabled();
        return result.getEnabled();
    }

    public boolean isMarkerDataEnabled() {
        Output_IsMarkerDataEnabled result = client.IsMarkerDataEnabled();
        return result.getEnabled();
    }

    public boolean isUnlabeledMarkerDataEnabled() {
        Output_IsUnlabeledMarkerDataEnabled result = client.IsUnlabeledMarkerDataEnabled();
        return result.getEnabled();
    }

    /**
     * Streaming operator for String
     *
     * In der Header Datien ist auskommentiert da in Java Operatoren nicht
     * umdefiniert werden können Deshalb ist client.SetStreamMode in client.java
     * nicht zu finden
     *
     * void public setStreamMode(String StramMode){ Output_SetStreamMode result
     * = client.SetstreamMode); } /** Return the number of unlabeled markers in
     * the data stream.
     *
     * This information can be used in conjunction with
     * GetGlobalUnlabeledMarkerTranslation.<p>
     *
     * @return The number of unlabeled markers.
     */
    public long getFrameRateCount() {
        Output_GetFrameRateCount result = client.GetFrameRateCount();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("GetFrameRateCount() but client was not connected!");
        }
        return result.getCount();
    }

    public String getFrameRateName(long FrameRateIndex) {

        //Output_GetFrameRateCount  result = client.GetFrameRateCount();
        //String FrameRateName = null;
        //if (result.getCount()>0 && result.getCount() > FrameRateIndex){
        Output_GetFrameRateName result = client.GetFrameRateName(FrameRateIndex);
        String FrameRateName = result.getName().toString();
        //  if (result.getResult() == Result_Enum.InvalidFrameRateName) throw new RuntimeException("getFrameRateName() but FrameRateName \""+FrameRateName+"\" is invalid!");
        // there is no InvalidFrameRateName in header file 
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getFrameRateName() but client is not connected!!");
        }

        return FrameRateName;
    }

    public double getFrameRateValue(String FrameRateName) {
        Output_GetFrameRateValue result = client.GetFrameRateValue(new ViconString(FrameRateName));
        //  if (result.getResult() == Result_Enum.InvalidFrameRateName) 
        //  throw new RuntimeException("getFrameRateName() but FrameRateName \""+FrameRateName+"\" is invalid!");
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getFrameRateName() but client is not connected!!");
        }

        return result.getValue();
    }

    public long getUnlabeledMarkerCount() {
        Output_GetUnlabeledMarkerCount result = client.GetUnlabeledMarkerCount();
        // System.out.println("Get unlabeled marker count: "+result.getResult().toString());
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getUnlabeledMarkerCount() invoked but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getUnlabeledMarkerCount() but client is not connected!!");
        }
        return result.getMarkerCount();
    }

    public double getFrameRate() {
        Output_GetFrameRate result = client.GetFrameRate();
        // System.out.println("Frame rate is "+result.getFrameRateHz());
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getFrameRate() invoked but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getFrameRate() but client is not connected!!");
        }
        return result.getFrameRateHz();
    }

    public double[] getUnlabeledMarkerGlobalTranslation(long markerIndex) {
        Output_GetUnlabeledMarkerGlobalTranslation result = client.GetUnlabeledMarkerGlobalTranslation(markerIndex);
        //System.out.println("Get unlabeled marker global translation: "+result.getResult().toString());
        return result.getTranslation();
    }

    /**
     * Return the number of subjects in the DataStream.
     *
     * This information can be used in conjunction with GetSubjectName.<p>
     * precondition: invoke GetFrame(); if this is not invoked before you can an
     * error "NO FRAME AVAILABLE".
     *
     * See Also : GetSubjectName<p>
     *
     * @return subject count >=0
     * @throws RuntimeException if no frame available.
     *
     */
    public long getSubjectCount() {
        Output_GetSubjectCount result = client.GetSubjectCount();
        //System.out.println("Get subject count: "+result.getResult().toString());
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSubjectCount() invoked but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSubjectCount() but client is not connected!!");
        }
        return result.getSubjectCount();
    }

    /**
     * Return the name of a subject.
     *
     * This can be passed into segment and marker functions.<p>
     *
     * See Also : GetSubjectCount<p>
     *
     * @param subjectIndex between 0 and getSubjectCount()-1
     * @return The name of the subject.
     * @throw new RuntimeException if subject index is invalid.
     * @throw IllegalArgumentException, if subjectIndex <0
     */
    public String getSubjectName(long subjectIndex) {
        if (subjectIndex < 0) {
            throw new IllegalArgumentException("getSubjectName() subjectIndex >=0 is needed!");
        }
        System.out.println("getSubjectName() reached");
        long subjectCount = getSubjectCount();
        System.out.println("getSubjectCount() subject count = " + subjectCount);
        if (subjectIndex >= subjectCount) {
            throw new IllegalArgumentException("getSubjectName() subjectIndex >=subject count is needed!");
        }
        System.out.println("getSubsectName() index = " + subjectIndex);
        Output_GetSubjectName result = client.GetSubjectName(subjectIndex);

        System.out.println("getSubsectName() index = " + subjectIndex);//warum?

        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getSubjectName() but subjectIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSubjectName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSubjectName() but client is not connected!!");
        }
        //String SubjectName = null;
        //if (result.getResult()==Result_Enum.Success){
        String SubjectName = result.getSubjectName().toString();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return SubjectName;
    }

    /*
    Return the name of the root segment for a specified subject. 
    This can be passed into segment functions.
    The root segment is the ancestor of all other segments in the subject.
     */
    public String getSubjectRootSegmentName(String subjectName) {
        Output_GetSubjectRootSegmentName result = client.GetSubjectRootSegmentName(new ViconString(subjectName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("GetSubjectRootSegmentName() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("GetSubjectRootSegmentName() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("GetSubjectRootSegmentName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("GetSubjectRootSegmentName() but segmentIndex \"\" is invalid!");
        }
        String SegmentName = result.getSegmentName().toString();
        //System.out.println("Get segment name: "+SegmentName);
        return SegmentName;
    }

    /**
     * Return the number of segments for a specified subject in the DataStream.
     *
     * This information can be used in conjunction with GetSegmentName<p>
     *
     * See Also : GetSubjectName, GetSegmentName<p>
     *
     * @param subjectName
     * @return segment count
     * @throws RuntimeException if subjectName is invalid, client is not
     * connected or no frame available.
     */
    public long getSegmentCount(String subjectName) {
        Output_GetSegmentCount result = client.GetSegmentCount(new ViconString(subjectName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentCount() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentCount() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentCount() but client is not connected!!");
        }
        System.out.println("Get segment count: " + result.getResult().toString());
        return result.getSegmentCount();
    }

    /**
     * Return the name of a subject segment specified by index.
     *
     * See Also : GetSegmentCount, GetSegmentChildCount, GetSegmentChildName,
     * GetSubjectRootSegmentName<p>
     *
     * @param subjectName The name of the subject.
     * @param segmentIndex The index of the segment.
     * @return The name of the parent segment of an empty string if it is the
     * root segment.
     * @throws RuntimeException if the client is not connected, the subjectName
     * is not valid, the segment index is invalid or if no frame available
     */
    public String getSegmentName(String subjectName, long segmentIndex) {
        Output_GetSegmentName result = client.GetSegmentName(new ViconString(subjectName), segmentIndex);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentName() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentName() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getSegmentName() but segmentIndex \"" + segmentIndex + "\" is invalid!");
        }
        String SegmentName = result.getSegmentName().toString();
        //System.out.println("Get segment name: "+SegmentName);
        return SegmentName;
    }

    public long getSegmentChildCount(String subjectName, String segmentName) {
        Output_GetSegmentChildCount result = client.GetSegmentChildCount(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentChildCount() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentChildCount() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentChildCount() but client is not connected!!");
        }
        System.out.println("get Segment Child Count: " + result.getResult().toString());
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getSegmentChildCount() but segmentIndex \"\" is invalid!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentChildCount() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getSegmentCount();
    }

    public String getSegmentChildName(String subjectName, String segmentName, long segmentIndex) {
        Output_GetSegmentChildName result = client.GetSegmentChildName(new ViconString(subjectName), new ViconString(segmentName), segmentIndex);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentChildName() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentChildName() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentChildName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getSegmentChildName() but segmentIndex \"" + segmentIndex + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentChildCount() but segmentName \"" + segmentName + "\" is invalid!");
        }

        String SegmentName = result.getSegmentName().toString();
        //System.out.println("Get segment name: "+SegmentName);
        return SegmentName;

    }

    public String getSegmentParentName(String subjectName, String segmentName) {
        Output_GetSegmentParentName result = client.GetSegmentParentName(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentParentName() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentParentName() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentParentName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentParentName() but segmentName \"" + segmentName + "\" is invalid!");
        }

        String SegmentName = result.getSegmentName().toString();
        //System.out.println("Get segment name: "+SegmentName);
        return SegmentName;

    }

    public double[] getSegmentStaticTranslation(String subjectName, String segmentName) {
        Output_GetSegmentStaticTranslation result = client.GetSegmentStaticTranslation(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentStaticTranslation() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticTranslation() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticTranslation() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentStaticTranslation() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Translation = result.getTranslation();
        //System.out.println("Get segment name: "+SegmentName);
        return Translation;

    }

    public double[] getSegmentStaticRotationHelical(String subjectName, String segmentName) {
        Output_GetSegmentStaticRotationHelical result = client.GetSegmentStaticRotationHelical(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentStaticRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticRotationHelical() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticRotationHelical() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentStaticRotationHelical() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentStaticRotationMatrix(String subjectName, String segmentName) {
        Output_GetSegmentStaticRotationMatrix result = client.GetSegmentStaticRotationMatrix(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentStaticRotationMatrix() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticRotationMatrix() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticRotationMatrix() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentStaticRotationMatrix() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentStaticRotationQuaternion(String subjectName, String segmentName) {
        Output_GetSegmentStaticRotationQuaternion result = client.GetSegmentStaticRotationQuaternion(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentStaticRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticRotationQuaternion() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticRotationQuaternion() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentStaticRotationQuaternion() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentStaticRotationEulerXYZ(String subjectName, String segmentName) {
        Output_GetSegmentStaticRotationEulerXYZ result = client.GetSegmentStaticRotationEulerXYZ(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentStaticRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticRotationEulerXYZ() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticRotationEulerXYZ() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentStaticRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentGlobalTranslation(String subjectName, String segmentName) {
        Output_GetSegmentGlobalTranslation result = client.GetSegmentGlobalTranslation(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentGlobalTranslation() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalTranslation() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalTranslation() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentGlobalTranslation() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Translation = result.getTranslation();
        //System.out.println("Get segment name: "+SegmentName);
        return Translation;

    }

    public double[] getSegmentLocalRotationHelical(String subjectName, String segmentName) {
        Output_GetSegmentLocalRotationHelical result = client.GetSegmentLocalRotationHelical(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentLocalRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalRotationHelical() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalRotationHelical() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentLocalRotationHelical() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentGlobalRotationHelical(String subjectName, String segmentName) {
        Output_GetSegmentGlobalRotationHelical result = client.GetSegmentGlobalRotationHelical(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentGlobalRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalRotationHelical() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalRotationHelical() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentGlobalRotationHelical() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentGlobalRotationMatrix(String subjectName, String segmentName) {
        Output_GetSegmentGlobalRotationMatrix result = client.GetSegmentGlobalRotationMatrix(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentGlobalRotationMatrix() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalRotationMatrix() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalRotationMatrix() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentGlobalRotationMatrix() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentGlobalRotationQuaternion(String subjectName, String segmentName) {
        Output_GetSegmentGlobalRotationQuaternion result = client.GetSegmentGlobalRotationQuaternion(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentGlobalRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalRotationQuaternion() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalRotationQuaternion() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentGlobalRotationQuaternion() but segmentName\"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentGlobalRotationEulerXYZ(String subjectName, String segmentName) {
        Output_GetSegmentGlobalRotationEulerXYZ result = client.GetSegmentGlobalRotationEulerXYZ(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentGlobalRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalRotationEulerXYZ() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalRotationEulerXYZ() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentGlobalRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentLocalTranslation(String subjectName, String segmentName) {
        Output_GetSegmentLocalTranslation result = client.GetSegmentLocalTranslation(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentLocalTranslation () but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalTranslation () but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalTranslation () but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentLocalTranslation () but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Translation = result.getTranslation();
        //System.out.println("Get segment name: "+SegmentName);
        return Translation;

    }

    public double[] getSegmentLocalRotationMatrix(String subjectName, String segmentName) {
        Output_GetSegmentLocalRotationMatrix result = client.GetSegmentLocalRotationMatrix(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentLocalRotationMatrix() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalRotationMatrix() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalRotationMatrix() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentLocalRotationMatrix() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentLocalRotationQuaternion(String subjectName, String segmentName) {
        Output_GetSegmentLocalRotationQuaternion result = client.GetSegmentLocalRotationQuaternion(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentLocalRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalRotationQuaternion() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalRotationQuaternion() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentLocalRotationQuaternion() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double[] getSegmentLocalRotationEulerXYZ(String subjectName, String segmentName) {
        Output_GetSegmentLocalRotationEulerXYZ result = client.GetSegmentLocalRotationEulerXYZ(new ViconString(subjectName), new ViconString(segmentName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentLocalRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalRotationEulerXYZ() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalRotationEulerXYZ() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getSegmentLocalRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
        }

        double[] Rotation = result.getRotation();
        //System.out.println("Get segment name: "+SegmentName);
        return Rotation;

    }

    public double getObjectQuality(String subjectName) {
        Output_GetObjectQuality result = client.GetObjectQuality(new ViconString(subjectName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getObjectQuality() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getObjectQuality() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getObjectQuality() but no frame available!");
        }

        double Quality = result.getQuality();
        //System.out.println("Get segment name: "+SegmentName);
        return Quality;

    }

    public double[] getMarkerGlobalTranslation(String subjectName, String markerName) {
        Output_GetMarkerGlobalTranslation result = client.GetMarkerGlobalTranslation(new ViconString(subjectName), new ViconString(markerName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getMarkerGlobalTranslation () but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getMarkerGlobalTranslation() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getMarkerGlobalTranslation () but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getMarkerGlobalTranslation () but markerName \"" + markerName + "\" is invalid!");
        }

        double[] Translation = result.getTranslation();
        //System.out.println("Get segment name: "+SegmentName);
        return Translation;

    }

    public long getMarkerRayContributionCount(String subjectName, String markerName) {
        Output_GetMarkerRayContributionCount result = client.GetMarkerRayContributionCount(new ViconString(subjectName), new ViconString(markerName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getMarkerRayContributionCount () but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getMarkerRayContributionCount() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getMarkerRayContributionCount () but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new RuntimeException("getMarkerRayContributionCount () but markerName \"" + markerName + "\" is invalid!");
        }

        long Count = result.getRayContributionsCount();
        //System.out.println("Get segment name: "+SegmentName);
        return Count;

    }

    public long getMarkerRayContribution(String subjectName, String markerName, int MarkerRayContributionIndex) {
        Output_GetMarkerRayContribution result = client.GetMarkerRayContribution(new ViconString(subjectName), new ViconString(markerName), MarkerRayContributionIndex);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getMarkerRayContribution() but subjectName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getMarkerRayContribution() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getMarkerRayContribution() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidMarkerName) {
            throw new RuntimeException("getMarkerRayContribution() but markerName \"" + markerName + "\" is invalid!");
        }

        long CameraID = result.getCameraID();
        //System.out.println("Get segment name: "+SegmentName);
        return CameraID;
    }

    /*
             public long getUnlabeledMarkerCount(){    
       Output_GetUnlabeledMarkerCount result = client.GetUnlabeledMarkerCount();
        if (result.getResult() == Result_Enum.NotConnected) 
             throw new RuntimeException("getMarkerRayContributionCount() but client is not connected!!");
        if (result.getResult() == Result_Enum.NoFrame) 
             throw new RuntimeException("getMarkerRayContributionCount () but no frame available!");
    
       
       long  Count= result.getMarkerCount();
        //System.out.println("Get segment name: "+SegmentName);
        return Count;
     
             }
     */
    /**
     * Return the number of markers for a specified subject in the DataStream.
     *
     * This information can be used in conjunction with GetMarkerName<p>
     *
     * See Also : GetSubjectName, GetMarkerName<p>
     *
     * @param subjectName The name of the subject
     * @return The number of markers
     */
    public long getMarkerCount(String subjectName) {
        Output_GetMarkerCount result = client.GetMarkerCount(new ViconString(subjectName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getMarkerCount() but segmentName \"" + subjectName + "\" is invalid!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getMarkerCount() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getMarkerCount() but no frame available!");
        }
        //System.out.println("Get marker count: "+result.getResult().toString());
        return result.getMarkerCount();
    }

    public double[] getUnlabeledMarkerGlobalTranslation(int markerIndex) {
        Output_GetUnlabeledMarkerGlobalTranslation result = client.GetUnlabeledMarkerGlobalTranslation(markerIndex);
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getUnlabeledMarkerGlobalTranslation() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getUnlabeledMarkerGlobalTranslation() but no frame available!");
        }
        //System.out.println("Get marker count: "+result.getResult().toString());
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getUnlabeledMarkerGlobalTranslation() but markerIndex \"" + markerIndex + "\" is invalid!");
        }

        double[] Translation = result.getTranslation();
        return Translation;
    }

    public long getDeviceCount() {
        Output_GetDeviceCount result = client.GetDeviceCount();
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getDeviceCount() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getDeviceCount () but no frame available!");
        }

        long Count = result.getDeviceCount();
        //System.out.println("Get segment name: "+SegmentName);
        return Count;

    }

    public String getDeviceName(int deviceIndex) {
        if (deviceIndex < 0) {
            throw new IllegalArgumentException("getSubjectName() deviceIndex >=0 is needed!");
        }
        System.out.println("test1");
        Output_GetDeviceName result = client.GetDeviceName(deviceIndex);
        System.out.println("test2");//warum?
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getDeviceName() but deviceIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getDeviceName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getDeviceName() but client is not connected!!");
        }
        String DeviceName = result.getDeviceName().toString();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return DeviceName;
    }

    public String getDeviceOutputName(String deviceName, int deviceIndex) {
        if (deviceIndex < 0) {
            throw new IllegalArgumentException("getSubjectName() deviceIndex >=0 is needed!");
        }
        System.out.println("test1");
        Output_GetDeviceOutputName result = client.GetDeviceOutputName(new ViconString(deviceName), deviceIndex);
        System.out.println("test2");
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getDeviceOutputName() but deviceIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getDeviceOutputName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getDeviceOutputName but client is not connected!!");
        }
        String DeviceOutputName = result.getDeviceOutputName().toString();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return DeviceOutputName;
    }

    public double getDeviceOutputValue(String deviceName, String deviceOutputName) {

        Output_GetDeviceOutputValue result = client.GetDeviceOutputValue(new ViconString(deviceName), new ViconString(deviceOutputName));

        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getDeviceOutputName() but deviceIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getDeviceOutputName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getDeviceOutputName but client is not connected!!");
        }
        double DeviceOutputValue = result.getValue();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return DeviceOutputValue;
    }

    public long getDeviceOutputSubsamples(String deviceName, String deviceOutputName) {

        Output_GetDeviceOutputSubsamples result = client.GetDeviceOutputSubsamples(new ViconString(deviceName), new ViconString(deviceOutputName));

        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getDeviceOutputSubsamples() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getDeviceOutputSubsamples but client is not connected!!");
        }
        long DeviceOutputSubsamples = result.getDeviceOutputSubsamples();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return DeviceOutputSubsamples;
    }

    public long getForcePlateCount() {

        Output_GetForcePlateCount result = client.GetForcePlateCount();

        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getForcePlateCount() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getForcePlateCount() but client is not connected!!");
        }
        long ForcePlateCount = result.getForcePlateCount();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return ForcePlateCount;
    }

    public double[] getForceVector(int ForceplateIndex) {
        Output_GetGlobalForceVector result = client.GetGlobalForceVector(ForceplateIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getForceVector() but ForceplateIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getForceVector() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getForceVector() but client is not connected!!");
        }
        double[] ForceVector = result.getForceVector();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return ForceVector;
    }

    public double[] getGlobalMomentVector(int ForceplateIndex) {
        Output_GetGlobalMomentVector result = client.GetGlobalMomentVector(ForceplateIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getGlobalMomentVector() but ForceplateIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getGlobalMomentVector() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getGlobalMomentVector() but client is not connected!!");
        }
        double[] GlobalMomentVector = result.getMomentVector();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return GlobalMomentVector;
    }

    public double[] getGlobalCentreOfPressure(int ForceplateIndex) {
        Output_GetGlobalCentreOfPressure result = client.GetGlobalCentreOfPressure(ForceplateIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getGlobalCentreOfPressure() but ForceplateIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getGlobalCentreOfPressure() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getGlobalCentreOfPressure() but client is not connected!!");
        }
        double[] GlobalCentreOfPressure = result.getCentreOfPressure();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return GlobalCentreOfPressure;
    }

    public long getForcePlateSubsamples(int ForceplateIndex) {
        Output_GetForcePlateSubsamples result = client.GetForcePlateSubsamples(ForceplateIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getForcePlateSubsamples() but ForceplateIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getForcePlateSubsamples() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getForcePlateSubsamples() but client is not connected!!");
        }
        long ForcePlateSubsamples = result.getForcePlateSubsamples();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return ForcePlateSubsamples;
    }

    public double[] getGlobalForceVector(int ForceplateIndex, int Subsample) {
        Output_GetGlobalForceVector result = client.GetGlobalForceVector(ForceplateIndex, Subsample);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getGlobalForceVector () but ForceplateIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getGlobalForceVector () but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getGlobalForceVector () but client is not connected!!");
        }
        double[] GlobalForceVector = result.getForceVector();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return GlobalForceVector;
    }

    public double[] getGlobalMomentVecto(int ForceplateIndex, int Subsample) {
        Output_GetGlobalMomentVector result = client.GetGlobalMomentVector(ForceplateIndex, Subsample);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getGlobalMomentVector () but ForceplateIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getGlobalMomentVector () but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getGlobalMomentVector () but client is not connected!!");
        }
        double[] GlobalMomentVector = result.getMomentVector();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return GlobalMomentVector;
    }

    public double[] getGlobalCentreOfPressure(int ForceplateIndex, int subsample) {
        Output_GetGlobalCentreOfPressure result = client.GetGlobalCentreOfPressure(ForceplateIndex, subsample);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getGlobalCentreOfPressure() but ForceplateIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getGlobalCentreOfPressure() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getGlobalCentreOfPressure() but client is not connected!!");
        }
        double[] GlobalCentreOfPressure = result.getCentreOfPressure();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return GlobalCentreOfPressure;
    }

    public long getEyeTrackerCount() {
        Output_GetEyeTrackerCount result = client.GetEyeTrackerCount();
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getEyeTrackerCount() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getEyeTrackerCount () but no frame available!");
        }

        long Count = result.getEyeTrackerCount();
        //System.out.println("Get segment name: "+SegmentName);
        return Count;

    }

    public double[] getEyeTrackerGlobalPosition(int EyeTrackerIndex) {
        Output_GetEyeTrackerGlobalPosition result = client.GetEyeTrackerGlobalPosition(EyeTrackerIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getEyeTrackerGlobalPosition() but EyeTrackerIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getEyeTrackerGlobalPosition() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getEyeTrackerGlobalPosition() but client is not connected!!");
        }
        double[] EyeTrackerGlobalPosition = result.getPosition();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return EyeTrackerGlobalPosition;
    }

    public double[] getEyeTrackerGlobalGazeVector(int EyeTrackerIndex) {
        Output_GetEyeTrackerGlobalGazeVector result = client.GetEyeTrackerGlobalGazeVector(EyeTrackerIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getEyeTrackerGlobalGazeVector() but EyeTrackerIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getEyeTrackerGlobalGazeVector() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getEyeTrackerGlobalGazeVector() but client is not connected!!");
        }
        double[] EyeTrackerGlobalGazeVector = result.getGazeVector();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return EyeTrackerGlobalGazeVector;
    }

    public void enableCentroidData() {
        Output_EnableCentroidData result = client.EnableCentroidData();
        //System.out.println("Enable unlabeled marker data: "+result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("enableCentroidData() but client was not connected!");
        }
    }

    public long getCameraCount() {
        Output_GetCameraCount result = client.GetCameraCount();
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getCameraCount() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getCameraCount () but no frame available!");
        }

        long Count = result.getCameraCount();
        //System.out.println("Get segment name: "+SegmentName);
        return Count;
    }

    public String CameraName(int CameraIndex) {
        if (CameraIndex < 0) {
            throw new IllegalArgumentException("getCameraName() CameraIndex >=0 is needed!");
        }
        System.out.println("test1");
        Output_GetCameraName result = client.GetCameraName(CameraIndex);
        System.out.println("test2");
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getCameraName() but CameraIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getCameraName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getCameraName() but client is not connected!!");
        }
        String CameraName = result.getCameraName().toString();
        //System.out.println("Get subject name: "+result.getResult().toString());

        return CameraName;
    }

    /**
     * TODO unklar, wie man ein Objekt vom Typ SWIGTYPE_p_std__string erzeugen
     * kann. Möglicherweise zeigt der Pointer von ViconString auf so ein Objekt
     * ...
     *
     * Unterschied zu ViconString ist const std::string
     *
     * @param cameraName
     * @return
     */
    public long getCameraId(String cameraName) {
        Output_GetCameraName Result = client.GetCameraName(0);
        if (Result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getCameraId() but client is not connected!!");
        }
        if (Result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getCameraId () but no frame available!");
        }
        cameraName = Result.getCameraName().toString();

        Output_GetCameraId Id = client.GetCameraId(cameraName);
        return Id.getCameraId();
        //System.out.println("Get segment name: "+SegmentName);
        //return Id;  
    }

    /* 
     *
     * Return the name of a marker for a specified subject. 
     * 
     * This can be passed into GetMarkerGlobalTranslation.<p>
     * 
     * See Also : GetMarkerCount, GetMarkerGlobalTranslation<p>
     * 
     * @param subjectName the name of the subject.
     * @param markerIndex The index of the marker.
     * @return The name of the marker.
     */
    public String getMarkerName(String subjectName, long markerIndex) {
        Output_GetMarkerName result = client.GetMarkerName(new ViconString(subjectName), markerIndex);
        //System.out.println("Get marker name: "+result.getResult().toString());
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getMarkerName() but client not connected!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getMarkerName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getMarkerName() but invalid subject name \"" + subjectName + "\"!");
        }
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getMarkerName() but invalid marker index \"" + markerIndex + "\"!");
        }
        return result.getMarkerName().toString();
    }

    /**
     * Return the number of the last frame retrieved from the DataStream.
     *
     * See Also : GetFrame, GetTimecode<p>
     *
     * @return number of the last frame.
     * @throws RuntimeException if client not connected or no frame available.
     */
    public long getFrameNumber() {
        Output_GetFrameNumber frameNumber = client.GetFrameNumber();
        //System.out.println("Get frame number: "+frameNumber.getResult().toString());
        if (frameNumber.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("get frame number but client not connected!");
        }
        if (frameNumber.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("get frame number but no frame available!");
        }
        return frameNumber.getFrameNumber();
    }

    public TimeCode getTimeCode() {
        return new TimeCode(client.GetTimecode());
    }

    /**
     * Request a new frame to be fetched from the Vicon DataStream Server.
     *
     * TODO eventuell timeout als argument mitübergeben?
     * <p>
     *
     * @param waiting
     * @return false if client is not connected.
     *
     * See Also : SetStreamMode
     */
    public boolean getFrame(boolean waiting) {
        Result_Enum result = client.GetFrame().getResult();
        if (waiting) {
            while (result != Result_Enum.Success) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ViconDataStreamSDKClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                result = client.GetFrame().getResult();
            }
            return true;
        } else {
            if (result == Result_Enum.Success) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get segment local rotation matrix.
     *
     * @param subjectName The name of the subject
     * @param segmentName The name of the segment.
     * @return The translation of a subject segment in local co-ordinates
     * relative to its parent segment.<p>
     *
     * See Also : GetSegmentLocalRotationHelical, GetSegmentLocalRotationMatrix,
     * GetSegmentLocalRotationQuaternion, GetSegmentLocalRotationEulerXYZ,
     * GetSegmentGlobalTranslation,GetSegmentGlobalRotationHelical,
     * GetSegmentGlobalRotationMatrix, GetSegmentGlobalRotationQuaternion,
     * GetSegmentGlobalRotationEulerXYZ
     *
     *
     * //public double[] getSegmentLocalRotationMatrix(String subjectName,
     * String segmentName){ Output_GetSegmentLocalRotationMatrix result =
     * client.GetSegmentLocalRotationMatrix(new ViconString(subjectName), new
     * ViconString(segmentName)); System.out.println("Get segment local rotation
     * matrix: "+result.getResult().toString()); if (result.getResult() ==
     * Result_Enum.NotConnected) throw new
     * RuntimeException("getSegmentLocalRotationMatrix() but client not
     * connected!"); if (result.getResult() == Result_Enum.NoFrame) throw new
     * RuntimeException("getSegmentLocalRotationMatrix() but no frame
     * available!"); if (result.getResult() == Result_Enum.InvalidSubjectName)
     * throw new RuntimeException("getSegmentLocalRotationMatrix() but invalid
     * subject name \""+subjectName+"\"!"); if (result.getResult() ==
     * Result_Enum.InvalidSegmentName) throw new
     * RuntimeException("getSegmentLocalRotationMatrix() but invalid segment
     * name \""+segmentName+"\"!");
     *
     * if (result.getOccluded()) { return new double[]{Double.NaN, Double.NaN,
     * Double.NaN}; } return result.getRotation(); }
     */
    /**
     * Return the translation of a subject marker in global co-ordinates.
     *
     * The Translation is of the form ( x, y, z ) where x, y & z are in
     * Millimeters with respect to the global origin.<p>
     *
     * See Also : GetMarkerName<p>
     *
     * @param subjectName
     * @param markerName
     * @return The translation of the marker as a 3d vector, [NaN, NaN, NaN] if
     * the marker is occluded.
     * @throws RuntimeException if client not connected, no frame available,
     * invalid subject name or invalid marker name.
     */
    /* public double[] getMarkerGlobalTranslation(String subjectName, String markerName){
        Output_GetMarkerGlobalTranslation result = client.GetMarkerGlobalTranslation(new ViconString(subjectName), new ViconString(markerName));
        if (result.getResult() == Result_Enum.NotConnected) throw new RuntimeException("getMarkerGlobalTranslation() but client not connected!");
        if (result.getResult() == Result_Enum.NoFrame) throw new RuntimeException("getMarkerGlobalTranslation() but no frame available!");
        if (result.getResult() == Result_Enum.InvalidSubjectName) throw new RuntimeException("getMarkerGlobalTranslation() but invalid subject name \""+subjectName+"\"!");
        if (result.getResult() == Result_Enum.InvalidMarkerName) throw new RuntimeException("getMarkerGlobalTranslation() but invalid marker name \""+markerName+"\"!");
        if (result.getOccluded()){
            return new double[]{Double.NaN, Double.NaN, Double.NaN};
        }
        return result.getTranslation();
    }*/
}
