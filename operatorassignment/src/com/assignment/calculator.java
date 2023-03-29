package com.assignment;

import java.util.Scanner;

public class calculator {
	public static void main(String args[])	
	{
		int num1, num2, ans;
		String op;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number");
		num1 = scan.nextInt();
		System.out.println("Enter Operation : + - / *");
		op = scan.next();
		
		
		System.out.println("Enter a second number");
		num2 = scan.nextInt();
		if(op.length()==1) {
			char ch = op.charAt(0);
		
		if(ch=='+')
		{
			ans = num1+num2;
			System.out.println(num1+" + "+num2+" = "+ans);
			
		}
		else if(ch=='-'){
			ans = num1-num2;
			System.out.println(num1+" - "+num2+" = "+ans);
			
		}
		else if(ch=='/')
		{
			ans = num1/num2;
			System.out.println(num1+" / "+num2+" = "+ans);
			
		}
		else if(ch=='*')
		{
			ans = num1*num2;
			System.out.println(num1+" x "+num2+" = "+ans);
			
		}
		}
		else {
			System.out.println("operator wrong");
		}
		
	}
	
}

