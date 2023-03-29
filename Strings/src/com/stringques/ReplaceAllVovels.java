package com.stringques;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceAllVovels {
    
	public static void replacevovels(String arr) {
		
		
		for(int i=0;i<arr.length();i++) {
			if(arr.charAt(i)=='A'||arr.charAt(i)=='E'||arr.charAt(i)=='I'||arr.charAt(i)=='O'||arr.charAt(i)=='U') {
				arr = arr.replace(arr.charAt(i),'@');
				
			}
		}

		
		
		System.out.println(arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Replace vovel : aeiou
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENter String");
		String a = scan.next().toUpperCase();
		replacevovels(a);
	}

}
