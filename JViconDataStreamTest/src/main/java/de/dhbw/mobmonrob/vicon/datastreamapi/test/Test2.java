/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.mobmonrob.vicon.datastreamapi.test;

import de.dhbw.rahmlab.vicon.datastreamapi.api.Version;
import de.dhbw.rahmlab.vicon.datastreamapi.api.DataStreamClient;
import de.dhbw.rahmlab.vicon.datastreamapi.api.DataStreamRetimingClient;

/**
 *
 * @author mobmonrob
 */
public class Test2 {

	public static void main(String argv[]) throws InterruptedException {
		DataStreamClient client = new DataStreamClient();
		//ViconDataStreamSDKRetimingClient retimingClient = new ViconDataStreamSDKRetimingClient();

		Version version = client.getVersion();
		String stringMajor = String.valueOf(version.getMajor());
		String stringMinor = String.valueOf(version.getMinor());
		String stringPoint = String.valueOf(version.getPoint());
		String completeVersion = stringMajor + "." + stringMinor + "." + stringPoint;
		System.out.println(completeVersion);

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
