package com.methodreference;

import java.util.function.Function;

public class ConstructorReferenceWithList {
	public static void main(String[] args) {
		String[] names = {"Ashwathama", "Birav", "Charan", "Diana"};

		// Constructor reference using Function
		Function<String, Student> studentCreator = Student::new;

		// Convert array into Student objects (without streams)
		Student[] students = new Student[names.length];
		for (int i = 0; i < names.length; i++) {
			students[i] = studentCreator.apply(names[i]);
		}

		for (Student s : students) {
			System.out.println(s);
		}
	}
}
