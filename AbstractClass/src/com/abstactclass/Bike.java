package com.abstactclass;

public abstract class Bike {
	
	String brand;
	int speed;
	
	abstract void changeSpeed();

	void display() {
		System.out.println(brand +" "+speed);
	}
	public static void main(String arg[]) {
		
	}
}
