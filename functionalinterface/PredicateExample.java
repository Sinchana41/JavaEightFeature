package com.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<String> lengthGreaterThanFive = str -> str.length() > 5;

		String s1 = "Hello";
		String s2 = "HelloWorld";

		System.out.println(s1 + " -> " + lengthGreaterThanFive.test(s1));
		System.out.println(s2 + " -> " + lengthGreaterThanFive.test(s2));
	}
}
