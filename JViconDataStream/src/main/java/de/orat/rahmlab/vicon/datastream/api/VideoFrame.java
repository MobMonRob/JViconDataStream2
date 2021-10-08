package de.orat.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetVideoFrame;
import de.dhbw.rahmlab.vicon.datastream.impl.VectorUchar;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * @author Oliver Rettig (Oliver.Rettig@orat.de)
 */
public class VideoFrame {
    private final int height;
    private final int width;
    private final long format;
    private final long id;
    private final long offsetX;
    private final long offsetY;
    private final VectorUchar data;
    
    VideoFrame(Output_GetVideoFrame result) {
        height = result.getM_Height();
        width = result.getM_Width();
        format = result.getM_Format();
        id = result.getM_FrameID();
        offsetX = result.getM_OffsetX();
        offsetY = result.getM_OffsetY();
        data = result.getM_Data();
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public long getFormat() {
        return format;
    }
    public long getID() {
        return id;
    }
    public long getOffsetX() {
        return offsetX;
    }
    public long getOffsetY() {
        return offsetY;
    }
    public int size(){
        return data.size();
    }
    public short get(int index){
        return data.get(index);
    }
    public Iterator<Short> iterator(){
        return data.iterator();
    }
    public Stream<Short> stream(){
        return data.stream();
    }
}
