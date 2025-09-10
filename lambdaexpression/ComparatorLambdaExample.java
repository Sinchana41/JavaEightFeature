package com.lambdaexpression;

import java.util.*;

public class ComparatorLambdaExample {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(3, "Karna"),
				new Employee(1, "Abhimanyu"),
				new Employee(2, "Sinchana")
				);
		// Sort by id using Lambda
		employees.sort((e1, e2) -> Integer.compare(e1.getEmployeeId(), e2.getEmployeeId()));

		employees.forEach(System.out::println);
	}
}
