package com.mixedconcept;

public class StringOperationExample {
	public static void main(String[] args) {
		// Lambda → reverse string
		StringOperation reverse = s -> new StringBuilder(s).reverse().toString();

		// Method reference → toUpperCase
		StringOperation upper = String::toUpperCase;

		String input = "java8";

		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reverse.apply(input));
		System.out.println("Uppercase: " + upper.apply(input));
	}
}
