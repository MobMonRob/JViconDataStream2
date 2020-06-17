/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.mobmonrob.vicon.datastreamapi.test;

import de.dhbw.mobmonrob.vicon.datastreamapi.api.Version;
import de.dhbw.mobmonrob.vicon.datastreamapi.api.ViconDataStreamSDKClient;
import de.dhbw.mobmonrob.vicon.datastreamapi.api.ViconDataStreamSDKRetimingClient;

/**
 *
 * @author mobmonrob
 */
public class Test2 {

	public static void main(String argv[]) throws InterruptedException {
		ViconDataStreamSDKClient client = new ViconDataStreamSDKClient();
		//ViconDataStreamSDKRetimingClient retimingClient = new ViconDataStreamSDKRetimingClient();

		Version version = client.getVersion();
		System.out.println(version.toString());

		/*
		String hostname = "localhost";
        client.connect(hostname);
        client.getFrame(true);
        System.out.println("Subject Count = " + client.getSubjectCount());

        int SubjectIndex = 1;
        String SubjectName = client.getSubjectName(SubjectIndex);
        //System.out.println("subject name= "+SubjectName);
        //retimingClient.connect(hostname);
        //  retimingClient.updateFrame();
        // System.out.println("Subject Count = "+ retimingClient.getSubjectCount());

        //retimingClient.waitForFrame();
        //  SubjectName=retimingClient.getSubjectName(SubjectIndex);
        //System.out.println("subject name= "+SubjectName);
		 */
	}
}
