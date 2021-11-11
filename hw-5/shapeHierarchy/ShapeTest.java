package com.shapeHierarchy;

public class ShapeTest {

	public static void main(String[] args) {
//		Shape s1 = new Circle(3);
//		Shape s2 = new Cube(3);
		Shape s3 = new Sphere(6);
//		Shape s4 = new Square(3);
		Shape s5 = new Tetrahedron(3, 4, 5);
//		Shape s6 = new Triangle(3, 6);
		
		Calculator calculator = new Calculator();
//		calculator.addShape(s1);
//		calculator.addShape(s2);
		calculator.addShape(s3);
//		calculator.addShape(s4);
		calculator.addShape(s5);
//		calculator.addShape(s6);
		calculator.calculate();
	}

}
