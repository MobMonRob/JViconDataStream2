package de.dhbw.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetVideoFrame;

/**
 *
 * @author Oliver Rettig (Oliver.Rettig@orat.de)
 */
public class Frame {
    private final int height;
    private final int width;
    private final long format;
    private final long id;
    private final long offsetX;
    private final long offsetY;
    
    public Frame(Output_GetVideoFrame result){
        height = result.getM_Height();
        width = result.getM_Width();
        format = result.getM_Format();
        id = result.getM_FrameID();
        offsetX = result.getM_OffsetX();
        offsetY = result.getM_OffsetY();
        
        //TODO
        result.getM_Data();
        //TODO
        // vervollständigen
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public long getFormat(){
        return format;
    }
    public long getID(){
        return id;
    }
    public long getOffsetX(){
        return offsetX;
    }
    public long getOffsetY(){
        return offsetY;
    }
}
