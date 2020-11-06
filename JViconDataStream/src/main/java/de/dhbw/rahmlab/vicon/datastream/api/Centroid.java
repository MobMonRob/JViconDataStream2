package de.dhbw.rahmlab.vicon.datastream.api;

/**
 * 
 * @author Oliver Rettig (Oliver.Rettig@orat.de)
 */
public class Centroid {
    
    private double[] position;
    private double radius;
    
    Centroid(double[] position, double radius){
        this.position = position;
        this.radius = radius;
    }
    
    public double[] getPosition(){
        return position;
    }
    public double getRadius(){
        return radius;
    }
}
