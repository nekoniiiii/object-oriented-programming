package com.shapeHierarchy;
import java.lang.Math;

public class Circle extends TwoDimensionalShape {
	
	public Circle(double dim1) {
        super(dim1);
    }
    
    @Override
    public double getArea() {
        return  Math.PI * Math.pow(getDim1(), 2);
    }
    
    @Override 
    public String toString() {
        return String.format("Radius: " + getDim1() + "\n"); 
    }
}
