/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.rahmlab.jvicondatastreamtest;

import de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabian
 */
public class DebugJar {

    static {
        //NativeLibLoader.load("", DebugJar.class);
    }

    public static void main(String argv[]) {
        //System.setProperty("jogamp.debug", "true"); //Extremely helpful for debugging!

        List<String> glueLibNames = new ArrayList<>();
        glueLibNames.add("gluegen_rt");

        NativeLibLoader.load(glueLibNames, DebugJar.class);

        //ViconStringWrapperTest.javaStringToViconStringTest();
    }
}
