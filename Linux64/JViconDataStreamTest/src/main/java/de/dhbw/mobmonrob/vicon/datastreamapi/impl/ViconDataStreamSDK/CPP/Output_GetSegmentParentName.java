/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP;

public class Output_GetSegmentParentName {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Output_GetSegmentParentName(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Output_GetSegmentParentName obj) {
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
        de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.delete_ViconDataStreamSDK_CPP_Output_GetSegmentParentName(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setResult(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Result.Enum value) {
    de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_GetSegmentParentName_Result_set(swigCPtr, this, value.swigValue());
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Result.Enum getResult() {
    return de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Result.Enum.swigToEnum(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_GetSegmentParentName_Result_get(swigCPtr, this));
  }

  public void setSegmentName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String value) {
    de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_GetSegmentParentName_SegmentName_set(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(value), value);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String getSegmentName() {
    long cPtr = de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_Output_GetSegmentParentName_SegmentName_get(swigCPtr, this);
    return (cPtr == 0) ? null : new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String(cPtr, false);
  }

  public Output_GetSegmentParentName() {
    this(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.new_ViconDataStreamSDK_CPP_Output_GetSegmentParentName(), true);
  }

}
