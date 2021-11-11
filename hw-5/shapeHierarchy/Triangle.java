package com.shapeHierarchy;

public class Triangle extends TwoDimensionalShape {
	
	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	@Override
	public double getArea()	{
		return getDim1() * getDim2() * 0.5;
	}
	
	@Override 
	public String toString(){
		return String.format("Base: " + getDim1() + "\nHeight: " + getDim2() + "\n"); 
	}
	
}
