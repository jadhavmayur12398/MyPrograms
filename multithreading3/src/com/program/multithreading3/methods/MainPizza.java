package com.program.multithreading3.methods;

public class MainPizza {
	public static void main(String[] args) {
		RePizza rePizza = new RePizza(30);
		Friends friends = new Friends(rePizza);
		Cafe cafe = new Cafe(rePizza);
		friends.start();
		cafe.start();	
	}
}
