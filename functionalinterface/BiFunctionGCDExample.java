package com.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionGCDExample {
	public static void main(String[] args) {
		// BiFunction to compute GCD
		BiFunction<Integer, Integer, Integer> gcd = (a, b) -> {
			while (b != 0) {
				int temp = b;
				b = a % b;
				a = temp;
			}
			return a;
		};

		System.out.println("GCD of 54 and 24 = " + gcd.apply(54, 24));
		System.out.println("GCD of 100 and 85 = " + gcd.apply(100, 85));
		System.out.println("GCD of 42 and 56 = " + gcd.apply(42, 56));
	}
}
