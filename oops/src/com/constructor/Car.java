package com.constructor;

public class Car {
	 private String modelId;
	 private String brand;
	 private float price;
	 private String name;
	
	public Car() {
		System.out.println("Default Constructor");
	}
	
	public Car(String mid, String b,float p,String n) {
		this.modelId = mid;
		this.brand = b;
		this.price = p;
		this.name = n;
	}
	public Car(String mid, float p,String n) {
		this.modelId = mid;
		this.brand = "TATA";
		this.price = p;
		this.name = n;
	}
	
	void display() {
		System.out.println("=========Car=======");
		System.out.println("Car Name  : "+this.name);
		System.out.println("Car Model  : "+this.modelId);
		System.out.println("Brand Name  : "+this.brand);
		System.out.println("Car Price  : "+this.price);
		
	}

}
