package com.stringques;

import java.util.Scanner;

public class PalindromeString {
     
	public static void palindrome(String s) {
		//Rohit
		int flag = 0;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				flag =1;
			}
		}
		if(flag == 1) {
			System.out.println(s+" is not Pallindrome");
		}
		else {
			System.out.println(s+" is  Pallindrome");
		}
		
			
	}
	///
	public static void reverse(String s) {
		
		String newS ="";
		for(int i=s.length()-1;i>=0;i--) {
			newS = newS + s.charAt(i);
		}
		System.out.println(newS);
		System.out.println(s);
		
		if(newS.equals(s)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // inout : Rohit   tihoR NOt pallindrome
		//mam mam pallindrome
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.next().toLowerCase();
		
		//palindrome(s);
		reverse(s);
		
	}

}
