package com.programs.multithreading1.main;

import com.programs.multithreading1.extendsthread.MyThread1;
import com.programs.multithreading1.implementsrunnable.MyThread2;

public class ThreadProp {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		System.out.println(myThread1.getName());
		myThread1.setName("MyThread1");
		System.out.println(myThread1.getName());
		myThread1.setPriority(1);
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		System.out.println(thread.getName());
		thread.setName("MyThread2");
		System.out.println(thread.getName());
		thread.setPriority(10);
		
		myThread1.start();
		thread.start();
	}
}
