package com.flow;
import java.util.Scanner;
public class account {
	
	public static void main(String args[]) {
		int age;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age of Person :");
		
		age = scan.nextInt();
		System.out.println("Enter City:");
		
		String city = scan.next();
//		System.out.println(city);
		if(age>=18 && (city=="pune" || city =="PUNE" || city=="Pune"))
		{
			System.out.println("Bank allow to open account");
		}
		else if(age<18 && age>12) {
			System.out.println("Bank allow to Student account");
		}
		else {
			System.out.println("Bank not allow to open account");
		}
		
	}

}
