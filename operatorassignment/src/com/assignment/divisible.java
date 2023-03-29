package com.assignment;

import java.util.Scanner;

public class divisible {
  public static void main(String args[]) {
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a number to check it is divisible by 5 or 11");
	  int num = scan.nextInt();
	  
	  if(num%5 == 0) {
		  System.out.println(num+" is divisible by 5");
	  }
	  else if(num%11 == 0) {
		  System.out.println(num+" is divisible by 11");
	  }
	  else {
		  System.out.println(num+" is not divisible by 11 /5");
	  }
  }
}
