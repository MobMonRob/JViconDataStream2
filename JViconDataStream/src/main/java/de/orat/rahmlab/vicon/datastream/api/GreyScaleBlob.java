package de.orat.rahmlab.vicon.datastream.api;

import de.dhbw.rahmlab.vicon.datastream.impl.Output_GetGreyscaleBlob;
import de.dhbw.rahmlab.vicon.datastream.impl.VectorUint;
import de.dhbw.rahmlab.vicon.datastream.impl.VectorVectorUchar;

/**
 * TODO
 * 
 * - public Methoden müssen noch überlegt werden
 * - unklar ob für Tracker und/oder Nexus verfügbar ist
 * 
 * @author Oliver Rettig (Oliver.Rettig@orat.de)
 */
public class GreyScaleBlob {
    private final Output_GetGreyscaleBlob blob;
    GreyScaleBlob(Output_GetGreyscaleBlob blob){
        this.blob = blob;
        VectorUint posx = blob.getBlobLinePositionsX();
        VectorUint posy = blob.getBlobLinePositionsY();
        VectorVectorUchar  values = blob.getBlobLinePixelValues();
        short value = values.get(0).get(0);
    }
}
