/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.rahmlab.jvicondatastreamtest;

import de.dhbw.rahmlab.vicon.datastream.nativelib.NativeLibLoader;
import com.jogamp.common.util.cache.TempJarCache;
import com.jogamp.common.jvm.JNILibLoaderBase;
import de.dhbw.rahmlab.vicon.datastream.impl.ViconDataStreamSDKSwigJNI;

/**
 *
 * @author fabian
 */
public class DebugJar {

    public static void main(String argv[]) {
        //System.setProperty("jogamp.debug.JNILibLoader", "true");
        System.setProperty("jogamp.debug", "true");

        //Sollten diese Aufrufe nicht in NativeLibLoader.load() drin sein?
        //Gibt das keine Probleme, wenn man nicht aus der JAR aufruft, sondern von den .class Dateien in /target/ ?
        
        TempJarCache.initSingleton();

        //Es sollte Teil der API sein, die native Klasse zusammen mit der Bibliothek (in JViconDataStreamBundleInfo) auszuliefern.
        final Class[] classesFromJavaJars = new Class[]{ViconDataStreamSDKSwigJNI.class};
        JNILibLoaderBase.addNativeJarLibs(classesFromJavaJars, null);

        NativeLibLoader.load();
    }
}
