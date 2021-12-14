package de.dhbw.rahmlab.vicon.datastream.api;
import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetGreyscaleBlob;
import de.dhbw.rahmlab.vicon.datastream.impl.VectorUint;

/**
 * A Greyscale blob respresents the smallest rectangular which contains all pixels
 * of a blob produced by a single marker.
 * 
 * - unklar ob für Tracker und/oder Nexus verfügbar ist
 * 
 * @author Oliver Rettig (Oliver.Rettig@orat.de)
 */
public class GreyScaleBlob {
    private final Output_GetGreyscaleBlob blob;
    GreyScaleBlob(Output_GetGreyscaleBlob blob){
        this.blob = blob;
    }
    
    // edge coordinates data
    
    //TODO
    // wie gross ist das long[]? Vielleicht nur 2 und ich bekomme auf diese
    // weise quasi die Position x,y diagonal gegenüberliegender Ecken eines
    // Rechtecks?
    public long[] getLinePositionsX(){
        VectorUint values = blob.getBlobLinePositionsX();
        long[] result = new long[values.size()];
        for (int i=0;i<values.size();i++){
            result[i] = values.get(i);
        }
        return result;
    }
    public long[] getLinePositionsY(){
        VectorUint values = blob.getBlobLinePositionsY();
        long[] result = new long[values.size()];
        for (int i=0;i<values.size();i++){
            result[i] = values.get(i);
        }
        return result;
    }
    
    
    // grayscale and coordinates data
    
    /**
     * Get value of a single pixel.
     * 
     * <p>The Short is the representation of one single pixel at "index" of the given
     * line where its color is represented by values ranging in between 
     * 0-255.0/255 should therefore represent black/white.</p>
     * 
     * @param positionIndex index in the line of the pixel
     * @param lineIndex index of the line the pixel corresponds to
     * @return pixel value
     */
    public short getPixelValue(int positionIndex, int lineIndex){
        return blob.getBlobLinePixelValues().get(lineIndex).get(positionIndex);
    }
    /**
     * Get the x/y-coordinates of a pixel.
     * 
     * @param positionIndex defines the position inside of a line
     * @param lineIndex defines the line position
     * @return x/y-coordinates
     */
    public long[] getPixelCoordinates(int positionIndex, int lineIndex){
        return new long[]{blob.getBlobLinePositionsX().get(positionIndex),
            blob.getBlobLinePositionsY().get(lineIndex)};
    }
}
