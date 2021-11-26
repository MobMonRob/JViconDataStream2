package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.impl.ViconStringToJavaStringTest;
import de.dhbw.rahmlab.vicon.datastream.impl.JavaStringToViconStringTest;

/**
 *
 * @author Oliver Rettig
 */
public class ViconStringWrapperTest {

    public static void main(String argv[]) throws InterruptedException {
        //viconStringToJavaStringTest();
        javaStringToViconStringTest();
    }

    public static void javaStringToViconStringTest() {
        JavaStringToViconStringTest test = new JavaStringToViconStringTest();

        String javaInputString = "javaInputString";

        String testJavaStringInput = test.testJavaStringInput(javaInputString);
        System.out.println("testJavaStringInput Output: " + testJavaStringInput);

        String testJavaStringInputConst = test.testJavaStringInputConst(javaInputString);
        System.out.println("testJavaStringInputConst Output: " + testJavaStringInputConst);

        String testJavaStringInputPointer = test.testJavaStringInputPointer(javaInputString);
        System.out.println("testJavaStringInputPointer Output: " + testJavaStringInputPointer);

        String testJavaStringInputPointerConst = test.testJavaStringInputPointerConst(javaInputString);
        System.out.println("testJavaStringInputPointerConst Output: " + testJavaStringInputPointerConst);

        String testJavaStringInputReference = test.testJavaStringInputReference(javaInputString);
        System.out.println("testJavaStringInputReference Output: " + testJavaStringInputReference);

        String testJavaStringInputReferenceConst = test.testJavaStringInputReferenceConst(javaInputString);
        System.out.println("testJavaStringInputReferenceConst Output: " + testJavaStringInputReferenceConst);
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
