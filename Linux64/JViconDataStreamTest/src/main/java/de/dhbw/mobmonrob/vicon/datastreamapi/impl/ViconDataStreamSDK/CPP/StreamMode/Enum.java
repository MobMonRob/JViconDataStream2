/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.StreamMode;

public final class Enum {
  public final static de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.StreamMode.Enum ClientPull = new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.StreamMode.Enum("ClientPull");
  public final static de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.StreamMode.Enum ClientPullPreFetch = new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.StreamMode.Enum("ClientPullPreFetch");
  public final static de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.StreamMode.Enum ServerPush = new de.dhbw.mobmonrob.vicon.datastreamapi.impl.ViconDataStreamSDK.CPP.StreamMode.Enum("ServerPush");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static Enum swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + Enum.class + " with value " + swigValue);
  }

  private Enum(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private Enum(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private Enum(String swigName, Enum swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static Enum[] swigValues = { ClientPull, ClientPullPreFetch, ServerPush };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
