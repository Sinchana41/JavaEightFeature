package com.customfunctionalinterfacewithdefaultmethod;

public class CustomFunctionalInterfaceExample {
	public static void main(String[] args) {
		// Lambda implementation for square
		Squarer squarer = n -> n * n;

		int num1 = 5;
		int num2 = 8;

		squarer.printSquare(num1);
		squarer.printSquare(num2);
	}
}
