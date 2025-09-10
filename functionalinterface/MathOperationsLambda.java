package com.functionalinterface;

public class MathOperationsLambda {
	public static void main(String[] args) {
		
		MathOperation square = n -> n * n;
		MathOperation cube = n -> n * n * n;
		
		// Factorial using Lambda (with loop inside)
		MathOperation factorial = n -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};

		int number = 5;
		System.out.println("Square of " + number + " = " + square.operate(number));
		System.out.println("Cube of " + number + " = " + cube.operate(number));
		System.out.println("Factorial of " + number + " = " + factorial.operate(number));
	}
}
