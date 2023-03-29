package com.stringques;

import java.util.Arrays;

public class LenConRev {
       static void operation(String arr,String brr) {
    	  int ln =  arr.length();
    	   System.out.println("Length of "+arr+" is "+ln);
    	  String c = arr.concat(brr);
    	  System.out.println(c);
//    	  char[] d = arr.toCharArray();
//    	  System.out.println(d);
    	  int k = 0;
    	  int i;
    	  String n = "";
    	  for(i=arr.length()-1;i >= 0;i--) {
    		  n = n + arr.charAt(i);
    	  }
    	  System.out.println(n);
    	   
//    	  System.out.println(k);
    	
    	 
    	  
       }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "Hello";
        String b = "World";
        
        operation(a,b);
	}

}
