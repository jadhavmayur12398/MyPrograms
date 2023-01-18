package com.program.multithreading3.methods;

public class Cafe extends Thread {
	RePizza rePizza;
	public Cafe (RePizza rePizza) {
		super();
		this.rePizza = rePizza;
	}
	public void run() {
		rePizza.bakePizza(30);
	}
}
