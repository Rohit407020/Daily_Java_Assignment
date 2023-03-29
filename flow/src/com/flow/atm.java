package com.flow;
import java.util.*;
public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Withdraw Amount :");
		int amount = scan.nextInt();
		int currency=0;
		//5000 =>  5000/5=> 2500=>500:   4500/ 
		//2000 => 
		
//		else if(amount == 500)
//		{
//			System.out.println("500 : 1");
//		}
//		else if(amount == 100)
//		{
//			System.out.println("100 : 1");
//		}
//		else if(amount == 50)
//		{
//			System.out.println("50 : 1");
//		}
		
		switch(amount) {
		 case 2000: if(amount == 2000) {
			     System.out.println("2000 : 1");
					}
		           else {
		        	 int div = amount/2000;
		        	 System.out.println(); 
		           }
		 }
		}
		
	}




