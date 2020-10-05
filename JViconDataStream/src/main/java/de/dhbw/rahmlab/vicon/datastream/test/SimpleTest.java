package de.dhbw.rahmlab.vicon.datastream.test;

/*
import de.dhbw.rahmlab.vicon.datastream.api.Version;
import de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient;
 */
//import de.dhbw.rahmlab.vicon.datastream.maintenance.DeleteUnusedGluegenJavaFiles;
import de.dhbw.rahmlab.vicon.datastream.nativelib.NativeLibLoader;

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
        //DeleteUnusedGluegenJavaFiles.delete();
    }

    public static void viconStringTest() {
        de.dhbw.rahmlab.vicon.datastream.impl.ViconStringTest viconStringTest = new de.dhbw.rahmlab.vicon.datastream.impl.ViconStringTest();
        String viconString = viconStringTest.getViconStringHallo();
        String charString = viconStringTest.getCharStringHallo();
        String stdString = viconStringTest.getStdStringHallo();
        System.out.println("viconString: " + viconString);
        System.out.println("charString: " + charString);
        System.out.println("stdString: " + stdString);
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
