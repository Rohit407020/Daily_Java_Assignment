package com.loop2;

import java.util.Scanner;

public class altprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter number");
     
     int n = scan.nextInt();
     int count=1;
     int num =2;
     while(count<=n) {
    	 int flag = 0;
    	  for(int i = 2;i<=num/2;i++) {
    		  if(num%i == 0) {
    			  flag =1;
    			  break;
    		  }
    	  }
    	 if(flag == 0) { 
    		 
    		 //count increament
    		 
    		 if(count%2==0) {
    			 System.out.println(num);
    		 }
    		 count++;
//    		 System.out.println("///////");
//    		 System.out.println(num);
    		 
    	 }
    	 num++;
     }
	}

}
