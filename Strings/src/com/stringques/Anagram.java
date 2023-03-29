package com.stringques;

import java.util.Arrays;

public class Anagram {
//    static void Sort(String abs) {
//    	char [] ch = abs.toCharArray();
//    	char temp;
//    	 for(int i=0;i<=ch.length;i++) {
//    		 for(int j =i+1;j<ch.length;j++) {
//    			 if(ch[i]>ch[j])
//    			 {
//    				 temp = ch[i];
//    				 ch[i] =ch[j];
//    				 ch[j] = temp;
//    			 }
//    		 }
//    	 }
//    }
	static void anagramm(String arr,String brr) {
//		
//		Sort(arr);
//		Sort(brr);
		char [] ch1 = arr.toCharArray();
		char [] ch2 = brr.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		System.out.println(arr);
	
		if(Arrays.equals(ch1, ch2))
		{
		
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      a = "Hello";
		
		String a = "Hello".toLowerCase();
		String b ="elloH".toLowerCase();
		anagramm(a,b);
	}

}
