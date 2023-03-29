package com.assignment;

import java.util.Scanner;

public class area {
 public static void main(String args[]) {
	 Scanner scan = new Scanner(System.in);
	 //area of eq triangle = root 3/2 *
	 System.out.println("Enter Side of triangle");
	 
	 int s = scan.nextInt();
	 double area =  (Math.sqrt(3)/4)*s*s;
	 
	 System.out.println("Area of equilatral triangle is "+ String.format("%.2f", area));
	 
	scan.close();
}
}
