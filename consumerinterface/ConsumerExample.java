package com.consumerinterface;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "lambda", "stream", "consumer");

		// Consumer to print each string in uppercase
		Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());

		words.forEach(printUpper);
	}
}
