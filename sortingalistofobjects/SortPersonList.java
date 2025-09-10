package com.sortingalistofobjects;

import java.util.ArrayList;
import java.util.List;

public class SortPersonList {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Ananya", 30, 50000));
		people.add(new Person("Birav", 25, 45000));
		people.add(new Person("Charan", 35, 60000));
		people.add(new Person("Dhanush", 28, 55000));

		System.out.println("Before Sorting:");
		people.forEach(System.out::println);

		// Sort by age in ascending order using lambda
		people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

		System.out.println("\nAfter Sorting by Age (Ascending):");
		people.forEach(System.out::println);
	}
}
