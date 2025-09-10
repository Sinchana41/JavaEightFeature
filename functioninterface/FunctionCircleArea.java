package com.functioninterface;

import java.util.function.Function;

public class FunctionCircleArea {
	public static void main(String[] args) {
		// Function to calculate area of a circle
		Function<Double, Double> areaOfCircle = r -> Math.PI * r * r;

		double radius1 = 5.0;
		double radius2 = 7.5;

		System.out.println("Radius: " + radius1 + " -> Area: " + areaOfCircle.apply(radius1));
		System.out.println("Radius: " + radius2 + " -> Area: " + areaOfCircle.apply(radius2));
	}
}
