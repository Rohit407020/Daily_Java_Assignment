package com.hierarchyin;

public class Bike {
   private String name,brand,color;
   private int modelNo;
   private float price;
   
  public Bike() {
	  super();
  }
public Bike(String name, String brand, String color, int modelNo, float price) {
	super();
	this.name = name;
	this.brand = brand;
	this.color = color;
	this.modelNo = modelNo;
	this.price = price;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public int getModelNo() {
	return modelNo;
}


public void setModelNo(int modelNo) {
	this.modelNo = modelNo;
}


public float getPrice() {
	return price;
}


public void setPrice(float price) {
	this.price = price;
}
   
   
}
