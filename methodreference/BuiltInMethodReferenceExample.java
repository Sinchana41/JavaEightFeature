package com.methodreference;

import java.util.function.Function;

public class BuiltInMethodReferenceExample {
	public static void main(String[] args) {
		// Method reference to built-in parseInt
		Function<String, Integer> stringToInt = Integer::parseInt;

		// Test cases
		String s1 = "100";
		String s2 = "250";

		Integer num1 = stringToInt.apply(s1);
		Integer num2 = stringToInt.apply(s2);

		System.out.println("String \"" + s1 + "\" converted to Integer: " + num1);
		System.out.println("String \"" + s2 + "\" converted to Integer: " + num2);
	}
}
