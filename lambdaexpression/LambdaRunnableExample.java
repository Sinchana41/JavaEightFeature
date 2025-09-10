package com.lambdaexpression;

public class LambdaRunnableExample {
	public static void main(String[] args) {
		// Runnable implemented using a lambda
		Runnable task = () -> System.out.println("Hello from Lambda Runnable!");

		// Create and start the thread
		Thread thread = new Thread(task);
		thread.start();
	}
}
