/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.rahmlab.vicon.datastream.maintenance;

import de.dhbw.rahmlab.vicon.datastream.maintenance.UnusedGluegenClasses;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabian
 */
public class DeleteUnusedGluegenClassFiles {

	public static void start() {
		List<String> unusedClassesNames = UnusedGluegenClasses.get_unusedGluegenClassesNames();

		System.out.println("-------------");
		System.out.println("---UnusedClasses:");
		//unusedClassesNames.forEach(s -> System.out.println(s));

		//System.out.println(bundleInfo.getSource().getURL());

	}
}
