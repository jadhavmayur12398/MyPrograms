package com.program.multithreading3.methods;

public class RePizza {
	int noOfPizza;
	public RePizza(int noOfPizza) {
		this.noOfPizza = noOfPizza;
	}
	public int checkPizza() {
		return this.noOfPizza;
	}
	public synchronized void orderPizza(int noOfPizza) {
		System.out.println("Ordering" + noOfPizza + "Pizzas");
		if (noOfPizza>checkPizza()) {
			try {
				System.out.println(noOfPizza + "not available Please wait");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.noOfPizza -= noOfPizza;
		System.out.println(checkPizza() + "Pizzas available");
	}
	public synchronized void bakePizza(int noOfPizza) {
		this.noOfPizza += noOfPizza;
		System.out.println(checkPizza() + "Pizzas Available");
		this.notify();
	}
	
}

