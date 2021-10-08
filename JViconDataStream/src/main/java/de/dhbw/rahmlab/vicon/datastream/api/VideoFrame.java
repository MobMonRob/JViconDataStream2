package de.dhbw.rahmlab.vicon.datastream.api;

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

    /**
     * Get height.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }
    /**
     * Get width.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }
    /**
     * Get format.
     * 
     * @return format
     */
    public long getFormat() {
        return format;
    }
    /**
     * Get ID
     * 
     * @return id 
     */
    public long getID() {
        return id;
    }
    /**
     * Get x offset.
     * 
     * @return x offset
     */
    public long getOffsetX() {
        return offsetX;
    }
    /**
     * Get y offset.
     * 
     * @return y offset 
     */
    public long getOffsetY() {
        return offsetY;
    }
    /**
     * Get size.
     * 
     * @return size
     */
    public int size(){
        return data.size();
    }
    /**
     * Get
     * @param index
     * @return 
     */
    public short get(int index){
        return data.get(index);
    }
    /**
     * Get 
     * @return 
     */
    public Iterator<Short> iterator(){
        return data.iterator();
    }
    public Stream<Short> stream(){
        return data.stream();
    }
}
