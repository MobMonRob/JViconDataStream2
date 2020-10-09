package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.nativelib.NativeLibLoader;
import de.dhbw.rahmlab.vicon.datastream.impl.ViconStringToJavaStringTest;
import de.dhbw.rahmlab.vicon.datastream.impl.ViconConnectTest;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_Connect;
import de.dhbw.rahmlab.vicon.datastream.impl.JavaStringToViconStringTest;

/**
 *
 * @author Oliver Rettig
 */
public class SimpleTest {

    static {
        NativeLibLoader.load();
    }

    public static void main(String argv[]) throws InterruptedException {
        //viconStringToJavaStringTest();
        javaStringToViconStringTest();
        //viconConnectTest();
        //DeleteUnusedGluegenJavaFiles.delete();
    }

    public static void javaStringToViconStringTest() {
        JavaStringToViconStringTest test = new JavaStringToViconStringTest();

        String javaInputString = "asdf";

        String output = test.testJavaStringInput(javaInputString);
        System.out.println("javaStringToViconStringTest Output: " + output);
    }

    public static void viconConnectTest() {
        ViconConnectTest connectTest = new ViconConnectTest();
        Output_Connect output = connectTest.testConnect();
        System.out.println("Result: " + output.getResult().toString());
    }

    public static void viconStringToJavaStringTest() {
        ViconStringToJavaStringTest viconStringTest = new ViconStringToJavaStringTest();
        String viconString = viconStringTest.getViconStringHallo();
        String charString = viconStringTest.getCharStringHallo();
        String stdString = viconStringTest.getStdStringHallo();
        System.out.println("viconString: " + viconString);
        System.out.println("charString: " + charString);
        System.out.println("stdString: " + stdString);
    }
}
