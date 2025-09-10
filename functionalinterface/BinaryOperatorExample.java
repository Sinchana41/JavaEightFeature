package com.functionalinterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	public static void main(String[] args) {
		// BinaryOperator to find maximum of two integers
		BinaryOperator<Integer> max = (a, b) -> (a > b) ? a : b;

		System.out.println("Max of 10 and 20 = " + max.apply(10, 20));
		System.out.println("Max of 45 and 30 = " + max.apply(45, 30));
		System.out.println("Max of 7 and 7 = " + max.apply(7, 7));
	}
}
