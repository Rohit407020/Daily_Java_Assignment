package com.switchd;

import java.util.Scanner;
public class sumofnaturalno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("enter number");
      int n = scan.nextInt();
      int sum = 0;
      for(int i=1;i<=n;i++) {
    	  sum =sum+i;
    	  
      }
      System.out.println(sum);
      scan.close();
	}
	

}
