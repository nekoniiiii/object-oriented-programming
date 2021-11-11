package com.shapeHierarchy;

public class Square extends TwoDimensionalShape {
	
	public Square(double dim1) {
		super(dim1);
	}
	
	@Override
	public double getArea(){
		return Math.pow(getDim1(), 2);
	}
	

	@Override
	public String toString(){
		return String.format("Length: " + getDim1() + "\n");
	}
	
}
