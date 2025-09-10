package com.lambdaexpression;

import java.util.*;

public class LambdaSortExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Banana", "Apple", "Mango", "Cherry", "Orange");

		// Sorting in reverse alphabetical order using lambda
		names.sort((s1, s2) -> s2.compareTo(s1));

		names.forEach(System.out::println);
	}
}
