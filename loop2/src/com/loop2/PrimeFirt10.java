package com.loop2;

import java.util.Scanner;

public class PrimeFirt10 {

	public static void main(String[] args) {
		// TODO Auto-ge nerated method stub
		Scanner scan = new Scanner(System.in);
      System.out.println("ENter Number");
      int n = scan.nextInt();
      
      int count=0;
      int num =2;
      while(count<n/2) {
    	  int flag = 0;
    	  for(int i=2;i<=num/2;i++) {
    		  if(num%i == 0) {
    			  flag = 1;
    			  break;
    		  }
    	  }
    	 
    	  if(flag == 0) {
    	  System.out.println(num);
    	  count++;
    	  
    	 
    	  }
    	  num++;
    	  
      }
	}

}
