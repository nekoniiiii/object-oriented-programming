package com.quadrilateral;

public class Quadrilateral {
	private Point point1; // titik kiri bawah
	private Point point2; // titik kiri atas
	private Point point3; // titik kanan atas
	private Point point4; // titik kanan bawah
	
	public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {  
		setPoint1(point1);
		setPoint2(point2);
		setPoint3(point3);
		setPoint4(point4);
	}

	public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }
    
    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
    
    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }
    
    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }
	
}
