package com.functionalinterfaceimplementation;

public class FunctionalInterfaceSumExample {
	public static void main(String[] args) {
		// Implementing Adder using Lambda
		Adder sum = (a, b) -> a + b;

		int result = sum.add(10, 20);
		System.out.println("Sum = " + result);
	}
}
