package com.methodreference;

import java.util.function.BiFunction;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		// Constructor reference using BiFunction
		BiFunction<String, Integer, Person> personCreator = Person::new;

		// Create Person objects
		Person p1 = personCreator.apply("Ram", 25);
		Person p2 = personCreator.apply("Krishna", 30);

		System.out.println(p1);
		System.out.println(p2);
	}
}
