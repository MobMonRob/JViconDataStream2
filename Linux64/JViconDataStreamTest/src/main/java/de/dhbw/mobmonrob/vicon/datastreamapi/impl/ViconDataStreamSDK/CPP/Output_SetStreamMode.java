/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP;

public class Output_SetStreamMode extends de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_SimpleResult {
  private transient long swigCPtr;

  protected Output_SetStreamMode(long cPtr, boolean cMemoryOwn) {
    super(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_SetStreamMode_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Output_SetStreamMode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.delete_ViconDataStreamSDK_CPP_Output_SetStreamMode(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Output_SetStreamMode() {
    this(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.new_ViconDataStreamSDK_CPP_Output_SetStreamMode(), true);
  }

}
