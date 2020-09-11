package de.dhbw.rahmlab.vicon.datastream.test;

/*
import de.dhbw.rahmlab.vicon.datastream.api.Version;
import de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient;
 */
import de.dhbw.rahmlab.vicon.datastream.api.NativeLibLoader;

/**
 *
 * @author Oliver Rettig
 */
public class SimpleTest {

	static {
		NativeLibLoader.load();
	}

	public static void main(String argv[]) throws InterruptedException {
		viconStringTest();
	}

	public static void viconStringTest() {
		de.dhbw.rahmlab.vicon.datastream.api.impl.ViconStringTest viconStringTest = new de.dhbw.rahmlab.vicon.datastream.api.impl.ViconStringTest();
		String test = viconStringTest.getViconStringHallo();
		System.out.println("ViconStringTest: " + test);
	}

	/*
	public static void versionTest() {
		DataStreamClient client = new DataStreamClient();
		//ViconDataStreamSDKRetimingClient retimingClient = new ViconDataStreamSDKRetimingClient();

		Version version = client.getVersion();
		String stringMajor = String.valueOf(version.getMajor());
		String stringMinor = String.valueOf(version.getMinor());
		String stringPoint = String.valueOf(version.getPoint());
		String completeVersion = stringMajor + "." + stringMinor + "." + stringPoint;
		System.out.println("Vicon SDK Version: " + completeVersion);
	}
	 */
}
