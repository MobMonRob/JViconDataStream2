package de.dhbw.rahmlab.vicon.datastream.nativelib;

//import com.nativeutils.NativeUtils;
//import java.io.IOException;
import com.jogamp.common.jvm.JNILibLoaderBase;
import com.jogamp.common.os.DynamicLibraryBundle;
import com.jogamp.common.util.cache.TempJarCache;

/**
 * Testweise wieder auskommentiert.
 *
 * @author fabian
 */
public class NativeLibLoader {

	private static boolean isLoaded = false;
	private static DynamicLibraryBundle dlb;

	public static void load() {
		if (!isLoaded) {
			loadActually();
			isLoaded = true;
		}
	}

	private static void loadActually() {
		//System.loadLibrary("jViconDataStreamSDK");

		dlb = new DynamicLibraryBundle(new Test1DynLibBundleInfo());
		if (!dlb.isLibComplete()) {
			System.out.println("DynamicLibraryBundle failed");
		} else {
			System.out.println("DynamicLibraryBundle succeeded");
		}

		/*try {
                    NativeUtils.loadLibraryFromJar("/lib/linux-x86_64/libjViconDataStreamSDK.so");
            } catch (IOException e) {
                    System.err.println("Native code library failed to load. \n" + e);
                    System.exit(1);
            }*/
	}

	/*
	static {
		NativeLibLoader.load();
	}
	 */
}
