package com.mapandreduceoperation;

import java.util.*;

public class SumOfSquares {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int sumOfSquares = numbers.stream()
				                  .filter(n -> n % 2 == 0)      // keep even numbers
			                      .map(n -> n * n)              // square them
			                      .reduce(0, (a, b) -> a + b);  // sum them up

		System.out.println("List: " + numbers);
		System.out.println("Sum of squares of even numbers: " + sumOfSquares);
	}
}
