package com.programs.multithreading1.extendsthread;

// by extends thread method

public class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 1; i++) {
			System.out.println("MyThread1 is running...");
		}
	}
}
