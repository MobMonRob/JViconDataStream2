/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.rahmlab.jvicondatastreamtest;

import de.dhbw.rahmlab.vicon.datastream.nativelib.NativeLibLoader;
import de.dhbw.rahmlab.vicon.datastream.test.ViconStringWrapperTest;

/**
 *
 * @author fabian
 */
public class DebugJar {

    static {
        NativeLibLoader.load();
    }

    public static void main(String argv[]) {
        ViconStringWrapperTest.javaStringToViconStringTest();
    }
}
