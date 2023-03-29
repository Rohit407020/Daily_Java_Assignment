package com.loop2;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub  123   = 321   151  = 151
     Scanner scan = new Scanner(System.in);
     System.out.println("enter number");
     int num = scan.nextInt();
     int original = num;
     int reversenum =0; 
     int rem;
     while(num!=0) { 
    	 //123    
    	 rem = num%10; 
    	 reversenum = (reversenum*10)+rem;  //0*10+3 =3   //3*10+2 = 321 = 123
//    	 System.out.println(rem);
    	 num = num/10;
    	
     }
	
     if(original == reversenum)
     {
    	 System.out.println(original+" is palindrome");
     }
     else {
    	 System.out.println(original+" is not palindrome");
     }
	}

}
