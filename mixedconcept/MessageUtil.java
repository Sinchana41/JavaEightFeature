package com.mixedconcept;

public class MessageUtil {
	// Static method
	public static void printStatic(String msg) {
		System.out.println("Static: " + msg);
	}

	// Instance method
	public void printInstance(String msg) {
		System.out.println("Instance: " + msg);
	}
}
