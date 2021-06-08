package de.dhbw.rahmlab.vicon.datastream.nativelib;

import de.dhbw.rahmlab.vicon.datastream.impl.ViconDataStreamSDKSwigJNI;
import java.util.Arrays;

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
        de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader nativeLibLoader = de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader.getInstanceAndSetDebugIfFirstInvokation(true);

        String[] libNames = new String[0];

        if (nativeLibLoader.onWindows()) {
            libNames = new String[]{
                "winpthread-1",
                "gcc_s_seh-1",
                "stdc++-6",
                "boost",
                "ViconDataStreamSDK_CPP",
                "jViconDataStreamSDK"
            };
        } else if (nativeLibLoader.onLinux()) {
            libNames = new String[]{
                "boost",
                "ViconDataStreamSDK_CPP",
                "jViconDataStreamSDK"
            };
        } else {
            System.err.println("OS not supported!");
            System.exit(1);
        }

        nativeLibLoader.load(Arrays.asList(libNames), ViconDataStreamSDKSwigJNI.class);
    }
}

/*
//Verwendung in Klassen, die hiervon abhängen:
    static {
        NativeLibLoader.load();
    }
 */
