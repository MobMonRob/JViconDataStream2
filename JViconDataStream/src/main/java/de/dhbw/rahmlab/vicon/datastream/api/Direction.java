package de.dhbw.rahmlab.vicon.datastream.api;

/**
 * 
 * @author Oliver Rettig
 */
public final class Direction {
    
  public final static Direction Up = new Direction("Up");
  public final static Direction Down = new Direction("Down");
  public final static Direction Left = new Direction("Left");
  public final static Direction Right = new Direction("Right");
  public final static Direction Forward = new Direction("Forward");
  public final static Direction Backward = new Direction("Backward");

  public final int swigValue() {
    return swigValue;
  }

  @Override
  public String toString() {
    return swigName;
  }

  public static Direction swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + Direction.class + " with value " + swigValue);
  }

  private Direction(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private Direction(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private Direction(String swigName, Direction swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static Direction[] swigValues = { Up, Down, Left, Right, Forward, Backward };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

