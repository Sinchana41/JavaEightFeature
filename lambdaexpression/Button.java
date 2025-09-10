package com.lambdaexpression;

public class Button {
	private OnClickListener listener;

	// Register listener
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	// Simulate button click
	public void click() {
		if (listener != null) {
			listener.onClick();
		}
	}
}
