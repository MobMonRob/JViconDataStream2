package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.nativelib.NativeLibLoader;
import de.dhbw.rahmlab.vicon.datastream.impl.ViconStringTest;
import de.dhbw.rahmlab.vicon.datastream.impl.ViconConnectTest;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_Connect;

/**
 *
 * @author Oliver Rettig
 */
public class SimpleTest {

    static {
        NativeLibLoader.load();
    }

    public static void main(String argv[]) throws InterruptedException {
        //viconStringTest();
        viconConnectTest();
        //DeleteUnusedGluegenJavaFiles.delete();
    }

    public static void viconConnectTest() {
        ViconConnectTest connectTest = new ViconConnectTest();
        Output_Connect output = connectTest.testConnect();
        System.out.println("Result: " + output.getResult().toString());
    }

    public static void viconStringTest() {
        ViconStringTest viconStringTest = new ViconStringTest();
        String viconString = viconStringTest.getViconStringHallo();
        String charString = viconStringTest.getCharStringHallo();
        String stdString = viconStringTest.getStdStringHallo();
        System.out.println("viconString: " + viconString);
        System.out.println("charString: " + charString);
        System.out.println("stdString: " + stdString);
    }
}
