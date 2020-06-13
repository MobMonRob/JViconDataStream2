/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP;

public class RetimingClient extends de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.IDataStreamClientBase {
  private transient long swigCPtr;

  protected RetimingClient(long cPtr, boolean cMemoryOwn) {
    super(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RetimingClient obj) {
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
        de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.delete_ViconDataStreamSDK_CPP_RetimingClient(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RetimingClient() {
    this(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.new_ViconDataStreamSDK_CPP_RetimingClient(), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetVersion GetVersion() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetVersion(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetVersion(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_Connect Connect(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String HostName, double FrameRate) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_Connect(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_Connect__SWIG_0(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(HostName), HostName, FrameRate), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_Connect Connect(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String HostName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_Connect(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_Connect__SWIG_1(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(HostName), HostName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_Disconnect Disconnect() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_Disconnect(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_Disconnect(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_IsConnected IsConnected() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_IsConnected(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_IsConnected(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_EnableLightweightSegmentData EnableLightweightSegmentData() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_EnableLightweightSegmentData(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_EnableLightweightSegmentData(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_DisableLightweightSegmentData DisableLightweightSegmentData() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_DisableLightweightSegmentData(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_DisableLightweightSegmentData(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_IsLightweightSegmentDataEnabled IsLightweightSegmentDataEnabled() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_IsLightweightSegmentDataEnabled(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_IsLightweightSegmentDataEnabled(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_SetAxisMapping SetAxisMapping(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Direction.Enum XAxis, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Direction.Enum YAxis, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Direction.Enum ZAxis) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_SetAxisMapping(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_SetAxisMapping(swigCPtr, this, XAxis.swigValue(), YAxis.swigValue(), ZAxis.swigValue()), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetAxisMapping GetAxisMapping() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetAxisMapping(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetAxisMapping(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_UpdateFrame UpdateFrame(double Offset) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_UpdateFrame(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_UpdateFrame__SWIG_0(swigCPtr, this, Offset), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_UpdateFrame UpdateFrame() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_UpdateFrame(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_UpdateFrame__SWIG_1(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_WaitForFrame WaitForFrame() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_WaitForFrame(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_WaitForFrame(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSubjectCount GetSubjectCount() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSubjectCount(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSubjectCount(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSubjectName GetSubjectName(long SubjectIndex) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSubjectName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSubjectName(swigCPtr, this, SubjectIndex), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSubjectRootSegmentName GetSubjectRootSegmentName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSubjectRootSegmentName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSubjectRootSegmentName(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentCount GetSegmentCount(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentCount(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentCount(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentName GetSegmentName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, long SegmentIndex) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentName(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, SegmentIndex), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentChildCount GetSegmentChildCount(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentChildCount(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentChildCount(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentChildName GetSegmentChildName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName, long SegmentIndex) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentChildName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentChildName(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName, SegmentIndex), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentParentName GetSegmentParentName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentParentName(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentParentName(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticTranslation GetSegmentStaticTranslation(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticTranslation(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentStaticTranslation(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticRotationHelical GetSegmentStaticRotationHelical(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticRotationHelical(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentStaticRotationHelical(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticRotationMatrix GetSegmentStaticRotationMatrix(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticRotationMatrix(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentStaticRotationMatrix(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticRotationQuaternion GetSegmentStaticRotationQuaternion(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticRotationQuaternion(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentStaticRotationQuaternion(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticRotationEulerXYZ GetSegmentStaticRotationEulerXYZ(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticRotationEulerXYZ(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentStaticRotationEulerXYZ(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticScale GetSegmentStaticScale(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentStaticScale(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentStaticScale(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalTranslation GetSegmentGlobalTranslation(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalTranslation(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentGlobalTranslation(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalRotationHelical GetSegmentGlobalRotationHelical(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalRotationHelical(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentGlobalRotationHelical(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalRotationMatrix GetSegmentGlobalRotationMatrix(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalRotationMatrix(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentGlobalRotationMatrix(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalRotationQuaternion GetSegmentGlobalRotationQuaternion(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalRotationQuaternion(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentGlobalRotationQuaternion(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalRotationEulerXYZ GetSegmentGlobalRotationEulerXYZ(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentGlobalRotationEulerXYZ(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentGlobalRotationEulerXYZ(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalTranslation GetSegmentLocalTranslation(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalTranslation(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentLocalTranslation(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalRotationHelical GetSegmentLocalRotationHelical(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalRotationHelical(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentLocalRotationHelical(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalRotationMatrix GetSegmentLocalRotationMatrix(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalRotationMatrix(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentLocalRotationMatrix(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalRotationQuaternion GetSegmentLocalRotationQuaternion(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalRotationQuaternion(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentLocalRotationQuaternion(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalRotationEulerXYZ GetSegmentLocalRotationEulerXYZ(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SegmentName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_GetSegmentLocalRotationEulerXYZ(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_GetSegmentLocalRotationEulerXYZ(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SegmentName), SegmentName), true);
  }

  public void SetMaximumPrediction(double MaxPrediction) {
    de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_SetMaximumPrediction(swigCPtr, this, MaxPrediction);
  }

  public double MaximumPrediction() {
    return de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_MaximumPrediction(swigCPtr, this);
  }

  public boolean SetDebugLogFile(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String LogFile) {
    return de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_SetDebugLogFile(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(LogFile), LogFile);
  }

  public boolean SetOutputFile(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String LogFile) {
    return de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_SetOutputFile(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(LogFile), LogFile);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_ClearSubjectFilter ClearSubjectFilter() {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_ClearSubjectFilter(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_ClearSubjectFilter(swigCPtr, this), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_AddToSubjectFilter AddToSubjectFilter(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String SubjectName) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_AddToSubjectFilter(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_AddToSubjectFilter(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(SubjectName), SubjectName), true);
  }

  public de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_SetTimingLogFile SetTimingLogFile(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String ClientLog, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String StreamLog) {
    return new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.Output_SetTimingLogFile(de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_SetTimingLogFile(swigCPtr, this, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(ClientLog), ClientLog, de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.String.getCPtr(StreamLog), StreamLog), true);
  }

  public void SetOutputLatency(double OutputLatency) {
    de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_SetOutputLatency(swigCPtr, this, OutputLatency);
  }

  public double OutputLatency() {
    return de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDKJNI.ViconDataStreamSDK_CPP_RetimingClient_OutputLatency(swigCPtr, this);
  }

}
