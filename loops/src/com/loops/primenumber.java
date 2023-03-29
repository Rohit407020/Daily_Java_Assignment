package com.loops;
import java.util.*;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Eter number to check prime or not");
      int num = scan.nextInt();
      int flag = 0;
      if(num == 0 || num == 1 ) {
    	  System.out.println(num+" is not prime number");
      }
      else {
    	  for(int i=2;i<=num/2;i++) {
    		  if(num%i == 0) {
    			  System.out.println(num+" is not prime number");
    			  flag = 1;
    			  break;
    		  }
    	  }
    	if(flag==0) {
    		System.out.println(num+" is prime number");
    	}
      }
      
      scan.close();
		
	}

}
