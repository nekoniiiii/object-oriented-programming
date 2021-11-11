package com.shapeHierarchy;

public class Cube extends ThreeDimensionalShape {
	
	public Cube(double dim1) {
        super(dim1);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(getDim1(), 2.0);
    }

    @Override
    public double getVolume() {
        return Math.pow(getDim1(), 3.0);
    }
    
    @Override 
    public String toString() {
    	return String.format("Side: " + getDim1() + "\n");
    }
}
