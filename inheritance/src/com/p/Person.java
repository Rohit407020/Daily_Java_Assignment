package com.p;
// DYnamic Binding
 class Person1 {
  void display1() {
	  System.out.println("I am Person");
  }
}
 class Woman extends Person1{
	 void display() {
		  System.out.println("I am Woman");
	  }
 }
 class Man extends Woman{
	 void display() {
		  System.out.println("I am Man");
	  }
 }

public class Person{
	public static void main(String args[]) {
		
//		Man p;
//		p = new Person1();
//		p.display();
		
		Man m = new Man();
		m.display1();
		
	}
}