package com.customfunctionalinterfacewithdefaultmethod;

@FunctionalInterface
public interface Squarer {
	int square(int n);

	default void printSquare(int n) {
		int result = square(n);
		System.out.println("The square of " + n + " is: " + result);
	}
}
