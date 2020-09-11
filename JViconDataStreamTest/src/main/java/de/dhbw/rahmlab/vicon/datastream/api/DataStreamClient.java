package de.dhbw.rahmlab.vicon.datastream.api;

import de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconString;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Client;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.DeviceType_Enum;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Direction_Enum;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_Connect;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_ConnectToMulticast;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableCentroidData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableDebugData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableDeviceData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableGreyscaleData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableLightweightSegmentData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableMarkerRayData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableUnlabeledMarkerData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_DisableVideoData;
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
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetAxisMapping;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetCameraCount;
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
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetMarkerRayContribution;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetMarkerRayContributionCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceOutputCount;
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
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetLatencySampleCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetLatencySampleName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetLatencySampleValue;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetLatencyTotal;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetMarkerParentName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetObjectQuality;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalRotationEulerXYZ;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalRotationHelical;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalRotationMatrix;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentGlobalRotationQuaternion;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSegmentStaticScale;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetTimecode;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetUnlabeledMarkerCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetUnlabeledMarkerGlobalTranslation;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsCentroidDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsDebugDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsDeviceDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsGreyscaleDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsMarkerRayDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_IsVideoDataEnabled;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_SetAxisMapping;
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
 * When a function has returned false, the output arguments are set to an appropriate default value:
 * • Booleans will be set to false.
 * • Integers will be set to zero.
 * • Doubles will be set to zero.
 * • Strings will be set to zero length.
 * • When the output argument is an array, all elements are set in this manner.
 *
 * By default the global coordinate system matches the server application; Z-Up, 
 * Y-Left. This can be changed by using Client::SetAxisMapping.
 *
 * TODO
 * - Kommentare vervollständigen, Ex überprüfen
 * - throw messages in String const auslagern
 */
public class DataStreamClient {

	private final Client client;

	private final Map<String, ViconString> subjectNames = new HashMap<>();
	private final Map<String, ViconString> segmentNames = new HashMap<>();
	private final Map<String, ViconString> markerNames = new HashMap<>();
	private final Map<String, ViconString> frameRateNames = new HashMap<>();
	private final Map<String, ViconString> deviceNames = new HashMap<>();
	private final Map<String, Map<String, ViconString>> deviceOutputNames = new HashMap<>();
	private final Map<String, ViconString> latencySampleNames = new HashMap<>();

	static {
            //System.loadLibrary("jViconDataStreamSDK");
            NativeLibLoader.load();	
        }

	/**
	 * Scan subject names.
	 *
	 * @throws RuntimeException if no frame is available or the client is not
	 * connected
	 */
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

	/**
	 * Scan segment names.
	 */
	private void scanSegmentNames() {
		segmentNames.clear();
		long subjects = getSubjectCount();
            for (int j=0;j<subjects;j++){
                String subjectName = getSubjectName(j);
                ViconString subjecNameAsViconString = convertSubjectName(subjectName);
                long segments = getSegmentCount(subjectName);
                for (int i = 0; i < segments; i++) {
                        Output_GetSegmentName result = client.GetSegmentName(subjecNameAsViconString, i);
                        if (result.getResult() == Result_Enum.NotConnected) {
                                throw new RuntimeException("getSegmentName() but client is not connected!!");
                        }
                        if (result.getResult() == Result_Enum.InvalidIndex) {
                                throw new RuntimeException("getSegmentName() but index is invalid!");
                        }
                        ViconString segmentNameViconString = result.getSegmentName();
                        String segmentName = segmentNameViconString.toStdString(); //toString();
                        segmentNames.put(segmentName, segmentNameViconString);
                        System.out.println("added segment \"" + segmentName + "\"");
                }
            }
	}

	/**
	 * Scan frameRate names.
	 *
	 */
	private void scanFrameRateNames() {
		frameRateNames.clear();
		long frameRateCount = this.getFrameRateCount();
		for (int j = 0; j < frameRateCount; j++) {
			Output_GetFrameRateName result = client.GetFrameRateName(j);
			if (result.getResult() == Result_Enum.NotConnected) {
				throw new RuntimeException("getFrameRateName() but client is not connected!!");
			}
			if (result.getResult() == Result_Enum.InvalidIndex) {
				throw new RuntimeException("getFrameRateName() but index is invalid!");
			}
			ViconString frameRateNameAsViconString = result.getName();
			String frameRateName = frameRateNameAsViconString.toStdString();
			frameRateNames.put(frameRateName, frameRateNameAsViconString);
			System.out.println("added frameRateName \"" + frameRateName + "\"");
		}
	}

	private void scanLatencySampleNames() {
		latencySampleNames.clear();
		long latencySampleNamesCount = getLatencySampleCount();
		for (int i = 0; i < latencySampleNamesCount; i++) {
			Output_GetLatencySampleName result = client.GetLatencySampleName(i);
			if (result.getResult() == Result_Enum.NotConnected) {
				throw new RuntimeException("getLatencySampleName() but client is not connected!!");
			}
			if (result.getResult() == Result_Enum.InvalidIndex) {
				throw new RuntimeException("getLatencySampleName() but index is invalid!");
			}
			ViconString latencySampleNameAsViconString = result.getName();
			String latencySampleName = latencySampleNameAsViconString.toStdString();
			latencySampleNames.put(latencySampleName, latencySampleNameAsViconString);
			System.out.println("added latencySampleName \"" + latencySampleName + "\"");
		}
	}

	/**
	 * Scan device names.
	 *
	 * @throws RuntimeException if the client is not connected
	 * @throws IllegalArgumentException if the an invalid device index is
	 * selected.
	 */
	private void scanDeviceNames() {
		deviceNames.clear();
		long deviceCount = getDeviceCount();
		for (int j = 0; j < deviceCount; j++) {
			Output_GetDeviceName result = client.GetDeviceName(j);
			if (result.getResult() == Result_Enum.NotConnected) {
				throw new RuntimeException("getDeviceName() but client is not connected!!");
			}
			if (result.getResult() == Result_Enum.InvalidIndex) {
				throw new IllegalArgumentException("getDeviceName() but index is invalid!");
			}
			ViconString deviceNameAsViconString = result.getDeviceName();
			String deviceName = deviceNameAsViconString.toStdString();
			deviceNames.put(deviceName, deviceNameAsViconString);
			System.out.println("added deviceName \"" + deviceName + "\"");
		}
	}

	/**
	 * Scan device output names for all devices.
	 *
	 * @throws RuntimeException if the client is not connected or no frame is
	 * available
	 */
	private void scanDeviceOutputNames() {
		deviceOutputNames.clear();
		for (String deviceName: deviceNames.keySet()) {
			long deviceOutputCount = getDeviceOutputCount(deviceName);
			Map<String, ViconString> outputNamesMap = deviceOutputNames.get(deviceName);
			if (outputNamesMap == null) {
				outputNamesMap = new HashMap<>();
				deviceOutputNames.put(deviceName, outputNamesMap);
			}
			ViconString deviceNameAsViconString = convertDeviceName(deviceName);
			for (int j = 0; j < deviceOutputCount; j++) {
				Output_GetDeviceOutputName result = client.GetDeviceOutputName(deviceNameAsViconString, j);
				if (result.getResult() == Result_Enum.NotConnected) {
					throw new RuntimeException("getDeviceOutputName() but client is not connected!!");
				}
				if (result.getResult() == Result_Enum.InvalidIndex) {
					throw new RuntimeException("getDeviceOutputName() but index is invalid!");
				}
				ViconString deviceOutputNameAsViconString = result.getDeviceOutputName();
				String deviceOutputName = deviceOutputNameAsViconString.toStdString();
				outputNamesMap.put(deviceOutputName, deviceOutputNameAsViconString);
				System.out.println("added deviceOutputName \"" + deviceOutputName + "\" for device \"" + deviceName + "\"!");
			}
		}
	}

	/**
	 * Scan marker names.
	 *
	 */
	private void scanMarkerNames() {
		markerNames.clear();
		long subjects = getSubjectCount();
		for (int j = 0; j < subjects; j++) {
			String subjectName = getSubjectName(j);
			ViconString subjectNameAsViconString = convertSubjectName(subjectName);
			long markers = getMarkerCount(subjectName);
			for (int i = 0; i < markers; i++) {
				Output_GetMarkerName result = client.GetMarkerName(subjectNameAsViconString, i);
				ViconString markerNameViconString = result.getMarkerName();
				String markerName = markerNameViconString.toStdString(); //toString();
				markerNames.put(markerName, markerNameViconString);
				System.out.println("added marker \"" + markerName + "\"");
			}
		}
	}

	/**
	 * You can create many instances of the Vicon DataStream Client which can
	 * connect to multiple Vicon DataStream Servers.
	 */
	public DataStreamClient() {
		client = new Client();
	}

	/**
	 * Establish a dedicated connection to a Vicon DataStream Server.
	 *
	 * @see connectToMulticast
	 * @see disconnect
	 * @see isConnected
	 * @param hostname The DNS identifiable name, or IP address of the PC
	 * hosting the DataStream server. The function defaults to connecting on
	 * port 801. You can specify an alternate port number after a colon. E.g.:
	 * "localhost" "MyViconPC:804", "10.0.0.2"
	 * @throws IllegalArgumentException if given hostname is invalid
	 */
	public void connect(String hostname) {
		int i = 0;
		while (!isConnected()) {

			Output_Connect result = client.Connect(new ViconString(hostname));

			//Output_ConnectToMulticast result = client.ConnectToMulticast(new ViconString(hostname), new ViconString(hostname));
			// tritt seltsamerweise auch für localhost ab und zu auf
			if (result.getResult() == Result_Enum.InvalidHostName) {
				throw new IllegalArgumentException("connect() but invalid hostname \"" + hostname + "\"!");
			}
			if (result.getResult() == Result_Enum.ClientAlreadyConnected) {
				System.out.println("Client is Already Connected! ");
			}
			if (result.getResult() == Result_Enum.Success) // ende der while schleife
			{
				System.out.println("Client Connection sucess!");
			}
			if (result.getResult() == Result_Enum.ClientAlreadyConnected) // --> kann innerhalb der while schleife nicht auftreten
			{
				System.out.println("Client already connected!");
			}
			if (result.getResult() == Result_Enum.ClientConnectionFailed) // --> dafür ist die while schleife da
			{
				System.out.println("Client Connection failed!");
			}
			try {
				Thread.sleep(1000);
				System.out.println("...try to connect " + String.valueOf(i++));
			} catch (InterruptedException ex) {
				Logger.getLogger(DataStreamClient.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		getFrame(true);
		scanSubjectNames();
		scanSegmentNames();
		scanMarkerNames();
		scanFrameRateNames();
		scanDeviceNames();
		scanDeviceOutputNames();
		scanLatencySampleNames();
	}

	/**
	 * Connect to a Vicon DataStream Server’s Multicast stream.
	 *
	 * @see connect
	 * @see disconnect
	 * @see isConnected
	 * @see startTransmittingMulticast
	 * @see stopTransmittingMulticast
	 * @param hostname The DNS identifiable name, or IP address of the PC
	 * hosting the DataStream server. The function defaults to connecting on
	 * port 801. You can specify an alternate port number after a colon. E.g.:
	 * "localhost" "MyViconPC:804", "10.0.0.2"
	 * <p>
	 * @param multicastHostname The IP Address of the Multicast group on which
	 * data will be received. The address must be in the range
	 * 224.0.0.0-239.255.255.255 You may also specify a port by appending it to
	 * the end of the IP Address after a colon, e.g. 224.0.0.0:30001. If you do
	 * not specify a port it will default to 44801.
	 * @throws RuntimeException if given hostname is invalid
	 * @throws IllegalArgumentException if given hostname is invalid
	 */
	public void connectToMulticast(String hostname, String multicastHostname) {
		int i = 0;
		while (!isConnected()) {

			Output_ConnectToMulticast result = client.ConnectToMulticast(new ViconString(hostname), new ViconString(multicastHostname));

			// tritt seltsamerweise auch für localhost ab und zu auf
			if (result.getResult() == Result_Enum.InvalidHostName) {
				throw new IllegalArgumentException("connect() but invalid hostname \"" + hostname + "\"!");
			}
			if (result.getResult() == Result_Enum.Success) // ende der while schleife
			{
				System.out.println("Client Connection sucess!");
			}
			if (result.getResult() == Result_Enum.ClientAlreadyConnected) // --> kann innerhalb der while schleife nicht auftreten
			{
				System.out.println("Client already connected!");
			}
			if (result.getResult() == Result_Enum.ClientConnectionFailed) // --> dafür ist die while schleife da
			{
				System.out.println("Client Connection failed!");
			}
			//System.out.println("connect result = \""+result.getResult().toString()+"\"!");
			try {
				Thread.sleep(1000);
				System.out.println("...try to connect " + String.valueOf(i++));
			} catch (InterruptedException ex) {
				Logger.getLogger(DataStreamClient.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		getFrame(true);
		scanSubjectNames();
		scanSegmentNames();
		scanMarkerNames();
		scanFrameRateNames();
		scanDeviceNames();
		scanDeviceOutputNames();
		scanLatencySampleNames();
	}

	/**
	 * Ask the DataStreamServer to start transmitting the data you are receiving
	 * directly to aMulticast address as well.
	 *
	 * This allows multiple clients to connect to your stream (via
	 * ConnectToMulticast()), whilst minimizing network bandwidth use and frame
	 * delivery latency.<p>
	 *
	 * @see connect
	 * @see connectToMulticast
	 * @see disconnect
	 * @see stopTransmittingMulticast
	 * @param serverIP The IP Address of the server Ethernet interface from
	 * which the Multicast data will be sent. Do not specify a port number (any
	 * port number speciﬁed will be ignored).
	 * @param multicastIP The IP Address of the Multicast group to which
	 * Multicast data will be sent. The address must be in the range
	 * 224.0.0.0-239.255.255.255. You may also specify the port the data will be
	 * sent to by appending it to the IP Address after a colon, e.g.
	 * 224.0.0.0:30001. If you do not specify a port it will default to 44801.
	 * @return fase if server is already transmitting
	 * @throws IllegalArgumentException if multicast IP is invalid
	 * @throws RuntimeException if client is not connected
	 */
	public boolean startTransmittingMulticast(String serverIP, String multicastIP) {
		boolean resultValue = true;
		Output_StartTransmittingMulticast result = client.StartTransmittingMulticast(
			new ViconString(serverIP), new ViconString(multicastIP));
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("Client is not connected!");
		} else if (result.getResult() == Result_Enum.InvalidMulticastIP) {
			throw new IllegalArgumentException("Multicast IP is invalid! ");
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
	 * You must previously have started a transmission via
	 * StartTransmittingMulticast.
	 * <p>
	 *
	 * @see connect
	 * @see connectToMulticast
	 * @see disconnect
	 * @see startTransmittingMulticast
	 * @return false, if server not transmitting multicast
	 * @throws RuntimeException if client is not connected
	 */
	public boolean stopTransmittingMulticast() {
		boolean resultValue = true;
		Output_StopTransmittingMulticast result = client.StopTransmittingMulticast();
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("Client is not connected!");
		} else if (result.getResult() == Result_Enum.ServerNotTransmittingMulticast) {
			System.out.println("Server not transmitting multicast! ");
			resultValue = false;
		}
		return resultValue;
	}

	/**
	 * Discover whether client is connected to the Vicon DataStream Server.
	 *
	 * @see connect
	 * @see disconnect
	 * @return true, if you are connected to the stream, otherwise false.
	 */
	public boolean isConnected() {
		return client.IsConnected().getConnected();
	}

	/**
	 * Disconnect from the Vicon DataStream Server.
	 *
	 * @see connect
	 * @see isConnected
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
	 */
	public Version getVersion() {
		return new Version(client.GetVersion());
	}

	/**
	 * Return the name and type of a device.
	 *
	 * This name can be passed into device functions.
	 *
	 * The possible device types are:
	 * <p>
	 * Unknown ForcePlate EyeTracker
	 *
	 * @see getDeviceCount
	 * @see getDeviceOutputCount
	 * @see getDeviceOutputValue
	 * @param deviceIndex device index
	 * @return device name as type
	 * @throws RuntimeException if no frame available or not connected.
	 * @throws IllegalArgumentException if the index is invalid
	 */
	public String[] getDeviceName(long deviceIndex) {
		Output_GetDeviceName result = client.GetDeviceName(deviceIndex);
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getUnlabeledMarkerCount() invoked but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getUnlabeledMarkerCount() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getDeviceOutputName() but deviceName is invalid!");
		}
		ViconString deviceName = result.getDeviceName();
		DeviceType_Enum deviceType = result.getDeviceType();
		return new String[]{deviceName.toStdString(), deviceType.toString()};
	}

	/**
	 * Enable debug data in the Vicon DataStream.
	 *
	 * In order to receive debug data, call this function on startup, after
	 * connecting to the server.<p>
	 *
	 * @see isDebugDataEnabled
	 * @see disableDebugData
	 * @throws RuntimeException if the client is not connected.
	 */
	public void enableDebugData(){
		Output_EnableDebugData result = client.EnableDebugData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("The client is not connected!");
		}
	}

	/**
	 * Enable labeled reconstructed marker data in the Vicon DataStream.
	 *
	 * Call this function on startup, after connecting to the server, and before
	 * trying to read labeled marker data.<p>
	 *
	 * @see isMarkerDataEnabled
	 * @see disableMarkerData
	 * @see enableSegmentData
	 * @see enableUnlabeledMarkerData
	 * @see enableDeviceData
	 * @see getMarkerCount
	 * @see getMarkerName
	 * @see getMarkerGlobalTranslation
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
	 * trying to read device information.
	 * <p>
	 *
	 * @see isDeviceDataEnabled
	 * @see disableDeviceData
	 * @see enableSegmentData
	 * @see enableMarkerData
	 * @see enableUnlabeledMarkerData
	 * @see getDeviceCount
	 * @see getDeviceName
	 * @see getDeviceOutputCount
	 * @see getDeviceOutputName
	 * @see getDeviceOutputValue
	 * @throws RuntimeException if the client is not connected.
	 */
	public void enableDeviceData() {
		Output_EnableDeviceData result = client.EnableDeviceData();
		//System.out.println("Enable marker data: "+result.getResult().toString());
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("The client is not connected!");
		}
	}

	/**
	 * Enable information about the rays contributing to each labeled marker in
	 * the Vicon DataStream.
	 *
	 * Call this function on startup, after connecting to the server, and before
	 * trying to read global unlabeled marker data.<p>
	 *
	 * @see isMarkerRayDataEnabled
	 * @see disableMarkerRayData()
	 * @see enableSegmentData()
	 * @see enableMarkerData()
	 * @see enableDeviceData()
	 * @see getUnlabeledMarkerCount
	 * @see getUnlabeledMarkerGlobalTranslation
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
	 * @see isSegmentDataEnabled
	 * @see disableSegmentData
	 * @see enableMarkerData
	 * @see enableUnlabeledMarkerData
	 * @see enableDeviceData
	 * @see getSegmentCount
	 * @see getSegmentName
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationHelical
	 * @see getSegmentGlobalRotationMatrix
	 * @see getSegmentGlobalRotationQuaternion
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
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
	 * @see getSegmentLocalRotationEulerXYZ
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableLightwiechtSegmentData() {
		Output_DisableLightweightSegmentData result = client.DisableLightweightSegmentData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}
	/**
	 * Disable the lightweight output mode for kinematic segment data in the
	 * Vicon DataStream.
	 *
	 * Calling this mode does not automatically enable any other data types.<p>
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
	 * @see getSegmentLocalRotationEulerXYZ
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableSegmentData() {
		Output_DisableLightweightSegmentData result = client.DisableLightweightSegmentData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Disable labeled reconstructed marker data in the Vicon DataStream.
	 *
	 * @see isMarkerDataEnabled
	 * @see enableMarkerData
	 * @see enableSegmentData
	 * @see enableUnlabeledMarkerData
	 * @see enableDeviceData
	 * @see getMarkerCount
	 * @see getMarkerName
	 * @see getMarkerGlobalTranslation
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableMarkerData() {
		Output_DisableLightweightSegmentData result = client.DisableLightweightSegmentData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Disable unlabeled reconstructed marker data in the Vicon DataStream.
	 *
	 * @see isUnlabeledMarkerDataEnabled
	 * @see enableUnlabeledMarkerData
	 * @see enableSegmentData
	 * @see enableMarkerData
	 * @see enableDeviceData
	 * @see getUnlabeledMarkerCount
	 * @see getUnlabeledMarkerGlobalTranslation
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableUnlabeledMarkerData() {
		Output_DisableUnlabeledMarkerData result = client.DisableUnlabeledMarkerData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Disable ray contribution data for markers in the Vicon DataStream.
	 *
	 * @see isMarkerRayDataEnabled
	 * @see enableMarkerRayData
	 * @see enableSegmentData
	 * @see enableMarkerData
	 * @see enableDeviceData
	 * @see getUnlabeledMarkerCount
	 * @see getUnlabeledMarkerGlobalTranslation
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableMarkerRayData() {
		Output_DisableMarkerRayData result = client.DisableMarkerRayData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Disable force plate, EMG, and other device data in the Vicon DataStream.
	 *
	 * @see isDeviceDataEnabled
	 * @see enableDeviceData
	 * @see enableSegmentData
	 * @see enableMarkerData
	 * @see enableUnlabeledMarkerData
	 * @see getDeviceCount
	 * @see getDeviceName
	 * @see getDeviceOutputCount
	 * @see getDeviceOutputName
	 * @see getDeviceOutputValue
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableDeviceData() {
		Output_DisableDeviceData result = client.DisableDeviceData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Disable centroid data in the Vicon DataStream.
	 *
	 * @see isCentroidDataEnabled
	 * @see enableCentroidData
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableCentroidData() {
		Output_DisableCentroidData result = client.DisableCentroidData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Disable greyscale data in the Vicon DataStream.
	 *
	 * @see isGreyscaleDataEnabled
	 * @see enableGreyscaleData
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableGreyscaleData() {
		Output_DisableGreyscaleData result = client.DisableGreyscaleData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Disable video data in the Vicon DataStream.
	 *
	 * @see isVideoDataEnabled
	 * @see enableVideoData
	 * @throws RuntimeException if the client is not connected.
	 */
	public void disableVideoData() {
		Output_DisableVideoData result = client.DisableVideoData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Disable debug data in the Vicon DataStream.
	 *
	 * @see isDebugDataEnabled
	 * @see enableDebugData
	 */
	public void disableDebugData() {
		Output_DisableDebugData result = client.DisableDebugData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("Client is not connected!");
		}
	}

	/**
	 * Enable a lightweight transmission protocol for kinematic segment data in
	 * the Vicon DataStream.
	 *
	 * This will reduce the network bandwidth required to transmit segment data
	 * to approximately a quarter of that required by the previous method, at
	 * the expense of a small amount of precision.<p>
	 *
	 * Use the existing methods such as GetSegmentGlobalTranslation() and
	 * GetSegmentGlobalRotationMatrix() as usual to obtain the segment data.<p>
	 *
	 * Calling this method will automatically disable all other conﬁgurable
	 * output types. These may be re-enabled after the call if required.<p>
	 *
	 * Call this function on startup, after connecting to the server, and before
	 * trying to read local or global segment data.<p>
	 *
	 * @see isSegmentDataEnabled
	 * @see disableSegmentData
	 * @see enableMarkerData
	 * @see enableUnlabeledMarkerData
	 * @see enableDeviceData
	 * @see getSegmentCount
	 * @see getSegmentName
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationEulerXYZ
	 * @throws RuntimeException if the client is not connected.
	 */
	public void enableLightweightSegmentData() {
		Output_EnableLightweightSegmentData result = client.EnableLightweightSegmentData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("The client is not connected!");
		}
	}

	/**
	 * Return whether the lightweight transport mode for kinematic segment data
	 * is enabled in the Vicon DataStream.
	 *
	 * @see enableSegmentData
	 * @see disableSegmentData
	 * @see isMarkerDataEnabled
	 * @see isUnlabeledMarkerDataEnabled
	 * @see isDeviceDataEnabled
	 * @return whether the lightweight transport mode for kinematic segment data
	 * is enabled in the Vicon DataStream.
	 */
	public boolean isLightweightSegmentDataEnabled() {
		return client.IsLightweightSegmentDataEnabled().getEnabled();
	}

	/**
	 * Enable unlabeled reconstructed marker data in the Vicon DataStream.
	 *
	 * You should call this function on startup, after connecting to the server,
	 * and before trying to read global unlabeled marker data.<p>
	 *
	 * @see isUnlabeledMarkerDataEnabled
	 * @see disableUnlabeledMarkerData
	 * @see enableSegmentData
	 * @see enableMarkerData
	 * @see enableDeviceData
	 * @see getUnlabeledMarkerCount
	 * @see getUnlabeledMarkerGlobalTranslation
	 * @throws RuntimeException if client not connected.
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
	 * @see enableSegmentData
	 * @see disableSegmentData
	 * @see isMarkerDataEnabled
	 * @see isUnlabeledMarkerDataEnabled
	 * @see isDeviceDataEnabled
	 * @return true, if segment data stream is enabled.
	 */
	public boolean isSegmentDataEnabled() {
		Output_IsSegmentDataEnabled result = client.IsSegmentDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Return whether debug data is enabled in the DataStream.
	 *
	 * @see enableDebugData
	 * @see disableDebugData
	 * @return true, if streaming debug info is anabled.
	 */
	public boolean isDebugDataEnabled() {
		Output_IsDebugDataEnabled result = client.IsDebugDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Return whether labeled reconstructed marker data is enabled in the
	 * DataStream.
	 *
	 * @see enableMarkerData
	 * @see disableMarkerData
	 * @see isSegmentDataEnabled
	 * @see isUnlabeledMarkerDataEnabled
	 * @see isDeviceDataEnabled
	 * @return true, if labeled reconstructed marker data is enabled in the
	 * DataStream
	 */
	public boolean isMarkerDataEnabled() {
		Output_IsMarkerDataEnabled result = client.IsMarkerDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Return whether marker ray data is enabled in the DataStream.
	 *
	 * @see enableMarkerRayData
	 * @see disableMarkerRayData
	 * @see isSegmentDataEnabled
	 * @see isMarkerDataEnabled
	 * @see isDeviceDataEnabled
	 * @return whether marker ray data is enabled in the DataStream.
	 */
	public boolean isMarkerRayDataEnabled() {
		Output_IsMarkerRayDataEnabled result = client.IsMarkerRayDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Return whether force plate, EMG, and other device data is enabled in the
	 * DataStream.
	 *
	 * @see enableDeviceData
	 * @see disableDeviceData
	 * @see isSegmentDataEnabled
	 * @see isMarkerDataEnabled
	 * @see isUnlabeledMarkerDataEnabled
	 * @return whether force plate, EMG, and other device data is enabled in the
	 * DataStream.
	 */
	public boolean isDeviceDataEnabled() {
		Output_IsDeviceDataEnabled result = client.IsDeviceDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Return whether Centroid data is enabled in the DataStream.
	 *
	 * @return whether Centroid data is enabled in the DataStream.
	 */
	public boolean isCentroidDataEnabled() {
		Output_IsCentroidDataEnabled result = client.IsCentroidDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Return whether greyscale data is enabled in the DataStream.
	 *
	 * @see enableGreyscaleData
	 * @see disableGreyscaleData
	 * @return whether greyscale data is enabled in the DataStream.
	 */
	public boolean isGreyscaleDataEnabled() {
		Output_IsGreyscaleDataEnabled result = client.IsGreyscaleDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Return whether video data is enabled in the DataStream.
	 *
	 * @see enableVideoData
	 * @see disableVideoData
	 * @return whether video data is enabled in the DataStream.
	 */
	public boolean isVideoDataEnabled() {
		Output_IsVideoDataEnabled result = client.IsVideoDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Return whether unlabeled marker data is enabled in the DataStream.
	 *
	 * @see enableUnlabeledMarkerData
	 * @see disableUnlabeledMarkerData
	 * @see isSegmentDataEnabled
	 * @see isMarkerDataEnabled
	 * @see isDeviceDataEnabled
	 * @return true if unlabeled marker data is enabled in the DataStream.
	 */
	public boolean isUnlabeledMarkerDataEnabled() {
		Output_IsUnlabeledMarkerDataEnabled result = client.IsUnlabeledMarkerDataEnabled();
		return result.getEnabled();
	}

	/**
	 * Set the number of frames that the client should buffer.
	 *
	 * <p>
	 * The default value is 1, which always supplies the latest frame. Choose
	 * higher values to reduce the risk of missing frames between calls.</p>
	 *
	 * @see getFrame
	 * @param bufferSize buffer size
	 */
	public void setBufferSize(long bufferSize) {
		client.SetBufferSize(bufferSize);
	}

	/**
	 * There are three modes that the SDK can operate in.Each mode has a
	 * different impact on the Client, Server, and network resources used.
	 *
	 * • ServerPush In "ServerPush" mode, the Server pushes every new frame of
	 * data over the network to the Client. The Server will try not to drop any
	 * frames. This results in the lowest latency that can be achieved. If the
	 * Client is unable to read data at the rate it is being sent, then it is
	 * buffered, ﬁrstly in the Client, then on the TCP/IP connection, and then
	 * at the Server. When all the buffers are full then frames may be dropped
	 * at the Server and the performance of the Server may be affected. The
	 * GetFrame() method returns the most recently received frame if available,
	 * or blocks the calling thread if the most recently received frame has
	 * already been processed.<p>
	 *
	 * • ClientPull In "ClientPull" mode, the Client waits for a call to
	 * GetFrame(), and then requests the latest frame of data from the Server.
	 * This increases latency, because a request must be sent over the network
	 * to the Server, the Server has to prepare the frame of data for the
	 * Client, and then the data must be sent back over the network. Network
	 * bandwidth is kept to a minimum, because the Server only sends what you
	 * need. The buffers are very unlikely to be ﬁlled, and Server performance
	 * is unlikely to be affected. The GetFrame() method blocks the calling
	 * thread until the frame has been received.<p>
	 *
	 * • ClientPullPreFetch "ClientPullPreFetch" is an enhancement to the
	 * "ClientPull" mode. A thread in the SDK continuously and preemptively does
	 * a "ClientPull" on your behalf, storing the latest requested frame in
	 * memory. When you next call GetFrame(), the SDK returns the last requested
	 * frame that was cached in memory. GetFrame() does not need to block the
	 * calling thread. As with normal "ClientPull", buffers are unlikely to ﬁll
	 * up, and Server performance is unlikely to be affected. Latency is
	 * slightly reduced, but network trafﬁc may increase if you request frames
	 * on behalf of the Client which are never used. The stream defaults to
	 * "ClientPull" mode as this is considered the safest option. If performance
	 * is a problem, try "ClientPullPreFetch" followed by "ServerPush"
	 * .<p>
	 *
	 * @see getFrame
	 * @see getLatencyTotal
	 * @param mode streaming mode
	 * @throws RuntimeException if the client is not connected.
	 */
	public void setStreamMode(StreamMode_Enum mode) {
		Output_SetStreamMode result = client.SetStreamMode(mode);
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("GetFrameRateCount() but client was not connected!");
		}
	}

	/**
	 * Enable haptic feedback for the selected Apex device.
	 *
	 * <p>
	 * Apex device names may be obtained using GetDeviceCount,
	 * GetDeviceName.</p>
	 *
	 * @param deviceName device name
	 * @param on on
	 * @throws RuntimeException not yet implemented
	 */
	public void setApexDeviceFeedback(String deviceName, boolean on) {
		// TODO
		throw new RuntimeException("not yet implemented!");
	}

	/**
	 * Remaps the 3D axis.
	 *
	 * <p>
	 * Vicon Data uses a right-handed coordinate system, with +X forward, +Y
	 * left, and +Z up. Other systems use different coordinate systems. The SDK
	 * can transform its data into any valid right-handed coordinate system by
	 * re-mapping each axis. Valid directions are "Up", "Down", "Left", "Right",
	 * "Forward", and "-Backward".</p>
	 *
	 * <p>
	 * Note that "Forward" means moving away from you, and "Backward" is moving
	 * towards you. Common usages are Z-up: SetAxisMapping(Forward, Left, Up)
	 * Y-up: SetAxisMapping(Forward, Up, Right)</p>
	 *
	 * @param x x direction
	 * @param y y direction
	 * @param z z direction
	 * @see getAxisMapping
	 *
	 * TODO vielleicht ein besseres Argument einführen, also z.B. xyz, yxz, ...
	 * so wie in CalcML
	 */
	public void setAxisMapping(Direction x, Direction y, Direction z) {
		Direction_Enum x_enum = Direction_Enum.swigToEnum(x.swigValue());
		Direction_Enum y_enum = Direction_Enum.swigToEnum(y.swigValue());
		Direction_Enum z_enum = Direction_Enum.swigToEnum(z.swigValue());
		Output_SetAxisMapping result = client.SetAxisMapping(x_enum, y_enum, z_enum);
	}

	/**
	 * Get the current Axis mapping.
	 *
	 * @see setAxisMapping
	 * @return the current Axis mapping.
	 */
	public Direction[] getAxisMapping() {
		Output_GetAxisMapping result = client.GetAxisMapping();
		return new Direction[]{Direction.swigToEnum(result.getXAxis().swigValue()),
			Direction.swigToEnum(result.getYAxis().swigValue()),
			Direction.swigToEnum(result.getZAxis().swigValue())};
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
	 * @see getFrameRateCount
	 * @see getFrameRateValue
	 * @param frameRateIndex index of a frame rate type
	 * @return name of the frame rate type with the given index
	 * @throws RuntimeException if the index is invalid or the client is not
	 * connected
	 */
	public String getFrameRateName(long frameRateIndex) {
		Output_GetFrameRateName result = client.GetFrameRateName(frameRateIndex);
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getFrameRateName() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new RuntimeException("getFrameRateName() but index is invalid!");
		}
		return result.getName().toStdString();
	}

	/**
	 * Get the current value of the specified frame rate type.
	 *
	 * @see getFrameRateCount
	 * @see getFrameRateName
	 * @param frameRateName name of the frame rate
	 * @return frame rate value
	 * @throws RuntimeException if client is not connected
	 * @throws IllegalArgumentException if frameRateName does not exist
	 */
	public double getFrameRateValue(String frameRateName) {
		Output_GetFrameRateValue result = client.GetFrameRateValue(convertFrameRateName(frameRateName));
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getFrameRateName() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getFrameRateName() but invalid index!!");
		}
		return result.getValue();
	}

	/**
	 * Return the number of unlabeled markers in the DataStream
	 *
	 * <p>
	 * This information can be used in conjunction with
	 * GetGlobalUnlabeledMarkerTranslation</p>
	 *
	 * @see getUnlabeledMarkerGlobalTranslation
	 * @return the number of unlabeled markers in the DataStream.
	 * @throws RuntimeException if no frame is available or the client is not
	 * connected
	 */
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

	/**
	 * Return the Vicon camera system frame rate (in Hz) at the time of the last
	 * frame retrieved from the DataStream.
	 *
	 * @see getFrame
	 * @see getFrameNumber
	 * @see getTimeCode
	 * @return the Vicon camera system frame rate (in Hz) at the time of the
	 * last frame retrieved from the DataStream.
	 * @throws RuntimeException if no frame is available or client is not
	 * connected.
	 */
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

	/**
	 * Return the number of latency measurements that were taken at various
	 * stages of the real-time pipeline.
	 *
	 * <p>
	 * This value can be passed into GetLatencySampleName().</p>
	 *
	 * @see getFrame
	 * @see getTimeCode
	 * @see getLatencyTotal
	 * @see getLatencySampleName
	 * @see getLatencySampleValue
	 * @return the number of latency measurements that were taken at various.
	 */
	public long getLatencySampleCount() {
		Output_GetLatencySampleCount result = client.GetLatencySampleCount();
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getFrameRate() invoked but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getFrameRate() but client is not connected!!");
		}
		return result.getCount();
	}

	/**
	 * Return the name of a latency sample.
	 *
	 * This value can be passed into GetLatencySampleValue().
	 *
	 * @see getFrame
	 * @see getTimeCode
	 * @see getLatencyTotal
	 * @see getLatencySampleCount
	 * @see getLatencySampleValue
	 * @param index latency name index
	 * @return the name of a latency sample.
	 */
	public String getLatencySampleName(long index) {
		Output_GetLatencySampleName result = client.GetLatencySampleName(index);
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getFrameRate() but client is not connected!!");
		}
		return result.getName().toStdString();
	}

	/**
	 * Return the duration of a named latency sample in seconds.
	 *
	 * This value can be passed into GetLatencySampleValue().
	 *
	 * @see getFrame
	 * @see getTimeCode
	 * @see getLatencyTotal
	 * @see getLatencySampleCount
	 * @see getLatencySampleValue
	 * @param latencySampleName latency sample name
	 * @return the duration of a named latency sample in seconds.
	 */
	public double getLatencySampleValue(String latencySampleName) {
		ViconString latencySampleNameAsViconString = convertLatencySampleName(latencySampleName);
		if (latencySampleNameAsViconString == null) {
			throw new IllegalArgumentException("getLatencySampleValue(): Unknown latency sample name \"" + latencySampleName + "\"!");
		}
		Output_GetLatencySampleValue result = client.GetLatencySampleValue(latencySampleNameAsViconString);
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getLatencySampleValue() invoked but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getLatencySampleValue() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new RuntimeException("getLatencySampleValue() but index is invalid!");
		}
		return result.getValue();
	}

	/**
	 * Return the total latency in seconds introduced at various stages of the
	 * real-time pipeline.
	 *
	 * <p>
	 * If no latency information is available then all latencies will be
	 * reported as 0.0.</p>
	 *
	 * @see getFrame
	 * @see getTimeCode
	 * @see getLatencySampleCount
	 * @see getLatencySampleName
	 * @see getLatencySampleValue
	 * @return the total latency in seconds introduced at various stages of the
	 * real-time pipeline.
	 */
	public double getLatencyTotal() {
		Output_GetLatencyTotal result = client.GetLatencyTotal();
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getLatencyTotal() invoked but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getLatencyTotal() but client is not connected!!");
		}
		return result.getTotal();
	}

	/**
	 * Return the translation of an unlabeled marker in global coordinates.
	 *
	 * The Translation is of the form (x, y, z) where x, y and z are in
	 * millimeters with respect to the global origin.<p>
	 *
	 * @see getUnlabeledMarkerCount
	 * @param markerIndex marker index
	 * @return the translation of an unlabeled marker in global coordinates.
	 * @throws RuntimeException if no frame is available or client is not
	 * connected.
	 */
	public double[] getUnlabeledMarkerGlobalTranslation(long markerIndex) {
		Output_GetUnlabeledMarkerGlobalTranslation result = client.GetUnlabeledMarkerGlobalTranslation(markerIndex);
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getFrameRate() invoked but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getFrameRate() but client is not connected!!");
		}
		//System.out.println("Get unlabeled marker global translation: "+result.getResult().toString());
		return result.getTranslation();
	}

	/**
	 * Return the number of subjects in the DataStream.
	 *
	 * <p>
	 * This information can be used in conjunction with GetSubjectName.</p>
	 * <p>
	 * precondition: invoke GetFrame(); if this is not invoked before you can
	 * get the error "NO FRAME AVAILABLE".</p>
	 *
	 * @see getSubjectName
	 * @return subject count bigger or equal 0
	 * @throws RuntimeException if no frame available or not connected.
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
		if (result.getResult() == Result_Enum.Success) {
			return result.getSubjectCount();
		} else {
			//FIXME kann das überhaupt auftreten
			System.out.println("getSubjectCount() failed: " + result.getResult().toString());
			return -1;
		}
	}

	/**
	 * Return the name of a subject.
	 *
	 * <p>
	 * This can be passed into segment and marker functions.</p>
	 *
	 * @see getSubjectCount
	 * @param subjectIndex between 0 and getSubjectCount()-1
	 * @return The name of the subject.
	 * @throws RuntimeException if subject index is invalid, no frame available
	 * or not connected.
	 * @throws IllegalArgumentException if subjectIndex less than 0
	 *
	 * TODO code aufräumen, System.out entfernen
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
	 * Return the name of the root segment for a specified subject.
	 *
	 * This can be passed into segment functions. The root segment is the
	 * ancestor of all other segments in the subject.
	 *
	 * @see getSegmentCount
	 * @see getSegmentParentName
	 * @see getSegmentChildCount
	 * @see getSegmentChildName
	 * @param subjectName subject name
	 * @return the name of the root segment for a specified subject.
	 * @throws RuntimeException if no frame is available, client is not
	 * connected
	 * @throws IllegalArgumentException subject name is invalid.
	 *
	 */
	public String getSubjectRootSegmentName(String subjectName) {
		Output_GetSubjectRootSegmentName result = client.GetSubjectRootSegmentName(convertSubjectName(subjectName));
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("GetSubjectRootSegmentName() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("GetSubjectRootSegmentName() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("GetSubjectRootSegmentName() but no frame available!");
		}
		// vielleicht tritt das auf, wenn das angegebene subject gar kein root segment besitzt
		// ist das überhaupt möglich?
		//FIXME
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new RuntimeException("GetSubjectRootSegmentName() but segmentIndex \"\" is invalid!");
		}
		return result.getSegmentName().toStdString();
	}

	/**
	 * Convert subject name in a native lib usable object.
	 *
	 * @param subjectName name of the subject to convert into the corresponding
	 * Vicon String type.
	 * @return native lib representation of the given String.
	 * @throws IllegalArgumentException if the subject name is not known.
	 */
	private ViconString convertSubjectName(String subjectName) {
		ViconString subjectNameAsViconString = subjectNames.get(subjectName);
		if (subjectNameAsViconString != null) {
			return subjectNameAsViconString;
		} else {
			throw new IllegalArgumentException("Subject with name \"" + subjectName + "\" does not exist");
		}
	}

	/**
	 * Convert segment name in a native lib usable object.
	 *
	 * @param segmentName name of the segment to convert into the corresponding
	 * Vicon String type.
	 * @return native lib object representation of the given segment name.
	 * @throws IllegalArgumentException if the segment is not known.
	 */
	private ViconString convertSegmentName(String segmentName) {
		ViconString segmentNameAsViconString = segmentNames.get(segmentName);
		if (segmentNameAsViconString != null) {
			return segmentNameAsViconString;
		} else {
			throw new IllegalArgumentException("Segment with name \"" + segmentName + "\" does not exist");
		}
	}

	/**
	 * Convert marker name in a native lib usable object.
	 *
	 * @param markerName name of the marker to convert into the corresponding
	 * Vicon String type.
	 * @return native lib object representation of the given marker name.
	 * @throws IllegalArgumentException if the marker is not known.
	 */
	private ViconString convertMarkerName(String markerName) {
		ViconString markerNameAsViconString = markerNames.get(markerName);
		if (markerNameAsViconString != null) {
			return markerNameAsViconString;
		} else {
			throw new IllegalArgumentException("Marker with name \"" + markerName + "\" does not exist");
		}
	}

	/**
	 * Convert frame rate name in a native lib usable object.
	 *
	 * @param frameRateName name of the segment to convert into the
	 * corresponding Vicon String type.
	 * @return native lib object representation of the given segment name.
	 * @throws IllegalArgumentException if the segment is not known.
	 */
	private ViconString convertFrameRateName(String frameRateName) {
		ViconString frameRateNameAsViconString = frameRateNames.get(frameRateName);
		if (frameRateNameAsViconString != null) {
			return frameRateNameAsViconString;
		} else {
			throw new IllegalArgumentException("FrameRate with name \"" + frameRateName + "\" does not exist");
		}
	}

	/**
	 * Convert frame rate name in a native lib usable object.
	 *
	 * @param frameRateName name of the segment to convert into the
	 * corresponding Vicon String type.
	 * @return native lib object representation of the given segment name.
	 * @throws IllegalArgumentException if the device is not known.
	 */
	private ViconString convertDeviceName(String deviceName) {
		ViconString deviceNameAsViconString = deviceNames.get(deviceName);
		if (deviceNameAsViconString != null) {
			return deviceNameAsViconString;
		} else {
			throw new IllegalArgumentException("Device with name \"" + deviceName + "\" does not exist");
		}
	}

	/**
	 * Get device output name for a given device as an native lib object.
	 *
	 * @param deviceName
	 * @param deviceOutputName
	 * @return device output name
	 * @throws IllegalArgumentException if the given divice or the given
	 * deviceOutputName does not exist
	 */
	private ViconString convertDeviceOutputName(String deviceName, String deviceOutputName) {
		Map<String, ViconString> deviceOutputNamesMap = deviceOutputNames.get(deviceName);
		if (deviceOutputNamesMap == null) {
			throw new IllegalArgumentException("convertDeviceOutputName(): The device \"" + deviceName + "\" does not exist!");
		}
		ViconString result = deviceOutputNamesMap.get(deviceOutputName);
		if (result == null) {
			throw new IllegalArgumentException("convertDeviceOutputName(): The device output name \"" + deviceOutputName + "\" does not exist!");
		}
		return result;
	}

	/**
	 * Get latency sample name as an native lib object.
	 *
	 * @param latencySampleName
	 * @return latency sample name as an native lib object.
	 * @throws IllegalArgumentException if the given latency sample name does
	 * not exist
	 */
	private ViconString convertLatencySampleName(String latencySampleName) {
		ViconString latencySampleNameAsViconString = latencySampleNames.get(latencySampleName);
		if (latencySampleNameAsViconString != null) {
			return latencySampleNameAsViconString;
		} else {
			throw new IllegalArgumentException("Latency sample name \"" + latencySampleName + "\" does not exist");
		}
	}

	/**
	 * Return the number of segments for a specified subject in the DataStream.
	 *
	 * <p>
	 * This information can be used in conjunction with GetSegmentName</p>
	 *
	 * @see getSubjectName
	 * @see getSegmentName
	 * @param subjectName name of the subject
	 * @return segment count
	 * @throws RuntimeException if subjectName is invalid, client is not
	 * connected or no frame available.
	 */
	public long getSegmentCount(String subjectName) {
		Output_GetSegmentCount result = client.GetSegmentCount(convertSubjectName(subjectName));
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
	 * @see getSegmentCount
	 * @see getSegmentChildCount
	 * @see getSegmentChildName
	 * @see getSubjectRootSegmentName
	 * @param subjectName The name of the subject.
	 * @param segmentIndex The index of the segment.
	 * @return The name of the segment
	 * @throws RuntimeException if the client is not connected or if no frame is
	 * available
	 * @throws IllegalArgumentException if is not valid or the segment index is
	 * invalid
	 */
	public String getSegmentName(String subjectName, long segmentIndex) {
		Output_GetSegmentName result = client.GetSegmentName(convertSubjectName(subjectName), segmentIndex);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentName() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentName() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentName() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getSegmentName() but segmentIndex \"" + segmentIndex + "\" is invalid!");
		}
		return result.getSegmentName().toStdString();
	}

	/**
	 * Return the number of child segments for a specified subject segment.
	 *
	 * This can be passed into segment functions.
	 *
	 * @see getSegmentCount
	 * @param subjectName name of the subject
	 * @param segmentName name o the segment
	 * @return the number of child segments for a specified subject segment.
	 * @throws RuntimeException if the client is not connected, the subjectName
	 * is not valid, the segment index is invalid or if no frame is available
	 */
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
	 * @see getSegmentCount
	 * @see getSegmentChildCount
	 * @see getSegmentChildName
	 * @see getSubjectRootSegmentName
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @param segmentIndex segment index
	 * @return segment child name
	 * @throws IllegalArgumentException if the subject, segment name is invalid
	 * or the segment index is invalid
	 * @throws RuntimeException if the client is not connected or no frame is
	 * available.
	 */
	public String getSegmentChildName(String subjectName, String segmentName, long segmentIndex) {
		Output_GetSegmentChildName result = client.GetSegmentChildName(
			convertSubjectName(subjectName), convertSegmentName(segmentName), segmentIndex);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentChildName() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentChildName() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentChildName() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getSegmentChildName() but segmentIndex \"" + segmentIndex + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentChildCount() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getSegmentName().toStdString();
	}

	/**
	 * Return the name of the parent segment for a speciﬁed subject segment.
	 *
	 * @see getSegmentCount
	 * @see getSegmentChildCount
	 * @see getSegmentChildName
	 * @see getSubjectRootSegmentName
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return null, if the given segment is the root segment of the subject
	 * @throws IllegalArgumentException if the subject name is invalid or the
	 * segment name is invalid.
	 * @throws RuntimeException if the client is not connected or no frame is
	 * available
	 */
	public String getSegmentParentName(String subjectName, String segmentName) {
		Output_GetSegmentParentName result = client.GetSegmentParentName(convertSubjectName(subjectName), convertSegmentName(segmentName));
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentParentName() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentParentName() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentParentName() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentParentName() but segmentName \"" + segmentName + "\" is invalid!");
		}
		//TODO aufärumen
		String resultString = result.getSegmentName().toStdString();
		if (resultString.isEmpty()) {
			resultString = null;
		}
		return resultString;
	}

	/**
	 * Return the static pose translation of a subject segment.
	 *
	 * The static translation of the segment corresponds to the PRE-POSITION
	 * element of the segment in the subject vsk. It is the base position of the
	 * segment, and is included in the value returned by GetLocalTranslation.<p>
	 *
	 * If you are required to calculate the amount a segment has moved from its
	 * base position, subtract this value from the local translation.<p>
	 *
	 * @see getSegmentStaticRotationHelical
	 * @see getSegmentStaticRotationMatrix
	 * @see getSegmentStaticRotationQuaternion
	 * @see getSegmentStaticRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the static pose translation of a subject segment.
	 * @throws IllegalArgumentException if subject- or segment name is invalid
	 * @throws RuntimeException if client is not connected or no frame is
	 * available.
	 */
	public double[] getSegmentStaticTranslation(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentStaticTranslation result = client.GetSegmentStaticTranslation(subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentStaticTranslation() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentStaticTranslation() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentStaticTranslation() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentStaticTranslation() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getTranslation();
	}

	/**
	 * Return the static pose rotation of a subject segment in helical
	 * coordinates.
	 *
	 * The helical coordinates represent a vector whose length is the amount of
	 * rotation in radians, and the direction is the axis about which to
	 * rotate.<p>
	 *
	 * The static rotation of the segment corresponds to the PRE-ORIENTATION
	 * element of the segment in the subject vsk. It is the base rotation of the
	 * segment, and is included in the value returned by GetLocalRotation∗
	 * .<p>
	 *
	 * If you are required to calculate the amount a segment has rotated from
	 * its base position, subtract this value from the local rotation.<p>
	 *
	 * @see getSegmentStaticTranslation
	 * @see getSegmentStaticRotationMatrix
	 * @see getSegmentStaticRotationQuaternion
	 * @see getSegmentStaticRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName name of the subject
	 * @param segmentName name of the segment
	 * @return the static pose rotation of a subject segment in helical
	 * coordinates.
	 * @throws RuntimeException if the client is not connected, no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentStaticRotationHelical(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentStaticRotationHelical result = client.GetSegmentStaticRotationHelical(
			subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentStaticRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentStaticRotationHelical() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentStaticRotationHelical() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentStaticRotationHelical() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getRotation();
	}

	/**
	 * Return the static pose rotation of a subject segment as a 3x3 row-major
	 * matrix.
	 *
	 * The static rotation of the segment corresponds to the PRE-ORIENTATION
	 * element of the segment in the subject vsk. It is the base rotation of the
	 * segment, and is included in the value returned by GetLocalRotation.<p>
	 *
	 * If you are required to calculate the amount a segment has rotated from
	 * its base position, subtract this value from the local rotation.<p>
	 *
	 * @see getSegmentStaticTranslation
	 * @see getSegmentStaticRotationHelical
	 * @see getSegmentStaticRotationQuaternion
	 * @see getSegmentStaticRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName name of the subject
	 * @param segmentName name of the segment
	 * @return the static pose rotation of a subject segment as a 3x3 row-major
	 * matrix.
	 * @throws IllegalArgumentException for invalid subject- or segment name,
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 */
	public double[] getSegmentStaticRotationMatrix(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentStaticRotationMatrix result = client.GetSegmentStaticRotationMatrix(subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentStaticRotationMatrix() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentStaticRotationMatrix() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentStaticRotationMatrix() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentStaticRotationMatrix() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getRotation();
	}

	/**
	 * Return the static pose rotation of a subject segment in quaternion
	 * coordinates.
	 *
	 * The quaternion is of the form (x, y, z, w) where w is the real component
	 * and x, y and z are the imaginary components. N.B. This is different from
	 * that used in many other applications, which use (w, x, y, z). The static
	 * rotation of the segment corresponds to the PRE-ORIENTATION element of the
	 * segment in the subject vsk. It is the base rotation of the segment, and
	 * is included in the value returned by GetLocalRotation∗. If you are
	 * required to calculate the amount a segment has rotated from its base
	 * position, subtract this value from the local rotation.<p>
	 *
	 * @see getSegmentStaticTranslation
	 * @see getSegmentStaticRotationHelical
	 * @see getSegmentStaticRotationMatrix
	 * @see getSegmentStaticRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the static pose rotation of a subject segment in quaternion
	 * coordinates.
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 */
	public double[] getSegmentStaticRotationQuaternion(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentStaticRotationQuaternion result = client.GetSegmentStaticRotationQuaternion(subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentStaticRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentStaticRotationQuaternion() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentStaticRotationQuaternion() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentStaticRotationQuaternion() but segmentName \"" + segmentName + "\" is invalid!");
		}
		double[] Rotation = result.getRotation();
		//System.out.println("Get segment name: "+SegmentName);
		return Rotation;
	}

	/**
	 * Return a 3D Scale of a subject segment if present.
	 *
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return a 3D Scale of a subject segment if present.
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws UnsupportedOperationException if segment static scale is not
	 * supported or not present
	 */
	public double[] getSegmentStaticScale(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentStaticScale result = client.GetSegmentStaticScale(subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentStaticScale() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentStaticScale() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentStaticScale() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentStaticScale() but segmentName \"" + segmentName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotSupported) {
			throw new UnsupportedOperationException("getSegmentStaticScale() not supported!");
		}
		if (result.getResult() == Result_Enum.NotPresent) {
			throw new UnsupportedOperationException("getSegmentStaticScale() not present!");
		}
		return result.getScale();
	}

	/**
	 * Return the static pose rotation of a subject segment in Euler XYZ
	 * coordinates.
	 *
	 * @see getSegmentStaticTranslation
	 * @see getSegmentStaticRotationHelical
	 * @see getSegmentStaticRotationMatrix
	 * @see getSegmentStaticRotationQuaternion
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the static pose rotation of a subject segment in Euler XYZ
	 * coordinates.
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 */
	public double[] getSegmentStaticRotationEulerXYZ(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentStaticRotationEulerXYZ result = client.GetSegmentStaticRotationEulerXYZ(
			subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentStaticRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentStaticRotationEulerXYZ() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentStaticRotationEulerXYZ() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentStaticRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
		}

		double[] Rotation = result.getRotation();
		//System.out.println("Get segment name: "+SegmentName);
		return Rotation;
	}

	/**
	 * Return the translation of a subject segment in global coordinates.
	 *
	 * The translation is of the form (x, y, z) where x, y and z are in
	 * millimeters with respect to the global origin.<p>
	 *
	 * Occluded will be True if the segment was absent at this frame. In this
	 * case the translation will be [0,0,0]
	 * .<p>
	 *
	 * @see getSegmentGlobalRotationHelical
	 * @see getSegmentGlobalRotationMatrix
	 * @see getSegmentGlobalRotationQuaternion
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the translation of a subject segment in global coordinates.
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 */
	public double[] getSegmentGlobalTranslation(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentGlobalTranslation result = client.GetSegmentGlobalTranslation(subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentGlobalTranslation() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentGlobalTranslation() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentGlobalTranslation() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentGlobalTranslation() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getTranslation();
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
	 * @see getSegmentStaticRotationHelical
	 * @see getSegmentStaticRotationMatrix
	 * @see getSegmentStaticRotationQuaternion
	 * @see getSegmentStaticRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the translation of a subject segment in global coordinates.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentLocalRotationHelical(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentLocalRotationHelical result = client.GetSegmentLocalRotationHelical(
			subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentLocalRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentLocalRotationHelical() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentLocalRotationHelical() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentLocalRotationHelical() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getRotation();
	}

	/**
	 * Return the rotation of a subject segment in global helical coordinates.
	 *
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationMatrix
	 * @see getSegmentGlobalRotationQuaternion
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the rotation of a subject segment in global helical coordinates.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentGlobalRotationHelical(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentGlobalRotationHelical result = client.GetSegmentGlobalRotationHelical(
			subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentGlobalRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentGlobalRotationHelical() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentGlobalRotationHelical() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentGlobalRotationHelical() but segmentName \"" + segmentName + "\" is invalid!");
		}
		double[] Rotation = result.getRotation();
		//System.out.println("Get segment name: "+SegmentName);
		return Rotation;
	}

	/**
	 * Return the rotation of a subject segment as a 3x3 row-major matrix in
	 * global coordinates.
	 *
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationHelical
	 * @see getSegmentGlobalRotationQuaternion
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the rotation of a subject segment as a 3x3 row-major matrix in
	 * global coordinates.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentGlobalRotationMatrix(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentGlobalRotationMatrix result = client.GetSegmentGlobalRotationMatrix(subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentGlobalRotationMatrix() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentGlobalRotationMatrix() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentGlobalRotationMatrix() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentGlobalRotationMatrix() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getRotation();
	}

	/**
	 * Return the rotation of a subject segment in global quaternion
	 * coordinates.
	 *
	 * The quaternion is of the form (x, y, z, w) where w is the real component
	 * and x, y and z are the imaginary components. N.B. This is different from
	 * that used in many other applications, which use (w, x, y, z)
	 * .<p>
	 *
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationHelical
	 * @see getSegmentGlobalRotationMatrix
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the rotation of a subject segment in global quaternion
	 * coordinates.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentGlobalRotationQuaternion(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentGlobalRotationQuaternion result = client.GetSegmentGlobalRotationQuaternion(subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentGlobalRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentGlobalRotationQuaternion() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentGlobalRotationQuaternion() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentGlobalRotationQuaternion() but segmentName\"" + segmentName + "\" is invalid!");
		}
		return result.getRotation();
	}

	/**
	 * Return the rotation of a subject segment in global Euler XYZ coordinates.
	 *
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationHelical
	 * @see getSegmentGlobalRotationMatrix
	 * @see getSegmentGlobalRotationQuaternion
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the rotation of a subject segment in global Euler XYZ
	 * coordinates.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentGlobalRotationEulerXYZ(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentGlobalRotationEulerXYZ result = client.GetSegmentGlobalRotationEulerXYZ(
			subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentGlobalRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentGlobalRotationEulerXYZ() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentGlobalRotationEulerXYZ() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentGlobalRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
		}
		double[] Rotation = result.getRotation();
		//System.out.println("Get segment name: "+SegmentName);
		return Rotation;
	}

	/**
	 * Return the translation of a subject segment in local coordinates relative
	 * to its parent segment.
	 *
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentLocalRotationEulerXYZ
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationHelical
	 * @see getSegmentGlobalRotationMatrix
	 * @see getSegmentGlobalRotationQuaternion
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the translation of a subject segment in local coordinates
	 * relative to its parent segment.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentLocalTranslation(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentLocalTranslation result = client.GetSegmentLocalTranslation(
			subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentLocalTranslation () but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentLocalTranslation () but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentLocalTranslation () but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentLocalTranslation () but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getTranslation();
	}

	/**
	 * Return the rotation of a subject segment in local quaternion coordinates
	 * relative to its parent segment.
	 *
	 * The quaternion is of the form (x, y, z, w) where w is the real component
	 * and x, y and z are the imaginary components. N.B. This is different from
	 * that used in many other applications, which use (w, x, y, z)
	 * .<p>
	 *
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationEulerXYZ
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationHelical
	 * @see getSegmentGlobalRotationMatrix
	 * @see getSegmentGlobalRotationQuaternion
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the rotation of a subject segment in local quaternion coordinates
	 * relative to its parent segment.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentLocalRotationQuaternion(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentLocalRotationQuaternion result = client.GetSegmentLocalRotationQuaternion(
			subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentLocalRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentLocalRotationQuaternion() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentLocalRotationQuaternion() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentLocalRotationQuaternion() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getRotation();
	}

	/**
	 * Return the rotation of a subject segment in local Euler XYZ coordinates
	 * relative to its parent segment.
	 *
	 * @see getSegmentLocalTranslation
	 * @see getSegmentLocalRotationHelical
	 * @see getSegmentLocalRotationMatrix
	 * @see getSegmentLocalRotationQuaternion
	 * @see getSegmentGlobalTranslation
	 * @see getSegmentGlobalRotationHelical
	 * @see getSegmentGlobalRotationMatrix
	 * @see getSegmentGlobalRotationQuaternion
	 * @see getSegmentGlobalRotationEulerXYZ
	 * @param subjectName subject name
	 * @param segmentName segment name
	 * @return the rotation of a subject segment in local Euler XYZ coordinates
	 * relative to its parent segment.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException for invalid subject- or segment name
	 */
	public double[] getSegmentLocalRotationEulerXYZ(String subjectName, String segmentName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString segmentNameAsViconString = convertSegmentName(segmentName);
		Output_GetSegmentLocalRotationEulerXYZ result = client.GetSegmentLocalRotationEulerXYZ(
			subjectNameAsViconString, segmentNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getSegmentLocalRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getSegmentLocalRotationEulerXYZ() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getSegmentLocalRotationEulerXYZ() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getSegmentLocalRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
		}
		return result.getRotation();
	}

	/**
	 * Return the quality score for a speciﬁed Object (Subject).
	 *
	 * <p>
	 * This is only implemented by applications that use an object tracking
	 * graph such as Evoke and Tracker.</p>
	 *
	 * @see getSubjectCount
	 * @see getSubjectName
	 * @param subjectName subject name
	 * @return the quality score for a speciﬁed Object (Subject).
	 * @throws RuntimeException if client is not connectd or no frame is
	 * available
	 * @throws IllegalArgumentException if subject name in invalid
	 */
	public double getObjectQuality(String subjectName) {
		Output_GetObjectQuality result = client.GetObjectQuality(convertSubjectName(subjectName));
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getObjectQuality() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getObjectQuality() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getObjectQuality() but no frame available!");
		}
		return result.getQuality();
	}

	/**
	 * Return the translation of a subject marker in global coordinates.
	 *
	 * The Translation is of the form ( x, y, z ) where x, y and z are in
	 * millimeters with respect to the global origin.<p>
	 *
	 * @see getMarkerName
	 * @param subjectName subject name
	 * @param markerName marker name
	 * @return translation with respect to the global origin
	 * @throws IllegalArgumentException if subject name or marker name is
	 * invalid
	 * @throws RuntimeException if no frame is available or the client is not
	 * connected.
	 */
	public double[] getMarkerGlobalTranslation(String subjectName, String markerName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString markerNameAsViconString = convertMarkerName(markerName);
		Output_GetMarkerGlobalTranslation result = client.GetMarkerGlobalTranslation(
			subjectNameAsViconString, markerNameAsViconString);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getMarkerGlobalTranslation () but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getMarkerGlobalTranslation() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getMarkerGlobalTranslation () but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidMarkerName) {
			throw new IllegalArgumentException("getMarkerGlobalTranslation () but markerName \"" + markerName + "\" is invalid!");
		}
		double[] Translation = result.getTranslation();
		//System.out.println("Get segment name: "+SegmentName);
		return Translation;
	}

	/**
	 * Return the number of rays that are contributing to a labeled marker in
	 * the DataStream.
	 *
	 * This information can be used in conjunction with
	 * GetMarkerRayContribution.
	 *
	 * @see getMarkerRayContribution
	 * @see enableMarkerRayData
	 * @see disableMarkerRayData
	 * @see isMarkerRayDataEnabled
	 * @param subjectName subject name
	 * @param markerName marker name
	 * @return the number of rays that are contributing to a labeled marker in
	 * the DataStream.
	 * @throws IllegalArgumentException if subject name or marker name is
	 * invalid.
	 * @throws RuntimeException if no frame is available or the client is not
	 * connected.
	 */
	public long getMarkerRayContributionCount(String subjectName, String markerName) {
		Output_GetMarkerRayContributionCount result = client.GetMarkerRayContributionCount(
			convertSubjectName(subjectName), convertMarkerName(markerName));
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getMarkerRayContributionCount () but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getMarkerRayContributionCount() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getMarkerRayContributionCount () but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSegmentName) {
			throw new IllegalArgumentException("getMarkerRayContributionCount () but markerName \"" + markerName + "\" is invalid!");
		}
		long Count = result.getRayContributionsCount();
		//System.out.println("Get segment name: "+SegmentName);
		return Count;
	}

	/**
	 * Return the camera ID for an indexed ray that is contributing to a labeled
	 * marker in the DataStream.
	 *
	 * This information can be used in conjunction with
	 * GetMarkerRayContributionCount.
	 *
	 * @see getMarkerRayContributionCount
	 * @see enableMarkerRayData
	 * @see disableMarkerRayData
	 * @see isMarkerRayDataEnabled
	 * @param subjectName subject name
	 * @param markerName marker name
	 * @param markerRayContributionIndex marker ray contribution index
	 * @return the camera ID for an indexed ray that is contributing to a
	 * labeled marker in the DataStream.
	 * @throws IllegalArgumentException if subject name or marker name is
	 * invalid.
	 * @throws RuntimeException if no frame is available or the client is not
	 * connected.
	 */
	public long getMarkerRayContribution(String subjectName, String markerName, int markerRayContributionIndex) {
		Output_GetMarkerRayContribution result = client.GetMarkerRayContribution(
			convertSubjectName(subjectName), convertMarkerName(markerName), markerRayContributionIndex);
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getMarkerRayContribution() but subjectName \"" + subjectName + "\" is invalid!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getMarkerRayContribution() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getMarkerRayContribution() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidMarkerName) {
			throw new IllegalArgumentException("getMarkerRayContribution() but markerName \"" + markerName + "\" is invalid!");
		}
		long CameraID = result.getCameraID();
		//System.out.println("Get segment name: "+SegmentName);
		return CameraID;
	}

	/**
	 * Return the number of markers for a specified subject in the DataStream.
	 *
	 * <p>
	 * This information can be used in conjunction with GetMarkerName</p>
	 *
	 * @see getSubjectName
	 * @see getMarkerName
	 * @param subjectName The name of the subject
	 * @return The number of markers
	 * @throws RuntimeException if the client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException if segment name is invalid,
	 */
	public long getMarkerCount(String subjectName) {
		Output_GetMarkerCount result = client.GetMarkerCount(convertSubjectName(subjectName));
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getMarkerCount() but segmentName \"" + subjectName + "\" is invalid!");
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
	 * Return the number of force plates, EMGs, and other devices in the
	 * DataStream.
	 *
	 * This information can be used in conjunction with GetDeviceName.<p>
	 *
	 * @see getDeviceName
	 * @return number of devices
	 * @throws RuntimeException if the client is not connected or no frame is
	 * available.
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
	 * Return the number of outputs for a device in the DataStream.
	 *
	 * This information can be used in conjunction with GetDeviceOutputName.
	 *
	 * @see getDeviceName
	 * @see getDeviceOutputName
	 * @param deviceName device name
	 * @return the number of outputs for a device in the DataStream.
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
	 * @throws IllegalArgumentException if the device name is not available
	 */
	public long getDeviceOutputCount(String deviceName) {
		ViconString deviceNameAsViconString = convertDeviceName(deviceName);
		if (deviceNameAsViconString == null) {
			throw new IllegalArgumentException("getDeviceOutputCount() device name \"" + deviceName + "\" not found!");
		}
		Output_GetDeviceOutputCount result = client.GetDeviceOutputCount(deviceNameAsViconString);
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getDeviceOutputCount() but client is not connected!!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getDeviceOutputCount () but no frame available!");
		}
		long Count = result.getDeviceOutputCount();
		//System.out.println("Get segment name: "+SegmentName);
		return Count;
	}

	/**
	 * Return the name and type of a device.
	 *
	 * This name can be passed into device functions.<p>
	 *
	 * The device type will be: Unknown ForcePlate
	 *
	 * @see getDeviceCount
	 * @see getDeviceOutputCount
	 * @see getDeviceOutputValue
	 * @param deviceIndex device index
	 * @return device name and type
	 * @throws IllegalArgumentException if device index is invalid, no frame is
	 * available or client is not connected.
	 */
	public String[] getDeviceName(int deviceIndex) {
		if (deviceIndex < 0) {
			throw new IllegalArgumentException("getDeviceName() deviceIndex >=0 is needed!");
		}
		Output_GetDeviceName result = client.GetDeviceName(deviceIndex);
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getDeviceName() but deviceIndex is invalid!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getDeviceName() but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getDeviceName() but client is not connected!!");
		}
		return new String[]{result.getDeviceName().toStdString(),
			result.getDeviceType().toString()};
	}

	/**
	 * Return the name and SI unit of a device output.
	 *
	 * This name can be passed into GetDeviceOutputValue.
	 *
	 * The DeviceOutputName could be:
	 *
	 * "Fx" - Force X "Fy" - Force Y "Fz" - Force Z "Mx" - Moment X "My" -
	 * Moment Y "Mz" - Moment Z "Cx" - Center Of Pressure X "Cy" - Center Of
	 * Pressure Y "Cz" - Center Of Pressure Z "Pin1" - Analog Input 1 "Pin2" -
	 * Analog Input 2
	 *
	 * The Device Output Unit will be:
	 *
	 * Unit.Unknown Unit.Volt Unit.Newton Unit.NewtonMeter Unit.Meter
	 * Unit.Kilogram Unit.Second Unit.Ampere Unit.Kelvin Unit.Mole Unit.Candela
	 * Unit.Radian Unit.Steradian Unit.MeterSquared Unit.MeterCubed
	 * Unit.MeterPerSecond Unit.MeterPerSecondSquared Unit.RadianPerSecond
	 * Unit.RadianPerSecondSquared Unit.Hertz Unit.Joule Unit.Watt Unit.Pascal
	 * Unit.Lumen Unit.Lux Unit.Coulomb Unit.Ohm Unit.Farad Unit.Weber
	 * Unit.Tesla Unit.Henry Unit.Siemens Unit.Becquerel Unit.Gray Unit.Sievert
	 * Unit.Katal<p>
	 *
	 * @see getDeviceCount
	 * @see getDeviceOutputCount
	 * @see getDeviceOutputValue
	 * @param deviceName device name
	 * @param deviceIndex index of the device output
	 * @return the name and SI unit of a device output.
	 * @throws IllegalArgumentException if the device index does not exist
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 */
	public String[] getDeviceOutputName(String deviceName, int deviceIndex) {
		if (deviceIndex < 0) {
			throw new IllegalArgumentException("getSubjectName() deviceIndex >=0 is needed!");
		}
		System.out.println("test1");
		Output_GetDeviceOutputName result = client.GetDeviceOutputName(convertDeviceName(deviceName), deviceIndex);
		System.out.println("test2");
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getDeviceOutputName() but deviceIndex is invalid!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getDeviceOutputName() but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getDeviceOutputName but client is not connected!!");
		}
		return new String[]{result.getDeviceOutputName().toString(),
			result.getDeviceOutputUnit().toString()};
		//System.out.println("Get subject name: "+result.getResult().toString());
	}

	/**
	 * Return the value of a device output.
	 *
	 * If there are multiple samples for a frame, then the first sample is
	 * returned. The force plate data provided in the individual device channels
	 * is in a coordinate system local to the force plate aligned Z upwards, Y
	 * towards the front of the force plate. This coordinate system is located
	 * at the center of the top surface of the force plate. Any plate origin
	 * offset has been accounted for in the moment data. These are forces not
	 * reactions.<p>
	 *
	 * @see getDeviceCount
	 * @see getDeviceOutputCount
	 * @see getDeviceOutputName
	 * @param deviceName device name
	 * @param deviceOutputName device output name
	 * @return the value of a device output or NaN if occluded
	 * @throws IllegalArgumentException if the device name or the
	 * deviceOutputName does not exist
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 */
	public double getDeviceOutputValue(String deviceName, String deviceOutputName) {

		Output_GetDeviceOutputValue result = client.GetDeviceOutputValue(convertDeviceName(deviceName),
			convertDeviceOutputName(deviceName, deviceOutputName));

		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new RuntimeException("getDeviceOutputName() but deviceName is invalid!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getDeviceOutputName() but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getDeviceOutputName but client is not connected!!");
		}
		double DeviceOutputValue = result.getValue();
		if (result.getOccluded()) {
			return Double.NaN;
		}
		//System.out.println("Get subject name: "+result.getResult().toString());
		return DeviceOutputValue;
	}

	/**
	 * Return the number of samples available for the specified device at the
	 * current frame.
	 *
	 * If an analog device is sampling at 1000 Hz and the system is running at
	 * 100 Hz then this function will return 10. The samples can be accessed by
	 * supplying the subsample index to GetDeviceOutputValue.
	 *
	 * @see getDeviceOutputCount
	 * @see getDeviceOutputValue
	 * @param deviceName device name
	 * @param deviceOutputName device output name
	 * @return the number of samples available for the specified device at the
	 * current frame, -1 if is occluded
	 * @throws IllegalArgumentException if the device name or the
	 * deviceOutputName does not exist
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 */
	public long getDeviceOutputSubsamples(String deviceName, String deviceOutputName) {

		ViconString deviceNameAsViconString = convertDeviceName(deviceName);
		Output_GetDeviceOutputSubsamples result = client.GetDeviceOutputSubsamples(deviceNameAsViconString,
			convertDeviceOutputName(deviceName, deviceOutputName));
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getDeviceOutputName() but deviceName is invalid!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getDeviceOutputSubsamples() but no frame available!");
		}
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getDeviceOutputSubsamples but client is not connected!!");
		}
		if (result.getOccluded()) {
			return -1;
		}
		return result.getDeviceOutputSubsamples();
	}

	/**
	 * Return the number of force plates available in the DataStream.
	 *
	 * @see getGlobalForceVector
	 * @see getGlobalMomentVector
	 * @see getGlobalCentreOfPressure
	 * @return the number of force plates available in the DataStream.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 */
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

	/**
	 * Return the force vector for the force plate in global coordinates. This
	 * version takes a subsample index that allows access to all of the force
	 * information. The vector is in Newtons and is with respect to the global
	 * coordinate system, regardless of the orientation of the plate.<p>
	 *
	 * The vector represents the force exerted upon the force plate, not the
	 * reaction force.
	 *
	 * @see getGlobalMomentVector
	 * @see getGlobalCentreOfPressure
	 * @param forceplateIndex force plate index
	 * @return the force vector for the force plate in global coordinates.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 * @throws IllegalArgumentException if the forceplate index does not exist
	 */
	public double[] getGlobalForceVector(int forceplateIndex) {
		Output_GetGlobalForceVector result = client.GetGlobalForceVector(forceplateIndex);
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

	/**
	 * Return the moment vector for the force plate in global coordinates.
	 *
	 * This version takes a subsample index that allows access to all of the
	 * force information. The vector is in Newton-meters and is with respect to
	 * the global coordinate system, regardless of the orientation of the plate.
	 * The vector represents the moment exerted upon the force plate, not the
	 * reaction moment. Any force plate origin offset is accounted for in the
	 * moments so they are acting about the exact center of the top surface of
	 * the force plate.<p>
	 *
	 * @see getGlobalForceVector
	 * @see getGlobalCentreOfPressure
	 * @param forceplateIndex force plate index
	 * @return the moment vector for the force plate in global coordinates.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 * @throws IllegalArgumentException if the forceplate index does not exist
	 */
	public double[] getGlobalMomentVector(int forceplateIndex) {
		Output_GetGlobalMomentVector result = client.GetGlobalMomentVector(forceplateIndex);
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

	/**
	 * Return the center of pressure for the force plate in global coordinates.
	 *
	 * This version takes a subsample index that allows access to all of the
	 * force information. The position is in millimeters and is with respect to
	 * the global coordinate system.<p>
	 *
	 * @see getGlobalForceVector
	 * @see getGlobalMomentVector
	 * @param forceplateIndex force plate index
	 * @return the center of pressure for the force plate in global coordinates.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 * @throws IllegalArgumentException if the forceplate index does not exist
	 */
	public double[] getGlobalCentreOfPressure(int forceplateIndex) {
		Output_GetGlobalCentreOfPressure result = client.GetGlobalCentreOfPressure(forceplateIndex);
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getGlobalCentreOfPressure() but the forceplateIndex is invalid!");
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

	/**
	 * Return the number of subsamples available for a specified force plate in
	 * the current frame.
	 *
	 * Additional versions of GetGlobalForceVector, GetGlobalMomentVector and
	 * GetGlobalCentreOfPressure take the subsample index to allow access to all
	 * the force plate data.<p>
	 *
	 * @see getGlobalForceVector
	 * @see getGlobalMomentVector
	 * @see getGlobalCentreOfPressure
	 * @param forceplateIndex force plate index
	 * @return the number of subsamples available for a specified force plate in
	 * the current frame.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 * @throws IllegalArgumentException if the forceplate index does not exist
	 */
	public long getForcePlateSubsamples(int forceplateIndex) {
		Output_GetForcePlateSubsamples result = client.GetForcePlateSubsamples(forceplateIndex);
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getForcePlateSubsamples() but ForceplateIndex is invalid!");
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

	/**
	 * Return the force vector for the force plate in global coordinates.
	 *
	 * The vector is in Newtons and is with respect to the global coordinate
	 * system regardless of the orientation of the force plate. The vector
	 * represents the force exerted upon the force plate, not the reaction
	 * force. If multiple subsamples are available, this function returns the
	 * first subsample. See the alternate version of this function to access all
	 * of the analog data.
	 *
	 * @see getGlobalMomentVector
	 * @see getGlobalCentreOfPressure
	 * @param forceplateIndex force plate index
	 * @param subsample sub sample
	 * @return the force vector for the force plate in global coordinates.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 * @throws IllegalArgumentException if the forceplate index does not exist
	 */
	public double[] getGlobalForceVector(int forceplateIndex, int subsample) {
		Output_GetGlobalForceVector result = client.GetGlobalForceVector(forceplateIndex, subsample);
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getGlobalForceVector () but ForceplateIndex is invalid!");
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

	/**
	 * Return the moment vector for the force plate in global coordinates.
	 *
	 * The vector is in Newton-meters and is with respect to the global
	 * coordinate system regardless of the orientation of the force plate. The
	 * vector represents the moment exerted upon the force plate, not the
	 * reaction moment. Any force plate origin offset is accounted for in the
	 * moments so they are acting about the exact center of the top surface of
	 * the force plate. If multiple subsamples are available, this function
	 * returns the first subsample. See the alternate version of this function
	 * to access all of the analog data.
	 *
	 * @see getGlobalForceVector
	 * @see getGlobalCentreOfPressure
	 * @param forceplateIndex force plate index
	 * @param subsample sub sample
	 * @return the moment vector for the force plate in global coordinates.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 * @throws IllegalArgumentException if the forceplate index does not exist
	 */
	public double[] getGlobalMomentVector(int forceplateIndex, int subsample) {
		Output_GetGlobalMomentVector result = client.GetGlobalMomentVector(forceplateIndex, subsample);
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getGlobalMomentVector () but ForceplateIndex is invalid!");
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

	/**
	 * Return the center of pressure for the force plate in global coordinates.
	 *
	 * The position is in millimeters and is with respect to the global
	 * coordinate system. If multiple subsamples are available this function
	 * returns the first subsample. See the alternate version of this function
	 * to access all of the analog data.
	 *
	 * @see getGlobalForceVector
	 * @see getGlobalMomentVector
	 * @param forceplateIndex force plate index
	 * @param subsample sub sample
	 * @return the center of pressure for the force plate in global coordinates.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 * @throws IllegalArgumentException if the forceplate index does not exist
	 */
	public double[] getGlobalCentreOfPressure(int forceplateIndex, int subsample) {
		Output_GetGlobalCentreOfPressure result = client.GetGlobalCentreOfPressure(forceplateIndex, subsample);
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getGlobalCentreOfPressure() but ForceplateIndex is invalid!");
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

	/**
	 * Return the number of eye trackers available in the DataStream.
	 *
	 * @see getEyeTrackerGlobalGazeVector
	 * @see getEyeTrackerGlobalGazeVector
	 * @return the number of eye trackers available in the DataStream.
	 * @throws RuntimeException if the client is not connected or no frame
	 * available
	 */
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

	/**
	 * Return the location of the eye.
	 *
	 * The position is in millimeters with respect to the global origin. The
	 * segment and device data need to be enabled to get the position.
	 *
	 * @see getEyeTrackerCount
	 * @see getEyeTrackerGlobalGazeVector
	 * @param eyeTrackerIndex eye tracker index
	 * @return the location of the eye.
	 */
	public double[] getEyeTrackerGlobalPosition(int eyeTrackerIndex) {
		Output_GetEyeTrackerGlobalPosition result = client.GetEyeTrackerGlobalPosition(eyeTrackerIndex);
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

	/**
	 * Return the gaze direction as a unit vector in global coordinates.
	 *
	 * The gaze vector will be marked as occluded if the segment that has the
	 * eye tracker attached is not visible, the eye tracker is not calibrated or
	 * the pupil is not found. The segment and device data need to be enabled to
	 * get the gaze vector.
	 *
	 * @see getEyeTrackerCount
	 * @see getEyeTrackerGlobalPosition
	 * @param eyeTrackerIndex eye tracker index
	 * @return the gaze direction as a unit vector in global coordinates.
	 * @throws IllegalArgumentException if the eyeTrackerIndex does not exist
	 * @throws RuntimeException if no frame is available or the client is not
	 * connected
	 */
	public double[] getEyeTrackerGlobalGazeVector(int eyeTrackerIndex) {
		Output_GetEyeTrackerGlobalGazeVector result = client.GetEyeTrackerGlobalGazeVector(eyeTrackerIndex);
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getEyeTrackerGlobalGazeVector() but eyeTrackerIndex is invalid!");
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
	 * <p>
	 * Call this function on startup, after connecting to the server, and before
	 * trying to read centroid information.</p>
	 *
	 * @see isCentroidDataEnabled
	 * @see disableCentroidData
	 * @throws RuntimeException if the client is not connected.
	 */
	public void enableCentroidData() {
		Output_EnableCentroidData result = client.EnableCentroidData();
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("enableCentroidData but client is not connected!");
		}
	}

	/**
	 * Enable greyscale data in the Vicon DataStream.
	 *
	 * Call this function on startup, after connecting to the server, and before
	 * trying to read greyscale information.<p>
	 *
	 * @see isGreyscaleDataEnabled
	 * @see disableGreyscaleData
	 * @throws RuntimeException if the client is not connected.
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
	 * @see getCameraName
	 * @see getCentroidCount
	 * @see getCentroidPosition
	 * @return number of cameras
	 * @throws RuntimeException if client is not connected or no frame is
	 * available
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
	 * <p>
	 * This name can be passed into centroid functions.</p>
	 *
	 * @see getCameraCount
	 * @see getCentroidCount
	 * @see getCentroidPosition
	 * @param cameraIndex camera index
	 * @return the name of a camera.
	 */
	public String getCameraName(long cameraIndex) {
		if (cameraIndex < 0) {
                    throw new IllegalArgumentException("getCameraName() CameraIndex >=0 is needed!");
                }
                Output_GetCameraName Result = client.GetCameraName(cameraIndex);
		if (Result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getCameraName() but client is not connected!!");
		}
		if (Result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getCameraName() but no frame available!");
		}
		if (Result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getCameraName() but camera index \"" + String.valueOf(cameraIndex) + "\" is invalid!");
		}
		return Result.getCameraName().toStdString();
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
     * @throws RuntimeException if client is not connected, no frame is available
     * @throws IllegalArgumentException for invalid subject name or invalid marker index
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
			throw new IllegalArgumentException("getMarkerName() but invalid subject name \"" + subjectName + "\"!");
		}
		if (result.getResult() == Result_Enum.InvalidIndex) {
			throw new IllegalArgumentException("getMarkerName() but invalid marker index \"" + markerIndex + "\"!");
		}
		return result.getMarkerName().toStdString();
	}

	/**
	 * Return the name of the segment that is the parent of this marker.
	 *
	 * @see getMarkerCount
	 * @see getMarkerName
	 * @see getMarkerGlobalTranslation
	 * @param subjectName subject name
	 * @param markerName marker name
	 * @return the name of the segment that is the parent of this marker.
	 */
	public String getMarkerParentName(String subjectName, String markerName) {
		ViconString subjectNameAsViconString = convertSubjectName(subjectName);
		ViconString markerNameAsViconString = convertMarkerName(markerName);
		Output_GetMarkerParentName result = client.GetMarkerParentName(
			subjectNameAsViconString, markerNameAsViconString);
		if (result.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("getMarkerParentName() but client not connected!");
		}
		if (result.getResult() == Result_Enum.NoFrame) {
			throw new RuntimeException("getMarkerParentName() but no frame available!");
		}
		if (result.getResult() == Result_Enum.InvalidSubjectName) {
			throw new IllegalArgumentException("getMarkerParentName() but invalid subject name \"" + subjectName + "!");
		}
		if (result.getResult() == Result_Enum.InvalidMarkerName) {
			throw new IllegalArgumentException("getMarkerParentName() but invalid marker name \"" + markerName + "!");
		}
		return result.getSegmentName().toStdString();
	}

	/**
	 * Return the number of the last frame retrieved from the DataStream.
	 *
	 * @see getFrame
	 * @see getTimeCode
	 * @return number of the last frame.
	 * @throws RuntimeException if client not connected or no frame available.
	 */
	public long getFrameNumber() {
		Output_GetFrameNumber frameNumber = client.GetFrameNumber();
		//System.out.println("Get frame number: "+frameNumber.getResult().toString());
		if (frameNumber.getResult() == Result_Enum.NotConnected) {
			throw new RuntimeException("get frame number but client not connected!");
		}
		return frameNumber.getFrameNumber();
	}

	/**
	 * Return the timecode information for the last frame retrieved from the
	 * DataStream.
	 *
	 * <p>
	 * If the stream is valid but timecode is not available, the Output will be
	 * Result.Success and the Standard will be None.</p>
	 *
	 * @see getFrame
	 * @see getFrameNumber
	 * @return timecode time code
	 * @throws RuntimeException if no frame is avaialble or the client is not
	 * connected.
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
	 *
	 * @param waiting true, than waiting till connected
	 * @return false if client is not connected.
	 * @see setStreamMode
	 */
	public boolean getFrame(boolean waiting) {
		Result_Enum result = client.GetFrame().getResult();
		if (waiting) {
			// while not connected
			while (result != Result_Enum.Success) {
				try {
                                    Thread.sleep(10);
				} catch (InterruptedException ex) {
					Logger.getLogger(DataStreamClient.class.getName()).log(Level.SEVERE, null, ex);
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
}