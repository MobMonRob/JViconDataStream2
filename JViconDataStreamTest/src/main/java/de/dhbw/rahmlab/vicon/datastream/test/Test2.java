package de.dhbw.rahmlab.vicon.datastream.test;

import de.dhbw.rahmlab.vicon.datastream.api.Version;
import de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient;

/**
 *
 * @author Oliver Rettig
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
