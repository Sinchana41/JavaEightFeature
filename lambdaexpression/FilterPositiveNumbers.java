package com.lambdaexpression;

import java.util.function.Predicate;

public class FilterPositiveNumbers {
	public static void main(String[] args) {
		int[] numbers = { -3, 5, -7, 10, 0, 8, -1 };

		// Predicate for positive numbers
		Predicate<Integer> isPositive = n -> n > 0;

		System.out.println("Positive numbers:");

		for (int num : numbers) {
			if (isPositive.test(num)) {
				System.out.println(num);
			}
		}
	}
}
