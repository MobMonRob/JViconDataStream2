package de.dhbw.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.nativelib.NativeLibLoader;
import de.dhbw.rahmlab.vicon.datastream.impl.Direction_Enum;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_AddToSubjectFilter;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_ClearSubjectFilter;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_Connect;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_DisableLightweightSegmentData;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_Disconnect;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_EnableLightweightSegmentData;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetAxisMapping;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentCount;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentName;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSubjectCount;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSubjectName;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSubjectRootSegmentName;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentChildName;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentChildCount;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentParentName;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentStaticTranslation;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentStaticRotationHelical;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentStaticRotationMatrix;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentStaticRotationQuaternion;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentStaticRotationEulerXYZ;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentGlobalTranslation;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentLocalRotationEulerXYZ;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentLocalRotationHelical;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentLocalRotationQuaternion;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentLocalTranslation;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetGreyscaleBlob;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentGlobalRotationEulerXYZ;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentGlobalRotationHelical;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentGlobalRotationMatrix;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentGlobalRotationQuaternion;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentLocalRotationMatrix;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSegmentStaticScale;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_SetAxisMapping;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_UpdateFrame;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_WaitForFrame;
import de.dhbw.rahmlab.vicon.datastream.impl.Result_Enum;
import de.dhbw.rahmlab.vicon.datastream.impl.RetimingClient;
import de.dhbw.rahmlab.vicon.datastream.impl.VectorUint;
import de.dhbw.rahmlab.vicon.datastream.impl.VectorVectorUchar;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Oliver Rettig
 *
 * <p>Intended uses</p>
 * 
 * <p>The Vicon DataStream re-timing client provides calls to obtain subject data 
 * from the DataStream with minimal latency and temporal jitter. When UpdateFrame() 
 * is called, the client uses re-timed data that has been linearly interpolated 
 * from an internal buffer to predict the position of each segment to the current
 * time.</p>
 * 
 * <p>The system and network latencies are used when determining the amount of 
 * prediction required. If additional prediction is required, for example, for 
 * use in a VR system where an additional latency is present due to rendering 
 * and display latency; this may be requested in the call to UpdateFrame().</p>
 * 
 * <p>The user will call UpdateFrame(), which will update the current frame state 
 * to the time of calling and return immediately. This is intended for use in 
 * systems where you require subject data positions at times driven by an external 
 * clock.</p>
 * 
 * <p>If you do not have an external clock, and require behavior similar to that of 
 * the standard DataStream client running in ServerPush streaming mode, then 
 * the system may be configured to provide frame data at a consistent frame rate 
 * by providing a frame rate to the Connect() call. The user will then call Wait-
 * ForFrame(), which will block in a similar method to Client::GetFrame(), but 
 * using retimed data in order to keep the frame period very consistent.</p>
 *
 * <p>When a function has returned false, the output arguments are set to an 
 * appropriate default value:</p>
 * 
 * <p>• Booleans will be set to false.
 * • Integers will be set to zero.
 * • Doubles will be set to zero.
 * • Strings will be set to zero length.
 * • When the output argument is an array, all elements are set in this manner.</p>
 *
 * <p>By default the global coordinate system matches the server application; Z-Up, 
 * Y-Left. This can be changed by using setAxisMapping.</p>
 */
public class DataStreamRetimingClient {

    private final RetimingClient client;

    /**
     * Instances of the Vicon Data Stream RetimingClient create a DataStreamClient 
     * internally that manages the connection to the data stream.
     * 
     * The RetimingClient will set up the underlying client to receive the 
     * required data from the stream and to set the correct data delivery mode, 
     * so it is not necessary to set this up manually.
     *
     * You can create many instances of the Vicon DataStream Client, which can
     * connect to multiple Vicon DataStream Servers.
     */
    public DataStreamRetimingClient() {
        client = new RetimingClient();
    }

    /**
     * Establish a dedicated connection to a Vicon DataStream Server.
     *
     * <p>The function defaults to connecting on port 801. You can specify an 
     * alternate port number after a colon.</p>
     *
     * <p>This is for future compatibility: Current products serve data on port 801 
     * only. Additional clients can be added separated with a semicolon ’;’. 
     * These are used in combination to reduce temporal jitter.</p>
     *
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

            Output_Connect result = client.Connect(hostname);

            // tritt seltsamerweise auch für localhost ab und zu auf
            if (result.getResult() == Result_Enum.InvalidHostName) {
                //throw new IllegalArgumentException("connect() but invalid hostname \"" + hostname + "\"!");
                System.out.println("connect() but invalid hostname \"" + hostname + "\"!");
            } else if (result.getResult() == Result_Enum.ClientAlreadyConnected) {
                System.out.println("Client is Already Connected! ");
            } else if (result.getResult() == Result_Enum.Success) { // -->ende der while schleife
                System.out.println("Client Connection sucess!");
            } else if (result.getResult() == Result_Enum.ClientAlreadyConnected) { // --> kann innerhalb der while schleife nicht auftreten
                System.out.println("Client already connected!");
            } else if (result.getResult() == Result_Enum.ClientConnectionFailed) { // --> dafür ist die while schleife da
                System.out.println("Client Connection failed!");
            }
            try {
                Thread.sleep(1000);
                System.out.println("...try to connect " + String.valueOf(i++));
            } catch (InterruptedException ex) {
                //TODO
                Logger.getLogger(DataStreamRetimingClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //getFrame(true);
    }

    /**
     * Establish a dedicated connection to a Vicon DataStream Server. The function 
     * defaults to connecting on port 801.
     *
     * You can specify an alternate port number after a colon.<p>
     *
     * This is for future compatibility: current products serve data on port 801 
     * only. Additional clients can be added separated with a semicolon ’;’. 
     * These are used in combination to reduce temporal jitter.<p>
     *
     * @param frameRate The re-timing client’s internal frame output clock
     * will be active.
     * @see disconnect
     * @see isConnected
     * @param hostname The DNS identifiable name, or IP address of the PC
     * hosting the DataStream server. The function defaults to connecting on
     * port 801. You can specify an alternate port number after a colon. E.g.:
     * "localhost" "MyViconPC:804", "10.0.0.2"
     * @throws IllegalArgumentException if given hostname is invalid
     */
    public void connect(String hostname, double frameRate) {
        int i = 0;
        while (!isConnected()) {

            Output_Connect result = client.Connect(hostname, frameRate);

            // tritt seltsamerweise auch für localhost ab und zu auf
            if (result.getResult() == Result_Enum.InvalidHostName) {
                //throw new IllegalArgumentException("connect() but invalid hostname \"" + hostname + "\"!");
                System.out.println("connect() but invalid hostname \"" + hostname + "\"!");
            } else if (result.getResult() == Result_Enum.ClientAlreadyConnected) {
                System.out.println("Client is Already Connected! ");
            } else if (result.getResult() == Result_Enum.Success) { // -->ende der while schleife
                System.out.println("Client Connection sucess!");
            } else if (result.getResult() == Result_Enum.ClientAlreadyConnected) { // --> kann innerhalb der while schleife nicht auftreten
                System.out.println("Client already connected!");
            } else if (result.getResult() == Result_Enum.ClientConnectionFailed) { // --> dafür ist die while schleife da
                System.out.println("Client Connection failed!");
            }
            try {
                Thread.sleep(1000);
                System.out.println("...try to connect " + String.valueOf(i++));
            } catch (InterruptedException ex) {
                //TODO
                Logger.getLogger(DataStreamRetimingClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //getFrame(true);
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
     * • Major When this number increases, we break backward compatibility with 
     *   previous major versions.
     * • Minor When this number increases, we have probably added new 
     *   functionality to the SDK without breaking backward compatibility with 
     *   previous versions.
     * • Point When this number increases, we have introduced a bug fix or 
     *   performance enhancement without breaking backward compatibility with 
     *   previous versions.
     * 
     * The function can be called without the client being connected.
     *
     * @return version
     */
    public Version getVersion() {
        return new Version(client.GetVersion());
    }

    /**
     * Disable kinematic segment data in the Vicon DataStream.
     *
     * <p>The implementation in this retiming client automatically enables normal 
     * segment data; this is distinct to the non retiming client where the user 
     * must do this themselves.</p>
     *
     * @see enableLightweightSegmentData()
     * @see isLightweightSegmentDataEnabled()
     * @throws RuntimeException if the client is not connected.
     */
    public void disableLightweightSegmentData() {
        Output_DisableLightweightSegmentData result = client.DisableLightweightSegmentData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("Client is not connected!");
        }
    }
    /**
     * Disable the lightweight output mode for kinematic segment data in the
     * Vicon DataStream.
     *
     * <p>Calling this mode does not automatically enable any other data types.</p>
     *
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
     * Enable a lightweight transmission protocol for kinematic segment data in
     * the Vicon DataStream.
     *
     * <p>This will reduce the network bandwidth required to transmit segment data
     * to approximately a quarter of that required by the previous method, at
     * the expense of a small amount of precision.</p>
     *
     * <p>Use the existing methods such as GetSegmentGlobalTranslation() and
     * GetSegmentGlobalRotationMatrix() as usual to obtain the segment data.</p>
     *
     * <p>Calling this method will automatically disable all other conﬁgurable
     * output types. These may be re-enabled after the call if required.</p>
     *
     * <p>Call this function on startup, after connecting to the server, and before
     * trying to read local or global segment data.</p>
     *
     * @see disableLightweightSegmentData
     * @throws RuntimeException if the client is not connected.
     */
    public void enableLightweightSegmentData() {
        Output_EnableLightweightSegmentData result = client.EnableLightweightSegmentData();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
        // success
    }

    /**
     * Return whether the lightweight transport mode for kinematic segment data
     * is enabled in the Vicon DataStream.
     *
     * @see enableLightweightSegmentData
     * @see disableLightweightSegmentData
     * @return whether the lightweight transport mode for kinematic segment data
     * is enabled in the Vicon DataStream.
     */
    public boolean isLightweightSegmentDataEnabled() {
        return client.IsLightweightSegmentDataEnabled().getEnabled();
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
     * @param x x direction - Specify the direction of your X axis relative to yourself as the observer.
     * @param y y direction - Specify the direction of your Y axis relative to yourself as the observer.
     * @param z z direction - Specify the direction of your Z axis relative to yourself as the observer.
     * @see getAxisMapping
     *
     * <p>TODO vielleicht ein besseres Argument einführen, also z.B. xyz, yxz, ...
     * so wie in CalcML</p>
     */
    public void setAxisMapping(Direction x, Direction y, Direction z) {
        Direction_Enum x_enum = Direction_Enum.swigToEnum(x.swigValue());
        Direction_Enum y_enum = Direction_Enum.swigToEnum(y.swigValue());
        Direction_Enum z_enum = Direction_Enum.swigToEnum(z.swigValue());
        Output_SetAxisMapping result = client.SetAxisMapping(x_enum, y_enum, z_enum);
        if (result.getResult().equals(Result_Enum.CoLinearAxes)) {
            throw new IllegalArgumentException("Colinear axes are not allowed!");
        } else if (result.getResult().equals(Result_Enum.LeftHandedAxes)){
            throw new IllegalArgumentException("Lefthanded axes are not allowed!");
        }
    }
    
    /**
     * Sets the maximum amount by which the interpolation engine will predict 
     * later than the latest received frame.
     * 
     * If required to predict by more than this amount, the result 
     * LateDataRequested will be returned.
     *
     * @param maxPrediction The maximum amount of prediction required in milliseconds
     */
    public void setMaximumPrediction(double maxPrediction){
        client.SetMaximumPrediction(maxPrediction);
    }
    
    /**
     * Returns the maximum prediction value currently in use.
     * 
     * The default value is 100 ms.
     *
     * @return the maximum prediction value currently in use. The Default value is 100ms.
     */
    public double maximumPrediction(){
        return client.MaximumPrediction();
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
     * Update the current frame state to represent the position of all active 
     * subjects at the current time.
     * 
     * The position of each segment is estimated by predicting forwards from the 
     * most recent frames received from the DataStream, taking into account the 
     * latency reported by the system to determine the amount of prediction required.
     * 
     * The results of calls which return details about the current frame state 
     * such as GetSubjectCount() and GetSegmentGlobalRotationQuaternion() will 
     * all return the stream contents and position at the time that this call was 
     * made.
     * 
     * If no call to UpdateFrame() is made, calls querying the stream state will 
     * return NoFrame.
     */
    public void updateFrame(){
        Output_UpdateFrame result = client.UpdateFrame();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
        // success
    }
    /**
     * Update the current frame state to represent the position of all active 
     * subjects at the current time.
     * 
     * The position of each segment is estimated by predicting forwards from the 
     * most recent frames received from the DataStream, taking into account the 
     * latency reported by the system to determine the amount of prediction required.
     * 
     * The results of calls which return details about the current frame state 
     * such as GetSubjectCount() and GetSegmentGlobalRotationQuaternion() will 
     * all return the stream contents and position at the time that this call was 
     * made.
     * 
     * If no call to UpdateFrame() is made, calls querying the stream state will 
     * return NoFrame.
     * 
     * @param offset An additional offset that will be applied to the time at 
     *        which the predicted position is calculated. This may be used to 
     *        compensate for additional delays that are in the user’s system, 
     *        such as render delay. 
     */
    public void updateFrame(double offset){
        Output_UpdateFrame result = client.UpdateFrame(offset);
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
        // success
    }
    
    /**
     * Used when running the retiming client with a specified frame rate.
     * 
     * This call will block until the next frame is available, as driven by an 
     * internal clock running at the frame rate specified by connect(Host, frameRate). 
     * The frame data is re-timed to the correct time point.
     */
    public void waitForFrame(){
        Output_WaitForFrame result = client.WaitForFrame();
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("The client is not connected!");
        }
        // success
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
     */
    public long getSubjectCount() {
        Output_GetSubjectCount result = client.GetSubjectCount();
        //System.out.println("Get subject count: "+result.getResult().toString());
        if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSubjectCount() invoked but no frame available!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSubjectCount() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.Success) {
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
     * This can be passed into segment functions.</p>
     *
     * @see getSubjectCount
     * @param subjectIndex between 0 and getSubjectCount()-1
     * @return The name of the subject.
     * @throws RuntimeException if subject index is invalid, no frame available
     * or not connected.
     * @throws IllegalArgumentException if subjectIndex less than 0
     */
    public String getSubjectName(long subjectIndex) {
        if (subjectIndex < 0) {
            throw new IllegalArgumentException("getSubjectName() subjectIndex >= 0 is needed!");
        }
        long subjectCount = getSubjectCount();
        if (subjectIndex >= subjectCount) {
            throw new IllegalArgumentException("getSubjectName() subjectIndex >= subject count is needed!");
        }
        Output_GetSubjectName result = client.GetSubjectName(subjectIndex);
        if (result.getResult() == Result_Enum.InvalidIndex) {
            // sollte gar nicht mehr auftreten, da bereits oben spezifischer abgefangen
            throw new RuntimeException("getSubjectName() but subjectIndex is invalid!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSubjectName() but no frame available!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSubjectName() but client is not connected!!");
        }
        return result.getSubjectName(); 
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
     */
    public String getSubjectRootSegmentName(String subjectName) {
        Output_GetSubjectRootSegmentName result = client.GetSubjectRootSegmentName(subjectName);
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
        return result.getSegmentName();
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
        Output_GetSegmentCount result = client.GetSegmentCount(subjectName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentCount() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentCount() but no frame available!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentCount() but client is not connected!!");
        }
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
        Output_GetSegmentName result = client.GetSegmentName(subjectName, segmentIndex);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentName() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentName() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentName() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new IllegalArgumentException("getSegmentName() but segmentIndex \"" + segmentIndex + "\" is invalid!");
        }
        return result.getSegmentName();
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
        Output_GetSegmentChildCount result = client.GetSegmentChildCount(subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new RuntimeException("getSegmentChildCount() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentChildCount() but no frame available!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentChildCount() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new RuntimeException("getSegmentChildCount() but segmentIndex \"\" is invalid!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
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
                subjectName, segmentName, segmentIndex);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentChildName() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentChildName() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentChildName() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidIndex) {
            throw new IllegalArgumentException("getSegmentChildName() but segmentIndex \"" + segmentIndex + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentChildCount() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getSegmentName();
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
        Output_GetSegmentParentName result = client.GetSegmentParentName(subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentParentName() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentParentName() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentParentName() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentParentName() but segmentName \"" + segmentName + "\" is invalid!");
        }
        String resultString = result.getSegmentName();
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
        Output_GetSegmentStaticTranslation result = client.GetSegmentStaticTranslation(subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentStaticTranslation() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticTranslation() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticTranslation() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
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
        Output_GetSegmentStaticRotationHelical result = client.GetSegmentStaticRotationHelical(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentStaticRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticRotationHelical() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticRotationHelical() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
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
        Output_GetSegmentStaticRotationMatrix result = client.GetSegmentStaticRotationMatrix(subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentStaticRotationMatrix() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticRotationMatrix() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticRotationMatrix() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
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
        Output_GetSegmentStaticRotationQuaternion result = client.GetSegmentStaticRotationQuaternion(subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentStaticRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticRotationQuaternion() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticRotationQuaternion() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentStaticRotationQuaternion() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getRotation();
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
        Output_GetSegmentStaticScale result = client.GetSegmentStaticScale(subjectName, segmentName);
        if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticScale() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticScale() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSubjectName) {
           throw new IllegalArgumentException("getSegmentStaticScale() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentStaticScale() but segmentName \"" + segmentName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotSupported) {
            throw new UnsupportedOperationException("getSegmentStaticScale() not supported!");
        } else if (result.getResult() == Result_Enum.NotPresent) {
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
        Output_GetSegmentStaticRotationEulerXYZ result = client.GetSegmentStaticRotationEulerXYZ(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentStaticRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentStaticRotationEulerXYZ() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentStaticRotationEulerXYZ() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentStaticRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getRotation();
    }

    /**
     * Return the translation of a subject segment in global coordinates.
     *
     * The translation is of the form (x, y, z) where x, y and z are in
     * millimeters with respect to the global origin.<p>
     *
     * Occluded will be True if the segment was absent at this frame. In this
     * case the translation will be [0,0,0].
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
        Output_GetSegmentGlobalTranslation result = client.GetSegmentGlobalTranslation(subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentGlobalTranslation() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalTranslation() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalTranslation() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
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
     * Occluded will be True if the segment was absent at this frame. In this 
     * case the Rotation will be [0,0,0].
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
        Output_GetSegmentLocalRotationHelical result = client.GetSegmentLocalRotationHelical(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentLocalRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalRotationHelical() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalRotationHelical() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
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
        Output_GetSegmentGlobalRotationHelical result = client.GetSegmentGlobalRotationHelical(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentGlobalRotationHelical() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalRotationHelical() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalRotationHelical() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentGlobalRotationHelical() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getRotation();
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
        Output_GetSegmentGlobalRotationMatrix result = client.GetSegmentGlobalRotationMatrix(subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentGlobalRotationMatrix() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalRotationMatrix() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalRotationMatrix() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
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
     * that used in many other applications, which use (w, x, y, z).<p>
     * 
     * Occluded will be True if the segment was absent at this frame. In this 
     * case the Rotation will be [1,0,0,0].
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
        Output_GetSegmentGlobalRotationQuaternion result = client.GetSegmentGlobalRotationQuaternion(subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentGlobalRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalRotationQuaternion() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalRotationQuaternion() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentGlobalRotationQuaternion() but segmentName\"" + segmentName + "\" is invalid!");
        }
        return result.getRotation();
    }

    /**
     * Return the rotation of a subject segment in global Euler XYZ coordinates.
     * 
     *  Occluded will be True if the segment was absent at this frame. In this 
     * case the rotation will be [0,0,0].<P>
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
        Output_GetSegmentGlobalRotationEulerXYZ result = client.GetSegmentGlobalRotationEulerXYZ(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentGlobalRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentGlobalRotationEulerXYZ() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentGlobalRotationEulerXYZ() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentGlobalRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getRotation();
    }

    /**
     * Return the translation of a subject segment in local coordinates relative
     * to its parent segment.
     *
     * Occluded will be True if the segment was absent at this frame. In this 
     * case the translation will be [0,0,0].
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
        Output_GetSegmentLocalTranslation result = client.GetSegmentLocalTranslation(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentLocalTranslation () but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalTranslation () but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalTranslation () but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
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
     * that used in many other applications, which use (w, x, y, z).<p>
     * 
     * Occluded will be True if the segment was absent at this frame. In this 
     * case the rotation will be [1,0,0,0].

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
        Output_GetSegmentLocalRotationQuaternion result = client.GetSegmentLocalRotationQuaternion(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentLocalRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalRotationQuaternion() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalRotationQuaternion() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentLocalRotationQuaternion() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getRotation();
    }

    /**
     * Return the rotation row-major matrix of a subject segment in local 
     * coordinates relative to its parent segment.
     *
     * The quaternion is of the form (x, y, z, w) where w is the real component
     * and x, y and z are the imaginary components. N.B. This is different from
     * that used in many other applications, which use (w, x, y, z).<p>
     *
     * Occluded will be True if the segment was absent at this frame.<p>
     *
     * @see getSegmentLocalTranslation
     * @see getSegmentLocalRotationHelical
     * @see getSegmentLocalRotationQuaternion
     * @see getSegmentLocalRotationEulerXYZ
     * @see getSegmentGlobalTranslation
     * @see getSegmentGlobalRotationHelical
     * @see getSegmentGlobalRotationMatrix
     * @see getSegmentGlobalRotationQuaternion
     * @see getSegmentGlobalRotationEulerXYZ
     * @param subjectName subject name
     * @param segmentName segment name
     * @return An Output_GetSegmentLocalRotationMatrix class containing the 
     * result of the operation, the rotation of the segment, and whether the 
     * segment is occluded.
     * @throws RuntimeException if client is not connected or no frame is
     * available
     * @throws IllegalArgumentException for invalid subject- or segment name
     */
    public double[] getSegmentLocalRotationMatrix(String subjectName, String segmentName) {
        Output_GetSegmentLocalRotationMatrix result = client.GetSegmentLocalRotationMatrix(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentLocalRotationQuaternion() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalRotationQuaternion() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalRotationQuaternion() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentLocalRotationQuaternion() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getRotation();
    }
    
    /**
     * Return the rotation of a subject segment in local Euler XYZ coordinates
     * relative to its parent segment.
     *
     * Occluded will be True if the segment was absent at this frame. In this 
     * case the rotation will be [0,0,0].
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
        Output_GetSegmentLocalRotationEulerXYZ result = client.GetSegmentLocalRotationEulerXYZ(
                subjectName, segmentName);
        if (result.getResult() == Result_Enum.InvalidSubjectName) {
            throw new IllegalArgumentException("getSegmentLocalRotationEulerXYZ() but subjectName \"" + subjectName + "\" is invalid!");
        } else if (result.getResult() == Result_Enum.NotConnected) {
            throw new RuntimeException("getSegmentLocalRotationEulerXYZ() but client is not connected!!");
        } else if (result.getResult() == Result_Enum.NoFrame) {
            throw new RuntimeException("getSegmentLocalRotationEulerXYZ() but no frame available!");
        } else if (result.getResult() == Result_Enum.InvalidSegmentName) {
            throw new IllegalArgumentException("getSegmentLocalRotationEulerXYZ() but segmentName \"" + segmentName + "\" is invalid!");
        }
        return result.getRotation();
    }

    // TODO
    // Objektstruktur, Methoden müssen noch überlegt werden
    // bessere Benennung
    // unklar ob für Tracker und/oder Nexus verfügbar ist
    public class ViconBlob {
        private ViconBlob(Output_GetGreyscaleBlob blob){
            VectorUint posx = blob.getBlobLinePositionsX();
            VectorUint posy = blob.getBlobLinePositionsY();
            VectorVectorUchar  values = blob.getBlobLinePixelValues();
        }
    }

    /**
     * Add a subject name to the subject filter.
     * 
     * Only subjects present in the subject filter will be sent and subjects not
     * in the filter will be presented as absent/occluded. If no filtered subjects 
     * are present, all subjects will be sent.
     * 
     * @see clearSubjectFilter
     * @param subjectName the name of the subject
     */
    public void addToSubjectFilter(String subjectName){
        Output_AddToSubjectFilter result = client.AddToSubjectFilter(subjectName);
        if (result.getResult() == Result_Enum.InvalidSubjectName){
            throw new RuntimeException("addToSubjectFilter() failed due to wrong subject name \""+subjectName+"\"!");
        }
    }
    /**
     * Clear the subject filter.
     * 
     * This will result in all subjects beeing sent.
     * 
     * @see addToSubjectFilter
     */
    public void clearSubjectFilter(){
        Output_ClearSubjectFilter result = client.ClearSubjectFilter();
    }

    /**
     * Destruction will Disconnect if required.
     *
     */
    public void delete(){
        client.delete();
    }
}
