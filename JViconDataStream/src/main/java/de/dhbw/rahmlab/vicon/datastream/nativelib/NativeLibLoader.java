package de.dhbw.rahmlab.vicon.datastream.nativelib;

import com.jogamp.common.os.DynamicLibraryBundle;

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
			System.out.println("Native lib loading failed");
		} else {
			System.out.println("Native lib loading succeeded");
		}
	}

	/*
	static {
		NativeLibLoader.load();
	}
	 */
}
