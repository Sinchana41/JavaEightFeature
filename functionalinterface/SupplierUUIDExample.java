package com.functionalinterface;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierUUIDExample {
	public static void main(String[] args) {
		// Supplier to generate random UUID
		Supplier<String> randomUUIDSupplier = () -> UUID.randomUUID().toString();

		System.out.println("Random UUID 1: " + randomUUIDSupplier.get());
		System.out.println("Random UUID 2: " + randomUUIDSupplier.get());
		System.out.println("Random UUID 3: " + randomUUIDSupplier.get());
	}
}
