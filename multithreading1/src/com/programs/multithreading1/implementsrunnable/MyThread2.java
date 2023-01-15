package com.programs.multithreading1.implementsrunnable;

// by implements Runnable interface

public class MyThread2 implements Runnable {
	public void run () {
		for (int i = 0; i <=1; i++) {
			System.out.println("MyThread2 is running...");
		}
	}
}
