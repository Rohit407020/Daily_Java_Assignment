package com.constructor;

public class Student {
   
	private int id;
	private String name;
	private float marks;
	// default cons
	public Student() {
		System.out.println("Default cons");
	}
	public Student(int id,String name,float marks) {
		this.id =id;
		this.name= name;
		this.marks = marks;
		System.out.println("para con");
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+marks);
	}
	

}
