package com.flow;

import java.util.Scanner;

public class maxnum {
	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter first number");
		 int n1 = scan.nextInt();
		 System.out.println("Enter Second number");
		 int n2 = scan.nextInt();
		 System.out.println("Enter Third number");
		 int n3 = scan.nextInt();
		 int max;
		 
		 max = n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		 
		 System.out.println(max+" is max number");
		
//		 if(n1>n2 && n1>n3) {
//			 System.out.println(n1+" is max number");
//		 }
//		 else if(n2>n1 && n2>n3) {
//			 System.out.println(n2+" is max number");
//		 }
//		 else {
//			 System.out.println(n3+" is max number");
//
//		 }
		 
		 
	}

 
 
}
