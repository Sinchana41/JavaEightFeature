package com.functionalinterface;

public class CalculatorLambdaExample {

	public static void main(String[] args) {
		// Implementations using Lambdas
		Calculator add = (a, b) -> a + b;
		Calculator subtract = (a, b) -> a - b;
		Calculator multiply = (a, b) -> a * b;
		Calculator divide = (a, b) -> a / b;

		System.out.println("10 + 5 = " + add.calculate(10, 5));
		System.out.println("10 - 5 = " + subtract.calculate(10, 5));
		System.out.println("10 * 5 = " + multiply.calculate(10, 5));
		System.out.println("10 / 5 = " + divide.calculate(10, 5));
	}
}
