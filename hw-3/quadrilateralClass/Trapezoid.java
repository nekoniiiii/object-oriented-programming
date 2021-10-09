package com.quadrilateral;

public class Trapezoid extends Quadrilateral {
    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
    	// asumsikan trapesium sejajar sumbu x
        super(point1, point2, point3, point4);
    }

    public double getHeight() {
    	return (getPoint2().getY() - getPoint1().getY());
    }

    public double area() {
        return Math.abs((0.5 * ((getPoint4().getX()) - (getPoint1().getX())) + (getPoint3().getX() - getPoint2().getX())) * getHeight());
    }

    public String toString() {
        return String.format("The area of a trapezoid: " + area());
    }
}
