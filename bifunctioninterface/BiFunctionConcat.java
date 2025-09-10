package com.bifunctioninterface;

import java.util.function.BiFunction;

public class BiFunctionConcat {
	public static void main(String[] args) {
		// BiFunction to concatenate two strings with space
		BiFunction<String, String, String> concat = (s1, s2) -> s1 + " " + s2;

		String str1 = "Hello";
		String str2 = "World";

		String result = concat.apply(str1, str2);
		System.out.println("Concatenated String: " + result);
	}
}
