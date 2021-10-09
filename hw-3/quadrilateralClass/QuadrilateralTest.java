package com.quadrilateral;

public class QuadrilateralTest {
	public static void main(String[] args) {
		Point A = new Point(1.0, 1.0);
		Point B = new Point(1.0, 4.0);
		Point C = new Point(4.0, 4.0);
		Point D = new Point(4.0, 1.0);
	
		Square shape1 = new Square(A, B, C, D);
		System.out.println(shape1.toString());
		
		Point E = new Point(0.0, 2.0);
		Point F = new Point(0.0, 4.0);
		Point G = new Point(4.0, 4.0);
		Point H = new Point(4.0, 2.0);
		
		Rectangle shape2 = new Rectangle(E, F, G, H);
		System.out.println(shape2.toString());
		
		Point I = new Point(1.5, 1.5);
		Point J = new Point(3.5, 5.5);
		Point K = new Point(9.0, 5.5);
		Point L = new Point(7.0, 1.5);
	
		Parallelogram shape3 = new Parallelogram(I, J, K, L);
		System.out.println(shape3.toString());
		
		Point M = new Point(5.0, 6.0);
		Point N = new Point(13.5, 8.0);
		Point O = new Point(14.0, 8.0);
		Point P = new Point(15.5, 6.0);
	
		Trapezoid shape4 = new Trapezoid(M, N, O, P);
		System.out.println(shape4.toString());
	}
}
