package de.dhbw.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.impl.ViconString;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_Connect;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_Disconnect;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_EnableLightweightSegmentData;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSubjectCount;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSubjectName;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetSubjectRootSegmentName;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_UpdateFrame;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_WaitForFrame;
import de.dhbw.rahmlab.vicon.datastream.impl.Result_Enum;
import de.dhbw.rahmlab.vicon.datastream.impl.RetimingClient;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oliver Rettig
 */
public class DataStreamRetimingClient {

	private final RetimingClient retimingClient;

	static {
		NativeLibLoader.load();
	}

	/**
	 * You can create many instances of the Vicon DataStream Client which can
	 * connect to multiple Vicon DataStream Servers.
	 */
	public DataStreamRetimingClient() {
		retimingClient = new RetimingClient();
	}

	public void connect(String hostname) {
		while (!isConnected()) {

			Output_Connect result = retimingClient.Connect(new ViconString(hostname));

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
				Logger.getLogger(DataStreamClient.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	public boolean isConnected() {
		return retimingClient.IsConnected().getConnected();
	}

	public boolean disconnect() {
		Output_Disconnect result = retimingClient.Disconnect();
		if (result.getResult().equals(Result_Enum.Success)) {
			return true;
		} else if (result.getResult().equals(Result_Enum.NotConnected)) {
			System.out.println("disconnect: but client was not connected!");
		}
		return false;
	}

	public Version getVersion() {
		return new Version(retimingClient.GetVersion());
	}

	public void enableLightweightSegmentData() {
		Output_EnableLightweightSegmentData result = retimingClient.EnableLightweightSegmentData();
		System.out.println("Enable Light weight Segment Data : " + result.getResult().toString());
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("enableLightweightSegmentData () but client was not connected!");
		}
	}

	public boolean isLightweightSegmentDataEnabled() {
		return retimingClient.IsLightweightSegmentDataEnabled().getEnabled();
	}

	public void updateFrame() {
		Output_UpdateFrame result = retimingClient.UpdateFrame();
		System.out.println("Enable Light weight Segment Data : " + result.getResult().toString());
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("UpdateFrame () but client was not connected!");
		}
	}

	public void waitForFrame() {
		Output_WaitForFrame result = retimingClient.WaitForFrame();
		System.out.println("Enable Light weight Segment Data : " + result.getResult().toString());
		if (result.getResult().equals(Result_Enum.NotConnected)) {
			throw new RuntimeException("WaitForFrame() but client was not connected!");
		}
	}

	public long getSubjectCount() {
		Output_GetSubjectCount result = retimingClient.GetSubjectCount();
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
	 * @throws RuntimeException if subject index is invalid.
	 * @throws IllegalArgumentException if subjectIndex less than zero
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
		Output_GetSubjectName result = retimingClient.GetSubjectName(subjectIndex);

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
		Output_GetSubjectRootSegmentName result = retimingClient.GetSubjectRootSegmentName(new ViconString(subjectName));
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
		//System.out.println("Get segment name: "+SegmentName);
		return SegmentName;
	}

}
