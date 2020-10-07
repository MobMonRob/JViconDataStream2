package de.dhbw.rahmlab.vicon.datastream.nativelib;

import com.jogamp.common.os.DynamicLibraryBundle;
import com.jogamp.common.os.DynamicLibraryBundleInfo;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fabian
 */
public class NativeLibLoader {

    private static boolean isLoaded = false;
    private static List<DynamicLibraryBundle> dynamicLibraryBundles;
    //private static DynamicLibraryBundle dynamicLibraryBundle;

    public static void load() {
        //Die Funktionalität gibt es für einzelne Libs schon im gluegen code.
        //Hier nochmal für alle zusammen.
        if (!isLoaded) {
            loadActually();
            isLoaded = true;
        }
    }

    private static void loadActually() {
        //System.loadLibrary("jViconDataStreamSDK");

        System.setProperty("jogamp.debug.JNILibLoader", "true");

        //dynamicLibraryBundle = new DynamicLibraryBundle(new JViconDataStreamBundleInfo());
        List<DynamicLibraryBundleInfo> dynamicLibraryBundleInfos = new ArrayList<DynamicLibraryBundleInfo>();
        dynamicLibraryBundleInfos.add(new ViconDataStreamSDKBundleInfo()); //Als erstes
        dynamicLibraryBundleInfos.add(new JViconDataStreamBundleInfo()); //Als zweites

        dynamicLibraryBundles = dynamicLibraryBundleInfos
            .stream()
            .map(bi -> {
                System.out.println("-----------------------------");
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
