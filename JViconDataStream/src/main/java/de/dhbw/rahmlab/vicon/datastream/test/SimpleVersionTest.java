package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.api.Version;
import de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient;
import de.dhbw.rahmlab.vicon.datastream.api.NativeLibLoader;

/**
 *
 * @author Oliver Rettig
 */
public class SimpleVersionTest {
	static {
		NativeLibLoader.load();
	}
	
	public static void main(String argv[]) throws InterruptedException {
		DataStreamClient client = new DataStreamClient();
		//ViconDataStreamSDKRetimingClient retimingClient = new ViconDataStreamSDKRetimingClient();

		Version version = client.getVersion();
		String stringMajor = String.valueOf(version.getMajor());
		String stringMinor = String.valueOf(version.getMinor());
		String stringPoint = String.valueOf(version.getPoint());
		String completeVersion = stringMajor + "." + stringMinor + "." + stringPoint;
		System.out.println("Vicon SDK Version: " + completeVersion);
	}
}
