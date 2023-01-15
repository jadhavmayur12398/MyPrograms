package com.programs.multithreading1.implementsrunnable;

public class MyThreadMain {
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		thread.start();
	}
}
