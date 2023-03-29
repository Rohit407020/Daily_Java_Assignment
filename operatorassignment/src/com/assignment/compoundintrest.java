package com.assignment;
import java.util.*;
public class compoundintrest {
  public static void main(String args[]) {
//	  CI = (p * (Math.pow((1 + r / 100), t))); A = P (1 + r/n)^nt
	  
	  double p , t,r,ci;
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter Principal amout : ");
	  p = scan.nextDouble();
	  System.out.println("Enter time : ");
	  t = scan.nextDouble();
	  System.out.println("Enter rate : ");
	  r = scan.nextDouble();
	  
	  ci = (p * (Math.pow((1 + r / 100), t)));
	  System.out.println("Compound interest is "+String.format("%.3f", ci));
	  
	  scan.close();
	  
  }
}
