package com.sortingalistofobjects;

public class Person {
	private String name;
	private int age;
	private double salary;

	public Person(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() { 
		return name; 
	}
	public int getAge() { 
		return age; 
	}
	public double getSalary() {
		return salary; 
	}

	@Override
	public String toString() {
		return name + " (Age: " + age + ", Salary: " + salary + ")";
	}
}
