package com.shapeHierarchy;

public abstract class Shape {
	private double dim1;
    private double dim2;
    private double dim3;
    
    public Shape(double dim1)  {
        setDim1(dim1);
    }
    
    public Shape(double dim1, double dim2)  {
        setDim1(dim1);
        setDim2(dim1);
    }
    
    public Shape(double dim1, double dim2, double dim3)  {
        setDim1(dim1);
        setDim2(dim1);
        setDim3(dim3);
    }

	public double getDim1() {
		return dim1;
	}

	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}

	public double getDim2() {
		return dim2;
	}

	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}

	public double getDim3() {
		return dim3;
	}

	public void setDim3(double dim3) {
		this.dim3 = dim3;
	}
    
	public abstract double getArea();
    
    public String getName() {
        return getClass().getName();
    }
    
    @Override
    public String toString() {
        return String.format("Area = " + getArea() + "\n");
    }
}
