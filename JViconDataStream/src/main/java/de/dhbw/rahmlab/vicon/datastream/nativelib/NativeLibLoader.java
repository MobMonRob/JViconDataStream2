package de.dhbw.rahmlab.vicon.datastream.nativelib;

import de.dhbw.rahmlab.vicon.datastream.impl.ViconDataStreamSDKSwigJNI;
import java.util.ArrayList;
import java.util.List;

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
        List<String> glueLibNames = new ArrayList<>();
        glueLibNames.add("jViconDataStreamSDK");

        de.dhbw.rahmlab.nativelibloader.api.NativeLibLoader.load(glueLibNames, ViconDataStreamSDKSwigJNI.class);
    }
}

/*
//Verwendung in Klassen, ide hiervon abhängen:
    static {
        NativeLibLoader.load();
    }
 */
