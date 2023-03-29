package com.flow;
import java.util.*;
public class atmw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Withdraw Amount :");
		int amount = scan.nextInt();
		int total=0;
		int temp = 0;		
		
 ///  y => 5420 => 2000 : 2, 500=>0, 100=>4 remaining =>20
			if(amount>0){
				System.out.println("//////ATM Machine Calculator//////");
			if(amount>2000) {
				 int div = amount/2000;
				    temp =div;
				    div = div*2000;
				    amount = amount - div;			   
				    System.out.println("2000 : "+temp);
			}
		   
			if(amount>500) {
				int div = amount/500;
			    temp =div;
			    div = div*500;
			    amount = amount - div;
			    System.out.println("500 : "+temp);
			}
		    
		    
//		    System.out.println("remaining amount "+total);
			if(amount>100) {
				int div = amount/100;
				    temp =div;
				    div = div*100;
				    amount = amount - div;
//				    System.out.println("remaining amount "+total);
				    System.out.println("100 : "+temp);
			}
		   
			if(amount>50) {
				int div = amount/50;
				    temp =div;
				    div = div*50;
				    amount = amount - div;
				    
				    System.out.println("50 : "+temp);
			}
		   
		    System.out.println("remaining amount  "+amount);
		    
		           }
		  
		 }
		
		
	}




