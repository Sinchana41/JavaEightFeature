package com.filteringaList;

import java.util.*;
import java.util.stream.Collectors;

public class FilterListExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ananya", "Birbal", "Anurag", "Charan", "Atharav", "Deeraj");

		// Filter strings starting with "A"
		List<String> filtered = names.stream()
				                     .filter(s -> s.startsWith("A"))
				                     .collect(Collectors.toList());

		System.out.println("Original List: " + names);
		System.out.println("Filtered List (starts with 'A'): " + filtered);
	}

}
