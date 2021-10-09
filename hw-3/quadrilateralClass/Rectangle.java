package com.quadrilateral;

public class Rectangle extends Quadrilateral {
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

	public double area(){
		return Math.abs((getPoint4().getX() - getPoint1().getX()) * (getPoint2().getY() - getPoint1().getY()));
    }

    public String toString() {
        return String.format("The area of a rectangle: " + area());
    }
}
