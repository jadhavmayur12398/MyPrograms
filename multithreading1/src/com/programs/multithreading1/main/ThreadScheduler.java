package com.programs.multithreading1.main;

import com.programs.multithreading1.extendsthread.MyThread1;
import com.programs.multithreading1.implementsrunnable.MyThread2;

public class ThreadScheduler {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		myThread1.setPriority(5);
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		thread.setPriority(8);
		
		thread.start();
		myThread1.start();
	}
}
