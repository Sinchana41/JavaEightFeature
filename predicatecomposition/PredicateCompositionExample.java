package com.predicatecomposition;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateCompositionExample {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Predicate", "Composition", "Lambda", "StreamAPI", "Filter");

		Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;

		Predicate<String> containsA = s -> s.toLowerCase().contains("a");

		// Combine both conditions (length > 5 AND contains "a")
		Predicate<String> combined = lengthGreaterThan5.and(containsA);

		List<String> filtered = words.stream()
				                     .filter(combined)
			                         .collect(Collectors.toList());

		System.out.println("Original List: " + words);
		System.out.println("Filtered List (length > 5 AND contains 'a'): " + filtered);
	}
}
