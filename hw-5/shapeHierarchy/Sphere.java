package com.shapeHierarchy;
import java.lang.Math;

public class Sphere extends ThreeDimensionalShape {
	
	public Sphere(double dim1) {
		super(dim1);
	}
	
	@Override
	public double getArea() {
		return (4 * Math.PI * (Math.pow(getDim1(), 2)));
	}

	@Override
	public double getVolume() {
		return (Math.PI * 4/3 * Math.pow(getDim1(), 3.0));
	}
	
	@Override 
	public String toString() {
		return String.format("Radius: " + getDim1() + "\n"); 
	}
}
