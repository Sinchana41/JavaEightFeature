package com.methodreference;

import java.util.*;

public class SortByLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Lambda", "Stream", "API");

		// Sort by string length using method reference
		words.sort(Comparator.comparingInt(String::length));

		System.out.println("Sorted by length: " + words);
	}
}
