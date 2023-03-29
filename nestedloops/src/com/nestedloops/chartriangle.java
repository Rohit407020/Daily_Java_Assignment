package com.nestedloops;

import java.util.Scanner;

public class chartriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      
     
      for(int i=1;i<=n;i++)
      {
    	  char ch = 'A';
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print(ch);
    		  ch++;
    	  }
    	  System.out.println(" ");
      }
	}

}
