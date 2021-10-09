package com.quadrilateral;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(Point point1, Point point2, Point point3, Point point4) {
    	// asumsikan jajargenjang sejajar sumbu x
        super(point1, point2, point3, point4);
    }

    public double getHeight() {
    	return (getPoint2().getY() - getPoint1().getY());
    }
    
	public double area(){
        return Math.abs((getPoint4().getX() - getPoint1().getX()) * getHeight());
    }

    public String toString() {
        return String.format("The area of a parallelogram: " + area());
    }
}
