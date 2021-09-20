package de.orat.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetTimecode;
import de.dhbw.rahmlab.vicon.datastream.impl.TimecodeStandard_Enum;

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
    /**
     * Get timecode standard.
     * 
     * @return time code standard
     * @throws RuntimeException if the determined time code standard is unknwon
     */
    public String getStandard(){
        TimecodeStandard_Enum code = timeCode.getStandard();
        if (code.equals(TimecodeStandard_Enum.ATSC)){
           return "ATSC";
        } else if (code.equals(TimecodeStandard_Enum.Film)){
            return "Film";
        } else if (code.equals(TimecodeStandard_Enum.NTSC)){
            return "NTSC";
        } else if (code.equals(TimecodeStandard_Enum.NTSCDrop)){
            return "NTSDrop";
        } else if (code.equals(TimecodeStandard_Enum.NTSCFilm)){
            return "NTSFilm";
        } else if (code.equals(TimecodeStandard_Enum.PAL)){
            return "PAL";
        }
        throw new RuntimeException("TimeCode.getStandard(): Unknown result value \""+code.toString()+"!");
    }
}
