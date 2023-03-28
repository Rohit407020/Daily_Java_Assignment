package com.arrayss;

import java.util.Scanner;

public class SimpleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Size");
      int size = scan.nextInt();
      
      int ar[] = new int[size];
      
      for(int i = 0; i<ar.length;i++) {
    	 ar[i]= scan.nextInt();
      }
      for(int i = 0; i<ar.length;i++) {
     	 System.out.println(ar[i]);
       }
      
	} 

}
