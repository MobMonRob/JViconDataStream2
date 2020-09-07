/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.rahmlab.vicon.datastream.api;

import com.nativeutils.NativeUtils;
import java.io.IOException;

/**
 *
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
			NativeUtils.loadLibraryFromJar("/lib/linux-x86_64/libjViconDataStreamSDK.so");
		} catch (IOException e) {
			System.err.println("Native code library failed to load. \n" + e);
			System.exit(1);
		}
	}

	/*
	static {
		NativeLibLoader.load();
	}
	 */
}
