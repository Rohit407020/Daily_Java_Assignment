package com.queuee;

public class Book implements Comparable<Book> {
    int id;
    String name;
    int price;
	public Book() {
		super();
	}
	public Book(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}
    
    
}
