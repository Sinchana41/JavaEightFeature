package com.mixedconcept;

public class MessagePrinterExample {
	public static void main(String[] args) {
		// 1. Lambda expression
		MessagePrinter lambdaPrinter = (msg) -> System.out.println("Lambda: " + msg);

		// 2. Static method reference
		MessagePrinter staticPrinter = MessageUtil::printStatic;

		// 3. Instance method reference
		MessageUtil util = new MessageUtil();
		MessagePrinter instancePrinter = util::printInstance;

		lambdaPrinter.print("Hello");
		staticPrinter.print("Hello");
		instancePrinter.print("Hello");
	}
}
