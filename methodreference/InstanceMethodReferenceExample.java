package com.methodreference;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceExample {
	public static void main(String[] args) {
		List<String> messages = Arrays.asList("Hello", "Welcome", "Method Reference");

		// Create an instance of Printer
		Printer printer = new Printer();

		messages.forEach(printer::printMessage);
	}
}
