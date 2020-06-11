/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.mobmonrob.vicon.datastreamapi.api;

import de.dhbw.mobmonrob.vicon.datastreamapi.impl.CString;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_Connect;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_Disconnect;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_EnableLightweightSegmentData;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSubjectCount;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSubjectName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetSubjectRootSegmentName;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_UpdateFrame;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_WaitForFrame;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Result_Enum;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.RetimingClient;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mobmonrob
 */
public class ViconDataStreamSDKRetimingClient {
    private final RetimingClient retimingClient;
     static {
        try {
            // Adding a directory to java.library.path here will not change anything.
            // System.loadLibrary will still look in the directories listed in java.library.path
            // as it existed at the very start of the program.
            // The extra directory path added to java.library.path will not
            // be searched by loadLibrary.
            //String libpath = System.getProperty("java.library.path");
            //libpath = libpath + ";V:\\Hardware\\Platformen\\Mir\\PROJECTS\\ViconDataStream\\libs";
            //System.setProperty("java.library.path",libpath);
        
           // System.out.println(System.getProperty("java.library.path"));
            System.loadLibrary("ViconDataStreamClientSDK");
        } catch (UnsatisfiedLinkError e) {
          System.err.println("Native code library failed to load. See the chapter on Dynamic Linking Problems in the SWIG Java documentation for help.\n" + e);
          System.exit(1);
        }
    }
     
    /**
     * You can create many instances of the Vicon DataStream Client which can 
     * connect to multiple Vicon DataStream Servers.
     */
    public ViconDataStreamSDKRetimingClient()
    {
        retimingClient= new RetimingClient();
    }
    
    
     public void connect(String hostname){
         while (!isConnected()){
            
            Output_Connect result = retimingClient.Connect(new CString(hostname));
         
            //Output_ConnectToMulticast result = client.ConnectToMulticast(new CString(hostname), new CString(hostname));
            
            // tritt seltsamerweise auch für localhost ab und zu auf
            //if (result.getResult() == Result_Enum.InvalidHostName) 
            //    throw new RuntimeException("connect() but invalid hostname \""+hostname+"\"!");
            
            //if (result.getResult() == Result_Enum.ClientAlreadyConnected) 
              //  throw new RuntimeException("Client is Already Connected ");
            //if (result.getResult() == Result_Enum.ClientConnectionFailed) 
                //throw new RuntimeException("Client Connection is Failed ");
            
            // Result.Success --> beendet die while schleife
            // Result.ClientAlreadyConnected --> kann innerhalb der while schleife nicht auftreten
            // Result.ClientConnectionFailed --> dafür ist die while schleife da
            
            //System.out.println("connect result = \""+result.getResult().toString()+"\"!");
        
            try {
                 Thread.sleep(100);
            } catch (InterruptedException ex) {
                 Logger.getLogger(ViconDataStreamSDKClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
      public boolean isConnected(){
        return retimingClient.IsConnected().getConnected();
    }
       public boolean disconnect(){
        Output_Disconnect result = retimingClient.Disconnect();
        if (result.getResult().equals(Result_Enum.Success)) {
            return true;
        } else if (result.getResult().equals(Result_Enum.NotConnected)) {
            System.out.println("disconnect: but client was not connected!");
        }
        return false;
    }
        public Version getVersion(){
        return new Version(retimingClient.GetVersion());
    }
    public void enableLightweightSegmentData (){
        Output_EnableLightweightSegmentData result = retimingClient.EnableLightweightSegmentData ();
        System.out.println("Enable Light weight Segment Data : "+result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("enableLightweightSegmentData () but client was not connected!");
        }
    }
     public boolean isLightweightSegmentDataEnabled(){
        return retimingClient.IsLightweightSegmentDataEnabled().getEnabled();
    }
        
     public void updateFrame (){
        Output_UpdateFrame result = retimingClient.UpdateFrame ();
        System.out.println("Enable Light weight Segment Data : "+result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("UpdateFrame () but client was not connected!");
        }
    }
      public void waitForFrame (){
        Output_WaitForFrame result = retimingClient.WaitForFrame ();
        System.out.println("Enable Light weight Segment Data : "+result.getResult().toString());
        if (result.getResult().equals(Result_Enum.NotConnected)) {
            throw new RuntimeException("WaitForFrame() but client was not connected!");
        }
    }
 public long getSubjectCount(){
        Output_GetSubjectCount result = retimingClient.GetSubjectCount();
        //System.out.println("Get subject count: "+result.getResult().toString());
        if (result.getResult() == Result_Enum.NoFrame)
            throw new RuntimeException("getSubjectCount() invoked but no frame available!");
        if (result.getResult() == Result_Enum.NotConnected) 
             throw new RuntimeException("getSubjectCount() but client is not connected!!");
        return result.getSubjectCount();
    }
    
    /**
     * Return the name of a subject. 
     * 
     * This can be passed into segment and marker functions.<p>
     * 
     * See Also : GetSubjectCount<p>
     * 
     * @param subjectIndex between 0 and getSubjectCount()-1
     * @return The name of the subject.
     * @throw new RuntimeException if subject index is invalid.
     * @throw IllegalArgumentException, if subjectIndex <0
     */
    public String getSubjectName(long subjectIndex){
        if (subjectIndex <0) throw new IllegalArgumentException("getSubjectName() subjectIndex >=0 is needed!");
        System.out.println("getSubjectName() reached");
        long subjectCount = getSubjectCount();
        System.out.println("getSubjectCount() subject count = "+subjectCount);
        if (subjectIndex >= subjectCount){
            throw new IllegalArgumentException("getSubjectName() subjectIndex >=subject count is needed!");
        }
        System.out.println("getSubsectName() index = "+subjectIndex);
        Output_GetSubjectName result = retimingClient.GetSubjectName(subjectIndex);
        
        System.out.println("getSubsectName() index = "+subjectIndex);//warum?
        
        if (result.getResult() == Result_Enum.InvalidIndex) 
            throw new RuntimeException("getSubjectName() but subjectIndex is invalid!");
        if (result.getResult() == Result_Enum.NoFrame) 
             throw new RuntimeException("getSubjectName() but no frame available!");
        if (result.getResult() == Result_Enum.NotConnected) 
             throw new RuntimeException("getSubjectName() but client is not connected!!");
        //String SubjectName = null;
        //if (result.getResult()==Result_Enum.Success){
        String SubjectName = result.getSubjectName().toString();
        //System.out.println("Get subject name: "+result.getResult().toString());
        return SubjectName;
    }
    /*
    Return the name of the root segment for a specified subject. 
    This can be passed into segment functions.
    The root segment is the ancestor of all other segments in the subject.
    */
    public String getSubjectRootSegmentName(String subjectName){    
        Output_GetSubjectRootSegmentName result = retimingClient.GetSubjectRootSegmentName(new CString(subjectName));
        if (result.getResult() == Result_Enum.InvalidSubjectName) 
             throw new RuntimeException("GetSubjectRootSegmentName() but subjectName \""+subjectName+"\" is invalid!");
        if (result.getResult() == Result_Enum.NotConnected) 
             throw new RuntimeException("GetSubjectRootSegmentName() but client is not connected!!");
        if (result.getResult() == Result_Enum.NoFrame) 
             throw new RuntimeException("GetSubjectRootSegmentName() but no frame available!");
        if (result.getResult() == Result_Enum.InvalidIndex) 
             throw new RuntimeException("GetSubjectRootSegmentName() but segmentIndex \"\" is invalid!");
        String SegmentName = result.getSegmentName().toString();
        //System.out.println("Get segment name: "+SegmentName);
        return SegmentName;
    }
    

}
