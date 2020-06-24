package de.dhbw.mobmonrob.vicon.datastreamapi.api;

import de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconString;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Client;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_Connect;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_ConnectToMulticast;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableSegmentData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_Disconnect;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableCentroidData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableDebugData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableDeviceData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableGreyscaleData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableLightweightSegmentData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableSegmentData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableMarkerData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableMarkerRayData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableUnlabeledMarkerData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableVideoData;
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
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetTimecode;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetUnlabeledMarkerCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetUnlabeledMarkerGlobalTranslation;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsDebugDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_SetStreamMode;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_StartTransmittingMulticast;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_StopTransmittingMulticast;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Result_Enum;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.StreamMode_Enum;
import java.util.HashMap;
import java.util.Map;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Oliver Rettig
 * 
 * TODO
 * - umbenennen in ViconDataStreamClient
 * - Kommentare vervollständigen, Ex überprüfen
 */
public class ViconDataStreamSDKClient {

    private final Client client;

    private final Map<String, ViconString> subjectNames = new HashMap<>();
    private final Map<String, ViconString> segmentNames = new HashMap<>();
    private final Map<String, ViconString> markerNames = new HashMap<>();
    
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

    private void scanSubjectNames(){
        subjectNames.clear();
        long subjects = getSubjectCount();
        for (int i=0;i<subjects;i++){
            Output_GetSubjectName result = client.GetSubjectName(i);
            if (result.getResult() == Result_Enum.NoFrame) {
                throw new RuntimeException("getSubjectName() but no frame available!");
            }
            if (result.getResult() == Result_Enum.NotConnected) {
                throw new RuntimeException("getSubjectName() but client is not connected!!");
            }
            ViconString subjectNameViconString = result.getSubjectName();
            String SubjectName = subjectNameViconString.toStdString(); //toString();
            subjectNames.put(SubjectName, subjectNameViconString);
        }
    }
    
    private void scanSegmentNames(){
        segmentNames.clear();
        long subjects = getSubjectCount();
        for (int j=0;j<subjects;j++){
            String subjectName = getSubjectName(j);
            ViconString subjecNameAsViconString = convertSubjectName(subjectName);
            long segments = getSegmentCount(subjectName);
            for (int i=0;i<segments;i++){
                Output_GetSegmentName result = client.GetSegmentName(subjecNameAsViconString, i);
                ViconString segmentNameViconString = result.getSegmentName();
                String segmentName = segmentNameViconString.toStdString(); //toString();
                segmentNames.put(segmentName, segmentNameViconString);
                System.out.println("added segment \""+segmentName+"\"");
            }
        }
    }
    
    private void scanMarkerNames(){
        markerNames.clear();
        long subjects = getSubjectCount();
        for (int j=0;j<subjects;j++){
            String subjectName = getSubjectName(j);
            ViconString subjectNameAsViconString = convertSubjectName(subjectName);
            long markers = getMarkerCount(subjectName);
            for (int i=0;i<markers;i++){
                Output_GetMarkerName result = client.GetMarkerName(subjectNameAsViconString, i);
                ViconString markerNameViconString = result.getMarkerName();
                String markerName = markerNameViconString.toStdString(); //toString();
                markerNames.put(markerName, markerNameViconString);
                System.out.println("added marker \""+markerName+"\"");
            }
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
     * @see ConnectToMulticast
     * @see Disconnect
     * @see IsConnected<p>
     * 
     * @param hostname The DNS identifiable name, or IP address of the PC
     * hosting the DataStream server. The function defaults to connecting on
     * port 801. You can specify an alternate port number after a colon. E.g.:
     * "localhost" "MyViconPC:804", "10.0.0.2"<p>
     *
     * @throws RuntimeException if given hostname is invalid
     */
    public void connect(String hostname) {
        int i = 0;
        while (!isConnected()) {

            Output_Connect result = client.Connect(new ViconString(hostname));

            //Output_ConnectToMulticast result = client.ConnectToMulticast(new ViconString(hostname), new ViconString(hostname));
            
            // tritt seltsamerweise auch für localhost ab und zu auf
            if (result.getResult() == Result_Enum.InvalidHostName) 
                System.out.println("connect() but invalid hostname \""+hostname+"\"!");
            if (result.getResult() == Result_Enum.ClientAlreadyConnected) 
                System.out.println("Client is Already Connected! ");
            if (result.getResult() == Result_Enum.ClientConnectionFailed) 
                System.out.println("Client Connection is Failed ");
            if (result.getResult() == Result_Enum.Success) // ende der while schleife
                System.out.println("Client Connection sucess!"); 
            if (result.getResult() == Result_Enum.ClientAlreadyConnected) // --> kann innerhalb der while schleife nicht auftreten
                System.out.println("Client already connected!");
            if (result.getResult() == Result_Enum.ClientConnectionFailed) // --> dafür ist die while schleife da
                System.out.println("Client Connection failed!");
            //System.out.println("connect result = \""+result.getResult().toString()+"\"!");
            try {
                Thread.sleep(1000);
                System.out.println("...try to connect "+String.valueOf(i++));
            } catch (InterruptedException ex) {
                Logger.getLogger(ViconDataStreamSDKClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        getFrame(true);
        scanSubjectNames();
        scanSegmentNames();
        scanMarkerNames();
    }
    
    /**
     * Connect to a Vicon DataStream Server’s Multicast stream.
     *
     * @see Connect
     * @see Disconnect
     * @see IsConnected<p>
     * @see StartTransmittingMulticast
     * @see StopTransmittingMulticast
     * 
     * @param hostname The DNS identifiable name, or IP address of the PC
     * hosting the DataStream server. The function defaults to connecting on
     * port 801. You can specify an alternate port number after a colon. E.g.:
     * "localhost" "MyViconPC:804", "10.0.0.2"<p>
     * @param multicastHostname The IP Address of the Multicast group on which 
     * data will be received. The address must be in the range 
     * 224.0.0.0-239.255.255.255 You may also specify a port by appending it to 
     * the end of the IP Address after a colon, e.g. 224.0.0.0:30001. 
     * If you do not specify a port it will default to 44801.
     * 
     * @throws RuntimeException if given hostname is invalid
     */
    public void connectToMulticast(String hostname, String multicastHostname) {
        int i = 0;
        while (!isConnected()) {

            Output_ConnectToMulticast result = client.ConnectToMulticast(new ViconString(hostname), new ViconString(multicastHostname));
            
            // tritt seltsamerweise auch für localhost ab und zu auf
            if (result.getResult() == Result_Enum.InvalidHostName) 
                System.out.println("connect() but invalid hostname \""+hostname+"\"!");
            if (result.getResult() == Result_Enum.ClientAlreadyConnected) 
                System.out.println("Client is Already Connected! ");
            if (result.getResult() == Result_Enum.ClientConnectionFailed) 
                System.out.println("Client Connection is Failed ");
            if (result.getResult() == Result_Enum.Success) // ende der while schleife
                System.out.println("Client Connection sucess!"); 
            if (result.getResult() == Result_Enum.ClientAlreadyConnected) // --> kann innerhalb der while schleife nicht auftreten
                System.out.println("Client already connected!");
            if (result.getResult() == Result_Enum.ClientConnectionFailed) // --> dafür ist die while schleife da
                System.out.println("Client Connection failed!");
            //System.out.println("connect result = \""+result.getResult().toString()+"\"!");
            try {
                Thread.sleep(1000);
                System.out.println("...try to connect "+String.valueOf(i++));
            } catch (InterruptedException ex) {
                Logger.getLogger(ViconDataStreamSDKClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        getFrame(true);
        scanSubjectNames();
        scanSegmentNames();
        scanMarkerNames();
    }
    
    /**
     * Ask the DataStreamServer to start transmitting the data you are receiving
     * directly to aMulticast address as well. 
     * 
     * This allows multiple clients to connect to your stream 
     * (via ConnectToMulticast() ) whilst minimizing network bandwidth use and 
     * frame delivery latency. 
     * 
     * @see Connect() 
     * @see ConnectToMulticast() 
     * @see Disconnect() 
     * @see StopTransmittingMulticast
     * 
     * @param serverIP The IP Address of the server Ethernet interface from which 
     * the Multicast data will be sent. Do not specify a port number 
     * (any port number speciﬁed will be ignored). 
     * @param multicastIP The IP Address of the Multicast group to which Multicast 
     * data will be sent. The address must be in the range 
     * 224.0.0.0-239.255.255.255. You may also specify the port the data will 
     * be sent to by appending it to the IP Address after a colon, e.g. 
     * 224.0.0.0:30001. If you do not specify a port it will default to 44801.
     * @return fase if  server is already transmitting
     * @throws RuntimeException if client is not connected, multicast IP is invalid
     */
    public boolean startTransmittingMulticast(String serverIP, String multicastIP){
        boolean resultValue = true;
        Output_StartTransmittingMulticast result = client.StartTransmittingMulticast(
                new ViconString(serverIP), new ViconString(multicastIP));
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("Client is not connected!"); 
        } else if (result.getResult() == Result_Enum.InvalidMulticastIP) {
            throw new RuntimeException("Multicast IP is invalid! ");
        } else if (result.getResult() == Result_Enum.ServerAlreadyTransmittingMulticast) {
            System.out.println("Server is already transmitting multicast!");
            resultValue = false;
        }
        return resultValue;
    }
    /**
     * Ask the DataStreamServer to stop transmitting the data you are receiving 
     * directly to aMulticast address as well. 
     * 
     * You must previously have started a transmission via StartTransmittingMulticast.  
     * 
     * @see Connect 
     * @see ConnectToMulticast
     * @see Disconnect
     * @see StartTransmittingMulticast
     *
     * @return false, if client is not connected or server not transmitting multicast
     */
    public boolean stopTransmittingMulticast(){
        boolean resultValue = true;
        Output_StopTransmittingMulticast result = client.StopTransmittingMulticast();
        if (result.getResult() == Result_Enum.NotConnected) {
            System.out.println("Client is not connected!"); 
            resultValue = false;
        } else if (result.getResult() == Result_Enum.ServerNotTransmittingMulticast) {
            System.out.println("Server not transmitting multicast! ");
            resultValue = false;
        } 
        return resultValue;
    }

    /**
     * Discover whether client is connected to the Vicon DataStream Server.
     *
     * @see Connect
     * @see Disconnect<p>
     *
     * @return true, if you are connected to the stream, otherwise false.
     */
    public boolean isConnected() {
        return client.IsConnected().getConnected();
    }

    /**
     * Disconnect from the Vicon DataStream Server.
     *
     * @see Connect
     * @see IsConnected<p>
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
     * @return version
     *
     */
    public Version getVersion() {
        return new Version(client.GetVersion());
    }

    public DeviceName getDeviceName() {
        int DeviceIndex = 0;
        return new DeviceName(client.GetDeviceName(DeviceIndex));
    }

    /**
     * Enable debug data in the Vicon DataStream. 
     * 
     * In order to receive debug data, call this function on startup, after 
     * connecting to the server.<p>
     * 
     * @see isDebugDataEnabled
     * @see disableDebugData()<p>
     * 
     * @throws RuntimeException if the client is not connected.
     */
    public void enableDebugData(){
        Output_EnableDebugData result = client.EnableDebugData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client was not connected!");
        }
    }
    
    /**
     * Enable labeled reconstructed marker data in the Vicon DataStream.
     *
     * Call this function on startup, after connecting to the server, and before
     * trying to read labeled marker data.<p>
     *
     * @see IsMarkerDataEnabled
     * @see DisableMarkerData
     * @see EnableSegmentData
     * @see EnableUnlabelledMarkerData
     * @see EnableDeviceData
     * @see GetMarkerCount
     * @see GetMarkerName
     * @see GetMarkerGlobalTranslation
     * 
     * @throws RuntimeException if the client is not connected.
     */
    public void enableMarkerData() {
        Output_EnableMarkerData result = client.EnableMarkerData();
        //System.out.println("Enable marker data: "+result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
    }
    
    /**
     * Enable force plate, EMG, and other device data in the Vicon DataStream. 
     * 
     * Call this function on startup, after connecting to the server, and before 
     * trying to read device information. <p>
     * 
     * @see IsDeviceDataEnabled
     * @see DisableDeviceData
     * @see EnableSegmentData
     * @see EnableMarkerData
     * @see EnableUnlabeledMarkerData
     * @see GetDeviceCount
     * @see GetDeviceName
     * @see GetDeviceOutputCount
     * @see GetDeviceOutputName
     * @see GetDeviceOutputValue
     * 
     * @throw RuntimeException if the client is not connected.
     */
    public void enableDeviceData() {
        Output_EnableDeviceData result = client.EnableDeviceData();
        //System.out.println("Enable marker data: "+result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
    }
    
    /**
     * Enable information about the rays contributing to each labeled marker 
     * in the Vicon DataStream. 
     * 
     * Call this function on startup, after connecting to the server, and before 
     * trying to read global unlabeled marker data. 
     * 
     * @see IsMarkerRayDataEnabled
     * @see DisableMarkerRayData()
     * @see EnableSegmentData()
     * @see EnableMarkerData()
     * @see EnableDeviceData()
     * @see GetUnlabeledMarkerCount
     * @see GetUnlabeledMarkerGlobalTranslation
     * 
     * @throws RuntimeException if the client is not connected.
     */
    public void enableMarkerRayData() {
        Output_EnableMarkerRayData result = client.EnableMarkerRayData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
    }
    
    /**
     * Enable kinematic segment data in the Vicon DataStream.
     *
     * You should call this function on startup, after connecting to the server,
     * and before trying to read local or global segment data.<p>
     *
     * @see IsSegmetnDataEnabled 
     * @see DisableSegmentData 
     * @see EnableMarkerData
     * @see EnableUnlabelledMarkerData
     * @see EnableDeviceData 
     * @see GetSegmentCount
     * @see GetSegmentName
     * @see GetSegmentGlobalTranslation
     * @see GetSegmentGlobalRotationXXX
     * @see GetSegmentLocalTranslation 
     * @see GetSegmentLocalRotationXXX
     * 
     * @throws RuntimeException if the client is not connected.
     */
    public void enableSegmentData() {
        Output_EnableSegmentData result = client.EnableSegmentData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("Client is not connected!");
        }
    }
    /**
     * Disable kinematic segment data in the Vicon DataStream. 
     * 
     * @see isSegmentDataEnabled
     * @see enableSegmentData
     * @see enableMarkerData
     * @see enableUnlabeledMarkerData
     * @see enableDeviceData
     * @see getSegmentCount
     * @see getSegmentName
     * @see getSegmentGlobalTranslation
     * @see getSegmentGlobalRotationEulerXYZ
     * @see getSegmentLocalTranslation
     * @see getSegmentLocalRotationEulerXYZ<p>
     * 
     * @throws RuntimeException if the client is not connected.
     */
    public void disableSegmentData(){
        Output_DisableSegmentData result = client.DisableSegmentData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("Client is not connected!");
        }
    }

    /**
     * Enable a lightweight transmission protocol for kinematic segment data in 
     * the Vicon DataStream. 
     * 
     * This will reduce the network bandwidth required to transmit segment data 
     * to approximately a quarter of that required by the previous method, 
     * at the expense of a small amount of precision.<p>
     * 
     * Use the existing methods such as GetSegmentGlobalTranslation() 
     * and GetSegmentGlobalRotationMatrix() as usual to obtain the segment data.<p>
     * 
     * Calling this method will automatically disable all other conﬁgurable 
     * output types. These may be re-enabled after the call if required.<p>
     * 
     * Call this function on startup, after connecting to the server, and before 
     * trying to read local or global segment data.<p>
     * 
     * @see IsSegmentDataEnabled 
     * @see DisableSegmentData
     * @see EnableMarkerData
     * @see EnableUnlabeledMarkerData
     * @see EnableDeviceData
     * @see GetSegmentCount
     * @see GetSegmentName
     * @see GetSegmentGlobalTranslation
     * @see GetSegmentGlobalRotationEulerXYZ
     * @see GetSegmentLocalTranslation
     * @see GetSegmentLocalRotationEulerXYZ
     * 
     * @throws RuntimeException if the client is not connected.
     */
    public void enableLightweightSegmentData() {
        Output_EnableLightweightSegmentData result = client.EnableLightweightSegmentData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
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
     * @see IsUnlabeledMarkerDataEnabled
     * @see DisableUnlabeledMarkerData
     * @see EnableSegmentData
     * @see EnableMarkerData
     * @see EnableDeviceData
     * @see GetUnlabeledMarkerCount
     * @see GetUnlabeledMarkerGlobalTranslation
     *
     * @throws RuntimeException, if client not connected.
     */
    public void enableUnlabeledMarkerData() {
        Output_EnableUnlabeledMarkerData result = client.EnableUnlabeledMarkerData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
    }

    /**
     * Return whether kinematic segment data is enabled in the Vicon DataStream. 
     * 
     * See Also: EnableSegmentData(), DisableSegmentData(), IsMarkerDataEnabled(), 
     * IsUnlabeledMarkerDataEnabled(), IsDeviceDataEnabled() 
     * 
     * @return true, if segment data stream is enabled.
     */
    public boolean isSegmentDataEnabled() {
        Output_IsSegmentDataEnabled result = client.IsSegmentDataEnabled();
        return result.getEnabled();
    }

    /**
     * Return whether debug data is enabled in the DataStream. 
     * 
     * See Also: EnableDebugData(), DisableDebugData() 
     * 
     * @return  true, if streaming debug info is anabled.
     */
    public boolean isDebugDataEnabled(){
        Output_IsDebugDataEnabled result = client.IsDebugDataEnabled();
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
     * There are three modes that the SDK can operate in.Each mode has a 
     * different impact on the Client, Server, and network resources used. 
     * 
     * • ServerPush In "ServerPush" mode, the Server pushes every new frame 
     *   of data over the network to the Client. The Server will try not to drop 
     *   any frames. This results in the lowest latency that can be achieved. 
     *   If the Client is unable to read data at the rate it is being sent, 
     *   then it is buffered, ﬁrstly in the Client, then on the TCP/IP connection, 
     *   and then at the Server. When all the buffers are full then frames may 
     *   be dropped at the Server and the performance of the Server may be affected. 
     *   The GetFrame() method returns the most recently received frame if 
     *   available, or blocks the calling thread if the most recently received 
     *   frame has already been processed.
     *
     * • ClientPull In "ClientPull" mode, the Client waits for a call to GetFrame(), 
     *   and then requests the latest frame of data from the Server. This increases 
     *   latency, because a request must be sent over the network to the Server, 
     *   the Server has to prepare the frame of data for the Client, and then 
     *   the data must be sent back over the network. Network bandwidth is kept 
     *   to a minimum, because the Server only sends what you need. The buffers 
     *   are very unlikely to be ﬁlled, and Server performance is unlikely to 
     *   be affected. The GetFrame() method blocks the calling thread until the 
     *   frame has been received.
     *
     * • ClientPullPreFetch "ClientPullPreFetch" is an enhancement to the 
     *   "ClientPull" mode. A thread in the SDK continuously and preemptively 
     *   does a "ClientPull" on your behalf, storing the latest requested frame 
     *   in memory. When you next call GetFrame(), the SDK returns the last 
     *   requested frame that was cached in memory. GetFrame() does not need to 
     *   block the calling thread. As with normal "ClientPull", buffers are unlikely 
     *   to ﬁll up, and Server performance is unlikely to be affected. Latency 
     *   is slightly reduced, but network trafﬁc may increase if you request 
     *   frames on behalf of the Client which are never used. The stream defaults 
     *   to "ClientPull" mode as this is considered the safest option. If 
     *   performance is a problem, try "ClientPullPreFetch" followed by "ServerPush".
     * 
     * @param mode
     * @throws RuntimeException if the client is not connected.
     */
    public void setStreamMode(StreamMode_Enum mode){
        Output_SetStreamMode  result = client.SetStreamMode(mode);
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("GetFrameRateCount() but client was not connected!");
        }
    }
    
    /**
     * Streaming operator for String.
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
     * @throws RuntimeException if the client is not connected.
     */
    public long getFrameRateCount() {
        Output_GetFrameRateCount result = client.GetFrameRateCount();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("GetFrameRateCount() but client was not connected!");
        }
        return result.getCount();
    }

    /**
     * Get the name of a frame rate type at the speciﬁed index. 
     * 
     * See Also: GetFrameRateCount(), GetFrameRateValue()<p>
     * 
     * @param FrameRateIndex
     * @return 
     * @throws RuntimeException if the index is invalid or the client is not connected
     */
    public String getFrameRateName(long FrameRateIndex) {
        Output_GetFrameRateName result = client.GetFrameRateName(FrameRateIndex);
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getFrameRateName() but client is not connected!!");
        }
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getFrameRateName() but index is invalid!");
        }
        return result.getName().toStdString();
    }

    /**
     * 
     * @param FrameRateName
     * @return 
     */
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
     * precondition: invoke GetFrame(); if this is not invoked before you can get the
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
        if (result.getResult() == Result_Enum.Success){
            return result.getSubjectCount();
        } else {
            System.out.println("getSubjectCount() failed: "+result.getResult().toString());
            return -1;
        }
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
        System.out.println("getSubjectName(): reached");
        long subjectCount = getSubjectCount();
        System.out.println("getSubjectCount(): Subject count = " + subjectCount);
        if (subjectIndex >= subjectCount) {
            throw new IllegalArgumentException("getSubjectName() subjectIndex >=subject count is needed!");
        }
        System.out.println("getSubjectName(): Index = " + subjectIndex);
        Output_GetSubjectName result = client.GetSubjectName(subjectIndex);

        System.out.println("getSubjectName() index = " + subjectIndex);//warum?

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
        String SubjectName = result.getSubjectName().toStdString(); //toString();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return SubjectName;
    }

    /**
      * Return the name of the root segment for a specified subject.This can be passed into segment functions.The root segment is the ancestor of all other segments in the subject. 
      * 
      * @param subjectName
      * @return 
      */
    public String getSubjectRootSegmentName(String subjectName) {
        Output_GetSubjectRootSegmentName result = client.GetSubjectRootSegmentName(convertSubjectName(subjectName));
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
        String SegmentName = result.getSegmentName().toStdString();
        return SegmentName;
    }

    /**
     * Convert subject name in a native lib usable object.
     * 
     * @param subjectName
     * @return native lib representation of the given String.
     * @throws RuntimeException if the subject name is not known.
     */
    private ViconString convertSubjectName(String subjectName){
        ViconString subjectNameAsViconString = subjectNames.get(subjectName);
        if (subjectNameAsViconString != null){
            return subjectNameAsViconString;
        } else {
            throw new RuntimeException("Subject with name \""+subjectName+"\" does not exist");
        }
    }
    /**
     * Convert segment name in a native lib usable object.
     * 
     * @param segmentName
     * @return native lib object representation of the given segment name.
     * @throws RuntimeException if the segment is not known.
     */
    private ViconString convertSegmentName(String segmentName){
        ViconString segmentNameAsViconString = segmentNames.get(segmentName);
        if (segmentNameAsViconString != null){
            return segmentNameAsViconString;
        } else {
            throw new RuntimeException("Segment with name \""+segmentName+"\" does not exist");
        }
    }
    /**
     * Convert marker name in a native lib usable object.
     * 
     * @param markerName
     * @return native lib object representation of the given marker name.
     * @throws RuntimeException if the segment is not known.
     */
    private ViconString convertMarkerName(String markerName){
        ViconString segmentNameAsViconString = segmentNames.get(markerName);
        if (segmentNameAsViconString != null){
            return segmentNameAsViconString;
        } else {
            throw new RuntimeException("Segment with name \""+markerName+"\" does not exist");
        }
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
        Output_GetSegmentCount result = client.GetSegmentCount(convertSubjectName(subjectName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            //Exception in thread "main" java.lang.RuntimeException: getSegmentCount() 
            // but subjectName "de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconString@404b9385" is invalid!
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
     * @return The name of the segment 
     * @throws RuntimeException if the client is not connected, the subjectName
     * is not valid, the segment index is invalid or if no frame is available
     */
    public String getSegmentName(String subjectName, long segmentIndex) {
        Output_GetSegmentName result = client.GetSegmentName(convertSubjectName(subjectName), segmentIndex);
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
        return result.getSegmentName().toStdString();
    }

    public long getSegmentChildCount(String subjectName, String segmentName) {
        Output_GetSegmentChildCount result = client.GetSegmentChildCount(convertSubjectName(subjectName), convertSegmentName(segmentName));
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

    /**
     * Return the name of the child segment for a speciﬁed subject segment and 
     * index.
     * 
     * See Also: GetSegmentCount(), GetSegmentChildCount(), GetSegmentChildName(), 
     * GetSubjectRootSegmentName()<p>
     *
     * @param subjectName 
     * @param segmentName 
     * @param segmentIndex 
     * @return  child name
     * @throws RuntimeException if the subject or segment name is invalid, the client is 
     * not connected, the segment index is invalid or no frame is available.
     */
    public String getSegmentChildName(String subjectName, String segmentName, long segmentIndex) {
        Output_GetSegmentChildName result = client.GetSegmentChildName(
                convertSubjectName(subjectName), convertSegmentName(segmentName), segmentIndex);
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
        String SegmentName = result.getSegmentName().toStdString();
        //System.out.println("Get segment name: "+SegmentName);
        return SegmentName;
    }

    /**
     * Return the name of the parent segment for a speciﬁed subject segment. 
     * 
     * See Also: GetSegmentCount(), GetSegmentChildCount(), GetSegmentChildName(), 
     * GetSubjectRootSegmentName() 
     * 
     * @param subjectName
     * @param segmentName
     * @return null, if the given segment is the root segment of the subject
     * @throws RuntimeException if the subject name is invalid, the client is not
     * connected, no frame is available or the segment name is invalid.
     */
    public String getSegmentParentName(String subjectName, String segmentName) {
        Output_GetSegmentParentName result = client.GetSegmentParentName(convertSubjectName(subjectName), convertSegmentName(segmentName));
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

        String resultString = result.getSegmentName().toStdString();
        if (resultString.isEmpty()) resultString = null;
        return resultString;
    }

    /**
     * Return the static pose translation of a subject segment. 
     * 
     * The static translation of the segment corresponds to the PRE-POSITION 
     * element of the segment in the subject vsk. It is the base position 
     * of the segment, and is included in the value returned by 
     * GetLocalTranslation.<p>
     * 
     * If you are required to calculate the amount a segment has moved from 
     * its base position, subtract this value from the local translation.<p>
     * 
     * See Also: GetSegmentStaticRotationHelical(), GetSegmentStaticRotationMatrix(), 
     * GetSegmentStaticRotationQuaternion(), GetSegmentStaticRotationEulerXYZ(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationMatrix(), GetSegmentLocalRotationQuaternion(), 
     * GetSegmentLocalRotationEulerXYZ()<p>
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentStaticTranslation(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentStaticTranslation result = client.GetSegmentStaticTranslation(subjectNameAsViconString, segmentNameAsViconString);
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
        return result.getTranslation();
    }

    /**
     * Return the static pose rotation of a subject segment in helical coordinates. 
     * 
     * The helical coordinates represent a vector whose length is the amount of 
     * rotation in radians, and the direction is the axis about which to rotate.<p>
     * 
     * The static rotation of the segment corresponds to the PRE-ORIENTATION element 
     * of the segment in the subject vsk. It is the base rotation of the segment, 
     * and is included in the value returned by GetLocalRotation∗.<p>
     * 
     * If you are required to calculate the amount a segment has rotated from 
     * its base position, subtract this value from the local rotation.<p>
     * 
     * See Also: GetSegmentStaticTranslation(), GetSegmentStaticRotationMatrix(), 
     * GetSegmentStaticRotationQuaternion(), GetSegmentStaticRotationEulerXYZ(), 
     * GetSegmentLocalTranslation, GetSegmentLocalRotationHelical,
     * GetSegmentLocalRotationMatrix,GetSegmentLocalRotationQuaternion, 
     * GetSegmentLocalRotationEulerXYZ<p>
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentStaticRotationHelical(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentStaticRotationHelical result = client.GetSegmentStaticRotationHelical(
                subjectNameAsViconString, segmentNameAsViconString);
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
        return result.getRotation();
    }

    /**
     * Return the static pose rotation of a subject segment as a 3x3 row-major matrix. 
     * 
     * The static rotation of the segment corresponds to the PRE-ORIENTATION element 
     * of the segment in the subject vsk. It is the base rotation of the segment, 
     * and is included in the value returned by GetLocalRotation∗.<p>
     * 
     * If you are required to calculate the amount a segment has rotated from its 
     * base position, subtract this value from the local rotation.<p>
     * 
     * See Also: GetSegmentStaticTranslation(), GetSegmentStaticRotationHelical(), 
     * GetSegmentStaticRotationQuaternion(), GetSegmentStaticRotationEulerXYZ(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationQuaternion(), GetSegmentLocalRotationEulerXYZ()<p>
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentStaticRotationMatrix(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentStaticRotationMatrix result = client.GetSegmentStaticRotationMatrix(subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the static pose rotation of a subject segment in quaternion coordinates. 
     * 
     * The quaternion is of the form (x, y, z, w) where w is the real component 
     * and x, y and z are the imaginary components. N.B. This is different from 
     * that used in many other applications, which use (w, x, y, z). The static 
     * rotation of the segment corresponds to the PRE-ORIENTATION element of 
     * the segment in the subject vsk. It is the base rotation of the segment, 
     * and is included in the value returned by GetLocalRotation∗. If you are 
     * required to calculate the amount a segment has rotated from its base 
     * position, subtract this value from the local rotation.<p>
     * 
     * See Also: GetSegmentStaticTranslation(), GetSegmentStaticRotationHelical(), 
     * GetSegmentStaticRotationMatrix(), GetSegmentStaticRotationEulerXYZ(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationMatrix(), GetSegmentLocalRotationQuaternion(), 
     * GetSegmentLocalRotationEulerXYZ() 
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentStaticRotationQuaternion(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentStaticRotationQuaternion result = client.GetSegmentStaticRotationQuaternion(subjectNameAsViconString, segmentNameAsViconString);
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
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentStaticRotationEulerXYZ result = client.GetSegmentStaticRotationEulerXYZ(
                subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the translation of a subject segment in global coordinates. 
     * 
     * The translation is of the form ( x, y, z ) where x, y and z are in 
     * millimeters with respect to the global origin.<p>
     * 
     * See Also: GetSegmentGlobalRotationHelical(), GetSegmentGlobalRotationMatrix(), 
     * GetSegmentGlobalRotationQuaternion(), GetSegmentGlobalRotationEulerXYZ(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationMatrix(), GetSegmentLocalRotationQuaternion(), 
     * GetSegmentLocalRotationEulerXYZ() 
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentGlobalTranslation(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentGlobalTranslation result = client.GetSegmentGlobalTranslation(subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the static pose translation of a subject segment. 
     * 
     * The static translation of the segment corresponds to the PRE-POSITION 
     * element of the segment in the subject vsk. It is the base position of the 
     * segment, and is included in the value returned by GetLocalTranslation. 
     * 
     * If you are required to calculate the amount a segment has moved from its 
     * base position, subtract this value from the local translation.<p>
     * 
     * See Also: GetSegmentStaticRotationHelical(), GetSegmentStaticRotationMatrix(), 
     * GetSegmentStaticRotationQuaternion(), GetSegmentStaticRotationEulerXYZ(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationMatrix(), GetSegmentLocalRotationQuaternion(), 
     * GetSegmentLocalRotationEulerXYZ() 
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentLocalRotationHelical(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentLocalRotationHelical result = client.GetSegmentLocalRotationHelical(
                subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the rotation of a subject segment in global helical coordinates. 
     * 
     * See Also: GetSegmentGlobalTranslation(), GetSegmentGlobalRotationMatrix(), 
     * GetSegmentGlobalRotationQuaternion(), GetSegmentGlobalRotationEulerXYZ(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationMatrix(), GetSegmentLocalRotationQuaternion(), 
     * GetSegmentLocalRotationEulerXYZ()<p>
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentGlobalRotationHelical(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentGlobalRotationHelical result = client.GetSegmentGlobalRotationHelical(
                subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the rotation of a subject segment as a 3x3 row-major matrix in 
     * global coordinates. 
     * 
     * See Also: GetSegmentGlobalTranslation(), GetSegmentGlobalRotationHelical(), 
     * GetSegmentGlobalRotationQuaternion(), GetSegmentGlobalRotationEulerXYZ(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationQuaternion(), GetSegmentLocalRotationEulerXYZ()<p>
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentGlobalRotationMatrix(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentGlobalRotationMatrix result = client.GetSegmentGlobalRotationMatrix(subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the rotation of a subject segment in global quaternion coordinates. 
     * 
     * The quaternion is of the form (x, y, z, w) where w is the real component 
     * and x, y and z are the imaginary components. N.B. This is different from 
     * that used in many other applications, which use (w, x, y, z).<p>
     * 
     * See Also: GetSegmentGlobalTranslation(), GetSegmentGlobalRotationHelical(), 
     * GetSegmentGlobalRotationMatrix(), GetSegmentGlobalRotationEulerXYZ(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationMatrix(), GetSegmentLocalRotationQuaternion(), 
     * GetSegmentLocalRotationEulerXYZ()<p>
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentGlobalRotationQuaternion(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentGlobalRotationQuaternion result = client.GetSegmentGlobalRotationQuaternion(subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the rotation of a subject segment in global Euler XYZ coordinates. 
     * 
     * See Also: GetSegmentGlobalTranslation(), GetSegmentGlobalRotationHelical(), 
     * GetSegmentGlobalRotationMatrix(), GetSegmentGlobalRotationQuaternion(), 
     * GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationMatrix(), GetSegmentLocalRotationQuaternion(), 
     * GetSegmentLocalRotationEulerXYZ() 
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentGlobalRotationEulerXYZ(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentGlobalRotationEulerXYZ result = client.GetSegmentGlobalRotationEulerXYZ(
                subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the translation of a subject segment in local coordinates relative 
     * to its parent segment. 
     * 
     * See Also: GetSegmentLocalRotationHelical(), GetSegmentLocalRotationMatrix(), 
     * GetSegmentLocalRotationQuaternion(), GetSegmentLocalRotationEulerXYZ(), 
     * GetSegmentGlobalTranslation(), GetSegmentGlobalRotationHelical(), 
     * GetSegmentGlobalRotationMatrix(), GetSegmentGlobalRotationQuaternion(), 
     * GetSegmentGlobalRotationEulerXYZ() 
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentLocalTranslation(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentLocalTranslation result = client.GetSegmentLocalTranslation(
                subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the rotation of a subject segment in local quaternion coordinates 
     * relative to its parent segment. 
     * 
     * The quaternion is of the form (x, y, z, w) where w is the real component 
     * and x, y and z are the imaginary components. N.B. This is different from 
     * that used in many other applications, which use (w, x, y, z).<p>
     * 
     * See Also: GetSegmentLocalTranslation(), GetSegmentLocalRotationHelical(), 
     * GetSegmentLocalRotationMatrix(), GetSegmentLocalRotationEulerXYZ(), 
     * GetSegmentGlobalTranslation(), GetSegmentGlobalRotationHelical(), 
     * GetSegmentGlobalRotationMatrix(), GetSegmentGlobalRotationQuaternion(), 
     * GetSegmentGlobalRotationEulerXYZ() 
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentLocalRotationQuaternion(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentLocalRotationQuaternion result = client.GetSegmentLocalRotationQuaternion(
                subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * 
     * @param subjectName
     * @param segmentName
     * @return 
     */
    public double[] getSegmentLocalRotationEulerXYZ(String subjectName, String segmentName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString segmentNameAsViconString = convertSegmentName(segmentName);
        Output_GetSegmentLocalRotationEulerXYZ result = client.GetSegmentLocalRotationEulerXYZ(
                subjectNameAsViconString, segmentNameAsViconString);
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

    /**
     * Return the quality score for a speciﬁed Object (Subject). 
     * 
     * This is only implemented by applications that use an object tracking graph 
     * such as Evoke and Tracker.<p>
     * 
     * See Also: GetSubjectCount(), GetSubjectName()<p>
     * 
     * @param subjectName
     * @return 
     * @throws RuntimeException if subject name in invalid, client is not connectd or no frame is available
     */
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

    /**
     * Return the translation of a subject marker in global coordinates. 
     * 
     * The Translation is of the form ( x, y, z ) where x, y and z are in 
     * millimeters with respect to the global origin.<p>
     * 
     * See Also: GetMarkerName()<p>
     * 
     * @param subjectName
     * @param markerName
     * @return translation with respect to the global origin
     * @throws RuntimeException if subject name or marker name is invalid, no frame
     * is available or the client is not connected.
     */
    public double[] getMarkerGlobalTranslation(String subjectName, String markerName) {
        ViconString subjectNameAsViconString = convertSubjectName(subjectName);
        ViconString markerNameAsViconString = convertMarkerName(markerName);
        Output_GetMarkerGlobalTranslation result = client.GetMarkerGlobalTranslation(
                subjectNameAsViconString, markerNameAsViconString);
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

    /**
     * Return the number of markers for a specified subject in the DataStream.
     *
     * This information can be used in conjunction with GetMarkerName<p>
     *
     * See Also : GetSubjectName, GetMarkerName<p>
     *
     * @param subjectName The name of the subject
     * @return The number of markers
     * @throws RuntimeException if segment name is invalid, client is not connected or no frame is available
     */
    public long getMarkerCount(String subjectName) {
        Output_GetMarkerCount result = client.GetMarkerCount(convertSubjectName(subjectName));
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

    /**
     * Return the translation of an unlabeled marker in global coordinates. 
     * 
     * The Translation is of the form ( x, y, z ) where x, y and z are in millimeters 
     * with respect to the global origin.<p>
     * 
     * See Also: GetUnlabeledMarkerCount()<p>
     * 
     * @param markerIndex
     * @return 
     */
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

    /**
     * Return the number of force plates, EMGs, and other devices in the DataStream. 
     * 
     * This information can be used in conjunction with GetDeviceName.<p>
     * 
     * See Also: GetDeviceName() 
     * 
     * @return number of devices
     * @throws RuntimeException if the client is not connected or no frame is available.
     */
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

    /**
     * Return the name and type of a device. 
     * 
     * This name can be passed into device functions.<p>
     * 
     * See Also: GetDeviceCount(), GetDeviceOutputCount(), GetDeviceOutputValue()<p>
     * 
     * @param deviceIndex
     * @return device name
     * @throws RuntimeException if device index is invalid, no frame is available 
     * or client is not connected.
     */
    public String getDeviceName(int deviceIndex) {
        if (deviceIndex < 0) {
            throw new IllegalArgumentException("getSubjectName() deviceIndex >=0 is needed!");
        }
        Output_GetDeviceName result = client.GetDeviceName(deviceIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getDeviceName() but deviceIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getDeviceName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getDeviceName() but client is not connected!!");
        }
        String DeviceName = result.getDeviceName().toStdString();
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

    /**
     * Enable centroid data in the Vicon DataStream. 
     * 
     * Call this function on startup, after connecting to the server, and before
     * trying to read centroid information.<p>
     * 
     * @see isCentroidDataEnabled
     * @see disableCentroidData
     * 
     * @throws RuntimeException if the client is not connected.
     */
    public void enableCentroidData() {
        Output_EnableCentroidData result = client.EnableCentroidData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
    }
    
    /**
     * Enable greyscale data in the Vicon DataStream. 
     * 
     * Call this function on startup, after connecting to the server, and before 
     * trying to read greyscale information. 
     * 
     * @see IsGreyscaleDataEnabled
     * @see DisableGreyscaleData
     * @throw RuntimeException if the client is not connected.
     */
    public void enableGreyscaleData() {
        Output_EnableGreyscaleData result = client.EnableGreyscaleData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
    }
    
    /**
     * Enable video data in the Vicon DataStream. 
     * 
     * Call this function on startup, after connecting to the server, and before 
     * trying to read video information. 
     * 
     * @see isVideoDataEnabled
     * @see disableVideoData
     * 
     * @throws RuntimeException if the client is not connected.
     */
    public void enableVideoData() {
        Output_EnableVideoData result = client.EnableVideoData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
    }
    
    /**
     * Return the number of cameras available in the DataStream. 
     * 
     * See Also: GetCameraName(), GetCentroidCount(), GetCentroidPosition()
     * 
     * @return number of cameras
     * @throws RuntimeException if client is not connected or no frame is available
     */
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

    /**
     * Return the name of a camera. 
     * 
     * This name can be passed into centroid functions.<p>
     * 
     * See Also: GetCameraCount(), GetCentroidCount(), GetCentroidPosition() 
     * 
     * @param CameraIndex
     * @return camera name
     * @throws RuntimeException for wrong camera index, if the client is not connected
     * or no frame is avaiable
     */
    public String getCameraName(int CameraIndex) {
        if (CameraIndex < 0) {
            throw new IllegalArgumentException("getCameraName() CameraIndex >=0 is needed!");
        }
        Output_GetCameraName result = client.GetCameraName(CameraIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getCameraName() but CameraIndex is invalid!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getCameraName() but no frame available!");
        }
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getCameraName() but client is not connected!!");
        }
        String CameraName = result.getCameraName().toStdString();
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
     * Return the name of a marker for a specified subject. 
     * 
     * This can be passed into GetMarkerGlobalTranslation.<p>
     * 
     * See Also : GetMarkerCount, GetMarkerGlobalTranslation<p>
     * 
     * @param subjectName the name of the subject.
     * @param markerIndex The index of the marker.
     * @return The name of the marker.
     * @throws RuntimeException if client is not connected, no frame is available, invalid subject name or invalid marker index
     */
    public String getMarkerName(String subjectName, long markerIndex) {
        Output_GetMarkerName result = client.GetMarkerName(this.convertSubjectName(subjectName), markerIndex);
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
        return result.getMarkerName().toStdString();
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

    /**
     * Return the timecode information for the last frame retrieved from the 
     * DataStream. 
     * 
     * If the stream is valid but timecode is not available, the Output will 
     * be Result.Success and the Standard will be None. 
     * 
     * See Also: GetFrame(), GetFrameNumber() 
     * 
     * @return timecode
     * @throws RuntimeException if no frame is avaialble or the client is not connected.
     */
    public TimeCode getTimeCode() {
        Output_GetTimecode result = client.GetTimecode();
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("get frame number but client not connected!");
        }
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("get frame number but no frame available!");
        }
        return new TimeCode(result);
    }

    /**
     * Request a new frame to be fetched from the Vicon DataStream Server.
     *
     * TODO eventuell timeout als argument mitübergeben?
     * <p>
     *
     * @param waiting true, than waiting till connected
     * @return false if client is not connected.
     *
     * See Also : SetStreamMode
     */
    public boolean getFrame(boolean waiting) {
        Result_Enum result = client.GetFrame().getResult();
        if (waiting) {
            // while not connected
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

    public void delete(){
        client.delete();
    }
    
    /**
     * Get segment local rotation matrix.
     *
     * @param subjectName The name of the subject
     * @param segmentName The name of the segment.
     * @return The translation of a subject segment in local co-ordinates
     * relative to its parent segment.
     * @throws RuntimeException if the client is not connected, no frame is available,
     * invalid subject or invalid segment name
     * <p>
     *
     * See Also : GetSegmentLocalRotationHelical, GetSegmentLocalRotationMatrix,
     * GetSegmentLocalRotationQuaternion, GetSegmentLocalRotationEulerXYZ,
     * GetSegmentGlobalTranslation,GetSegmentGlobalRotationHelical,
     * GetSegmentGlobalRotationMatrix, GetSegmentGlobalRotationQuaternion,
     * GetSegmentGlobalRotationEulerXYZ
     *
     */
     public double[] getSegmentLocalRotationMatrix(String subjectName, String segmentName){ 
        Output_GetSegmentLocalRotationMatrix result =
               client.GetSegmentLocalRotationMatrix(convertSubjectName(subjectName), convertSegmentName(segmentName)); 
        System.out.println("Get segment local rotation matrix: "+result.getResult().toString()); 
        if (result.getResult() == Result_Enum.NotConnected) throw new
                RuntimeException("getSegmentLocalRotationMatrix() but client not connected!"); 
        if (result.getResult() == Result_Enum.NoFrame) throw new
                RuntimeException("getSegmentLocalRotationMatrix() but no frame available!"); 
        if (result.getResult() == Result_Enum.InvalidSubjectName) throw new 
                RuntimeException("getSegmentLocalRotationMatrix() but invalid subject name \""+subjectName+"\"!"); 
        if (result.getResult() == Result_Enum.InvalidSegmentName) throw new
                RuntimeException("getSegmentLocalRotationMatrix() but invalid segment name \""+segmentName+"\"!");

        if (result.getOccluded()) { 
            return new double[]{Double.NaN, Double.NaN, Double.NaN}; 
        } 
        return result.getRotation(); 
     }
}
