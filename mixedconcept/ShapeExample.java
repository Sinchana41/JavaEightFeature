package com.mixedconcept;

public class ShapeExample {
	public static void main(String[] args) {
		// Implement Circle using Lambda
		Shape circle = () -> System.out.println("Drawing a Circle");

		// Implement Rectangle using Lambda
		Shape rectangle = () -> System.out.println("Drawing a Rectangle");

		circle.draw();
		rectangle.draw();
	}
}
