package de.orat.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetTimecode;

/**
 * Represents the timecode information for a frame retrieved from the DataStream. 
 * 
 * @see de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient#getFrame()
 * @see de.dhbw.rahmlab.vicon.datastream.api.DataStreamClient#getFrameNumber()
 * @author Oliver Rettig
 */
public class TimeCode {
    
    private final Output_GetTimecode timeCode;
    
    TimeCode(Output_GetTimecode timeCode){
        this.timeCode = timeCode;
    }
    
    public long getSubFrame(){
        return timeCode.getSubFrame();
    }
    public long getFrames(){
        return timeCode.getFrames();
    }
    public long getHours(){
        return timeCode.getHours();
    }
    public long getMinutes(){
        return timeCode.getMinutes();
    }
    public long getSeconds(){
        return timeCode.getSeconds();
    }
    public boolean getFieldFlag(){
        return timeCode.getFieldFlag();
    }
    public long getSubFramesPerFrame(){
        return timeCode.getSubFramesPerFrame();
    }
    public long getUserBits(){
        return timeCode.getUserBits();
    }
}
