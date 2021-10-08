package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.impl.ViconStringToJavaStringTest;
import de.dhbw.rahmlab.vicon.datastream.impl.ViconConnectTest;
import de.dhbw.rahmlab.vicon.datastream.impl.JavaStringToViconStringTest;
import de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient;

/**
 *
 * @author Oliver Rettig
 */
public class ViconStringWrapperTest {

    public static void main(String argv[]) throws InterruptedException {
        //viconStringToJavaStringTest();
        javaStringToViconStringTest();
        //viconConnectTest();
        //testtest();

        //DeleteUnusedGluegenJavaFiles.delete();
    }

    public static void testtest() {
        DataStreamClient client = new DataStreamClient();
        client.connect("192.168.10.1", 4000l);
        System.out.println(client.getCameraName(0));
    }

    public static void javaStringToViconStringTest() {
        JavaStringToViconStringTest test = new JavaStringToViconStringTest();

        String javaInputString = "javaInputString";

        // Achtung: scheint aktuell zumindest auf einigen Windows-Systemen nicht zu funktionieren...
        // Ausgabe bleibt dann leer, auf Fabians Windows-System reproduzierbar
        //FIXME
        // einziger Unterschied zur funktionsfähigen Version: 
        // Versionssprung im Crosscompiler hat stattgefunden 
        // - unter linux geht es 
        // - swig-Konfiguration falsch?
        String output = test.testJavaStringInput(javaInputString);
        System.out.println("testJavaStringInput Output: " + output);

        String referenceOutput = test.testJavaStringReferenceInput(javaInputString);
        System.out.println("testJavaStringReferenceInput Output: " + referenceOutput);
    }

    public static void viconConnectTest() {
        System.out.println("enter viconConnectTest()");

        ViconConnectTest connectTest = new ViconConnectTest();
        //Output_Connect output = connectTest.testConnect();

        //Nur falscher Port gibt clientConnectionFailed
        String output = connectTest.testConnectGiven("192.168.10.1:51001");
        //51001
        System.out.println("Result: " + output);

        System.out.println("leave viconConnectTest()");
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
