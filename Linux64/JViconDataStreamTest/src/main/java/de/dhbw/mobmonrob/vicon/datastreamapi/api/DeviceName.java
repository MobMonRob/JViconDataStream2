/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dhbw.mobmonrob.vicon.datastreamapi.api;

import de.dhbw.mobmonrob.vicon.datastreamapi.impl.DeviceType_Enum;
import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetDeviceName;

/**
 *
 * @author mobmonrob
 */
public class DeviceName {
    private final Output_GetDeviceName deviceName;
    public DeviceName(Output_GetDeviceName deviceName){
        this.deviceName= deviceName;
    }
    
    public  String deviceName(){
        return deviceName.getDeviceName().toString();
    }
    
      public DeviceType_Enum DeviceType(){
        return deviceName.getDeviceType();
    }
}
