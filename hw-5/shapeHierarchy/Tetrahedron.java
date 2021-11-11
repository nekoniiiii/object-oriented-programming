package com.shapeHierarchy;

public class Tetrahedron extends ThreeDimensionalShape {

	public Tetrahedron (double dim1, double dim2, double dim3) {
		super(dim1, dim2, dim3);
	}
	
	@Override
	public double getArea()	{
		return (4 * (0.5 * getDim1() * getDim2()));
	}
	
	@Override
	public double getVolume() {
		return ((getDim1() * getDim2() * getDim3()) / 6);
	}
		
	@Override
	public String toString() {
		return String.format("Base width: " + getDim1() + "\nBase height: " + getDim2() + "\nHeight: " + getDim3() + "\n");
	}
}
