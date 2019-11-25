package com.patrick.lab.sop_lab;

public class Car {

	private String name;
	private String wheel;
	private String color;
	
	public Car(String name, String wheel, String color) {
		super();
		this.name = name;
		this.wheel = wheel;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWheel() {
		return wheel;
	}
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", wheel=" + wheel + ", color=" + color + "]";
	}
	
}
