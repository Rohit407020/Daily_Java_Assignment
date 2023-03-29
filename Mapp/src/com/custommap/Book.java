package com.custommap;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private float price;
    private Aurthor a;
	public Book() {
		super();
	}
	public Book(int id, String name, float price, Aurthor a) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.a = a;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Aurthor getA() {
		return a;
	}
	public void setA(Aurthor a) {
		this.a = a;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(a, id, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(a, other.a) && id == other.id && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", a=" + a + "]";
	}
    
    
}
