package de.dhbw.rahmlab.vicon.datastream.nativelib;

import de.dhbw.rahmlab.nativelibloader.impl.com.jogamp.common.jvm.JNILibLoaderBase;
import de.dhbw.rahmlab.nativelibloader.impl.com.jogamp.common.os.DynamicLibraryBundle;
import de.dhbw.rahmlab.nativelibloader.impl.com.jogamp.common.os.DynamicLibraryBundleInfo;
import de.dhbw.rahmlab.nativelibloader.impl.com.jogamp.common.os.Platform;

import de.dhbw.rahmlab.vicon.datastream.impl.ViconDataStreamSDKSwigJNI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fabian
 */
public class NativeLibLoader {

    private static boolean isLoaded = false;
    private static List<DynamicLibraryBundle> dynamicLibraryBundles;

    public static void load() {
        if (!isLoaded) {
            loadActually();
            isLoaded = true;
        }
    }

    private static void loadActually() {
        //System.setProperty("jogamp.debug", "true"); //Extremely helpful for debugging!

        List<DynamicLibraryBundleInfo> dynamicLibraryBundleInfos = new ArrayList<>();
        dynamicLibraryBundleInfos.add(new JViconDataStreamBundleInfo());

        //Inits JarCache. Fetches gluegen_rt.so
        Platform.initSingleton();

        /**
         * Hier werden die .so Dateien aus einem JAR in den JarCache geladen.
         *
         * Die Klasse in classesFromJavaJars fungiert dabei als ein Marker. In
         * dem JAR, wo sich die korrespondierende .class Datei befindet, wird
         * nach .so Dateien gesucht. Alle dort vorhandenen .so Dateien werden in
         * den JarCache geladen. Es muss sich dabei nicht um die Klasse handeln,
         * die mit native Aufrufen von den .so Dateien abhängig ist.
         *
         * Wenn die richtigen .so Dateien schon aus einem JAR in
         * Platform.initSingleton() geladen wurden (wegen gluegen_rt.so), dann
         * nicht unbedingt notwendig.
         *
         * Debug Info: Dort werden die .so Dateien geladen:
         * //JNILibLoaderbase::addNativeJarLibsImpl(...) [Line 186] (gleiche
         * Datei) Da werden sie dann in den JarCache geladen: //ok =
         * TempJarCache.addNativeLibs(classFromJavaJar, nativeJarURI,
         * nativeLibraryPath); [Line 229]
         */
        final Class[] classesFromJavaJars = new Class[]{ViconDataStreamSDKSwigJNI.class};
        JNILibLoaderBase.addNativeJarLibs(classesFromJavaJars, null);

        dynamicLibraryBundles = dynamicLibraryBundleInfos
            .stream()
            .map(bi -> {
                //Hier werden die .so Datein (vom JarCache) in die JVM geladen.
                return new DynamicLibraryBundle(bi);
            })
            .collect(Collectors.toCollection(ArrayList::new));

        dynamicLibraryBundles.forEach(b -> {
            if (!b.isLibComplete()) {
                System.out.println("Native lib loading failed: " + b.getBundleInfo().getClass().getCanonicalName());
            } else {
                System.out.println("Native lib loading succeeded: " + b.getBundleInfo().getClass().getCanonicalName());
            }
        });
    }

    /*
    static {
            NativeLibLoader.load();
    }
     */
}
