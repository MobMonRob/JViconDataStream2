/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.rahmlab.vicon.datastream.maintenance;

import de.dhbw.rahmlab.vicon.datastream.maintenance.UnusedGluegenClasses;
import java.util.List;

/**
 *
 * @author fabian
 */
public class DeleteUnusedGluegenClassFiles {

	public static void start() {
		List<String> unusedClassesNames = UnusedGluegenClasses.get_unusedGluegenClassesNames();

		System.out.println("-------------");
		System.out.println("---UnusedClasses:");
		unusedClassesNames.forEach(s -> System.out.println(s));

		//Class.forName("com.jogamp.common.net.UriQueryProps").getProtectionDomain().getCodeSource().getLocation().getPath();
	}
}
