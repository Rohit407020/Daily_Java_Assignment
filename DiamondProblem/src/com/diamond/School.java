package com.diamond;

public class School implements Student,Teacher{
// it give error because Student inter face has diplay method and also teacher has display method so
	// it comfuse for that create method
	
	public void display() {
		Student.super.display();
		Teacher.super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        School S = new School();
        S.display();
	}

}
