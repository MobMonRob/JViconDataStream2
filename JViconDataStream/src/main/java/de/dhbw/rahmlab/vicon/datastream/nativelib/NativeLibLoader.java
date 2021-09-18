package de.dhbw.rahmlab.vicon.datastream.nativelib;

import de.dhbw.rahmlab.vicon.datastream.impl.ViconDataStreamSDKSwigJNI;

/**
 * @author fabian
 */
public class NativeLibLoader {

    private static boolean isLoaded = false;

    public static void load() {
        if (!isLoaded) {
            loadActually();
            isLoaded = true;
        }
    }

    private static void loadActually() {
        try {
            de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader.init(true);
            de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader nativeLibLoader = de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader.getInstance();
            nativeLibLoader.load(ViconDataStreamSDKSwigJNI.class);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
