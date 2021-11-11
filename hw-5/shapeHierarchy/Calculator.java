package com.shapeHierarchy;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	private List<Shape> shapes;
	
	public Calculator() {
		this.shapes = new ArrayList<>();
	}
	
	public void addShape(Shape s) {
		this.shapes.add(s);
	}
	
	public void calculate() {
		for(Shape s: this.shapes) {
			if(s instanceof TwoDimensionalShape) {
				TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) s;
				System.out.println("==========");
                System.out.println(twoDimensionalShape.toString() + "Area = " + twoDimensionalShape.getArea());
			}
			else if(s instanceof ThreeDimensionalShape){
				ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) s;
				System.out.println("==========");
                System.out.printf(threeDimensionalShape.toString() + "Area = " + threeDimensionalShape.getArea());
                System.out.printf("\nVolume = " + threeDimensionalShape.getVolume() + "\n");
			}
		}
		
	}
		
}
