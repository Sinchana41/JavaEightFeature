package com.lambdaexpression;

import java.util.*;

public class TimerTaskLambda {
	public static void main(String[] args) {
		Timer timer = new Timer();

		// Wrap lambda inside TimerTask
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Runnable run = () -> System.out.println("Task Executed!");
				run.run();
			}
		};

		// Schedule task: delay = 0, repeat every 2000ms
		timer.schedule(task, 0, 2000);
	}
}