package com.project.designpattern2.builder1;

public class LaptopBuilder {
	private String brand;
	private String name;
	private String color;
	private int displaysize;
	private int ram;
	private int memory;
	private int camera;
	private String os;
	
	public LaptopBuilder brand(String brand) {
		this.brand = brand;
		return this;
	}
	public LaptopBuilder name(String name) {
		this.name = name;
		return this;
	}
	public LaptopBuilder color(String color) {
		this.color = color;
		return this;
	}
	public LaptopBuilder displaysize(int displaysize) {
		this.displaysize = displaysize;
		return this;
	}
	public LaptopBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}
	public LaptopBuilder memory(int memory) {
		this.memory = memory;
		return this;
	}
	public LaptopBuilder camera(int camera) {
		this.camera = camera;
		return this;
	}
	public LaptopBuilder os(String os) {
		this.os = os;
		return this;
	}
	public Laptop getLaptop() {
		Laptop laptop = new Laptop(this.brand, this.name, this.color, this.displaysize, this.ram, this.memory,
				this.camera, this.os);
		return laptop;
	}
}
