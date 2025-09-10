package com.lambdaexpression;

public class ButtonClickSimulation {
	public static void main(String[] args) {
		Button button = new Button();

		// Define action using Lambda
		button.setOnClickListener(() -> System.out.println("Button clicked! Action performed."));

		// Simulate user clicking the button
		button.click();
	}
}
