/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP;

public class Output_GetIsVideoCamera {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Output_GetIsVideoCamera(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Output_GetIsVideoCamera obj) {
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
        de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.delete_ViconDataStreamSDK_CPP_Output_GetIsVideoCamera(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setResult(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Result.Enum value) {
    de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_GetIsVideoCamera_Result_set(swigCPtr, this, value.swigValue());
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Result.Enum getResult() {
    return de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Result.Enum.swigToEnum(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_GetIsVideoCamera_Result_get(swigCPtr, this));
  }

  public void setIsVideoCamera(boolean value) {
    de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_GetIsVideoCamera_IsVideoCamera_set(swigCPtr, this, value);
  }

  public boolean getIsVideoCamera() {
    return de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_GetIsVideoCamera_IsVideoCamera_get(swigCPtr, this);
  }

  public Output_GetIsVideoCamera() {
    this(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.new_ViconDataStreamSDK_CPP_Output_GetIsVideoCamera(), true);
  }

}
