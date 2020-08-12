package de.dhbw.rahmlab.vicon.datastreamapi.api;

import de.dhbw.mobmonrob.vicon.datastreamapi.impl.Output_GetTimecode;

/**
 * Return the timecode information for the last frame retrieved from the DataStream. 
 * 
 * <p>If the stream is valid but timecode is not available the Output will be 
 * Result.Success and the Standard will be None.</p>
 * @see getFrame
 * @see getFrameNumber
 */
public class TimeCode {
    private final Output_GetTimecode timeCode;
    public TimeCode(Output_GetTimecode timeCode){
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
