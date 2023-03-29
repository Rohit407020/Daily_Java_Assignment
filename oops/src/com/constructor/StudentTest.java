package com.constructor;
import java.util.*;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		s1.display();
		
		System.out.println("====================");
		Student s2 = new Student(101,"RK",90.2f);
		s2.display();
		System.out.println("====================");
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter marks");
		float marks = sc.nextFloat();
		
		Student s3 = new Student(id,name,marks);
		s3.display();
		
	}

}
