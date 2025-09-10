package com.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		// UnaryOperator to convert string to uppercase
		UnaryOperator<String> toUpper = str -> str.toUpperCase();

		String input = "Java Functional Interface";
		String result = toUpper.apply(input);

		System.out.println("Original: " + input);
		System.out.println("Uppercase: " + result);
	}
}
