package com.quadrilateral;

public class Square extends Quadrilateral {
    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

	public double area(){
		return Math.pow((getPoint4().getX()) - (getPoint2().getX()), 2);
    }

    public String toString() {
        return String.format("The area of a square: " + area());
    }
}
