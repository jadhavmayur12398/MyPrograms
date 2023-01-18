package com.program.multithreading3.methods;

public class Friends extends Thread{
	RePizza rePizza;
	public Friends(RePizza rePizza) {
		super();
		this.rePizza = rePizza;
	}
	public void run() {
		rePizza.orderPizza(50);
	}
}
