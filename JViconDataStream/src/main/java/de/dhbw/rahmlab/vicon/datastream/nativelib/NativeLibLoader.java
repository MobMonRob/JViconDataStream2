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
    //private static List<DynamicLibraryBundle> dynamicLibraryBundles;
    private static DynamicLibraryBundle dynamicLibraryBundle;

    public static void load() {
        if (!isLoaded) {
            loadActually();
            isLoaded = true;
        }
    }

    private static void loadActually() {
        //System.loadLibrary("jViconDataStreamSDK");

        dynamicLibraryBundle = new DynamicLibraryBundle(new JViconDataStreamBundleInfo());
        if (!dynamicLibraryBundle.isLibComplete()) {
            System.out.println("Native lib loading failed: " + dynamicLibraryBundle.getBundleInfo().getClass().getCanonicalName());
        } else {
            System.out.println("Native lib loading succeeded: " + dynamicLibraryBundle.getBundleInfo().getClass().getCanonicalName());
        }
        
        

        /*
        List<DynamicLibraryBundleInfo> dynamicLibraryBundleInfos = new ArrayList<DynamicLibraryBundleInfo>();
        dynamicLibraryBundleInfos.add(new JViconDataStreamBundleInfo());
        dynamicLibraryBundleInfos.add(new ViconDataStreamSDKBundleInfo());

        dynamicLibraryBundles = dynamicLibraryBundleInfos
            .stream()
            .map(bi -> new DynamicLibraryBundle(bi))
            .collect(Collectors.toCollection(ArrayList::new));

        dynamicLibraryBundles.forEach(b -> {
            if (!b.isLibComplete()) {
                System.out.println("Native lib loading failed: " + b.getBundleInfo().getClass().getCanonicalName());
            } else {
                System.out.println("Native lib loading succeeded: " + b.getBundleInfo().getClass().getCanonicalName());
            }
        });
         */
    }

    /*
    static {
            NativeLibLoader.load();
    }
     */
}
