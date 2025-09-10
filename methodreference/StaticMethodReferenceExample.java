package com.methodreference;

import java.util.function.Predicate;

public class StaticMethodReferenceExample {

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		// Method reference to static method
		Predicate<Integer> isEvenPredicate = StaticMethodReferenceExample::isEven;

		System.out.println("10 -> " + isEvenPredicate.test(10));
		System.out.println("7 -> " + isEvenPredicate.test(7));
	}
}
