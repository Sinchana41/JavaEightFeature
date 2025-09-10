package com.methodreference;

public class InstanceReferenceDifferentObject {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// Method reference to instance method of a different object
		Multiplication operation = calc::multiply;

		int result = operation.apply(6, 7);
		System.out.println("Multiplication Result = " + result);
	}
}
