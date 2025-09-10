package com.functionalinterface;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		// Function to check even/odd
		Function<Integer, String> evenOrOdd = num -> (num % 2 == 0) ? "Even" : "Odd";

		System.out.println("10 -> " + evenOrOdd.apply(10));
		System.out.println("7 -> " + evenOrOdd.apply(7));
	}
}