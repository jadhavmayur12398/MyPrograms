package com.project.designpattern2.builder1;

public class LaptopMain {
	public static void main(String[] args) {
		Laptop laptop = new LaptopBuilder().brand("HP").color("Silver").getLaptop();
		System.out.println(laptop);
	}
}
