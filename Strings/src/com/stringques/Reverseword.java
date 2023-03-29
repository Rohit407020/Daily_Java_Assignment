package com.stringques;

public class Reverseword {
    static void reverse(String arr) {
//    	char[] str = arr.toCharArray();
    	String[] str = arr.split(" ");
    	String demo = "";
//    	for(int i = arr.length()-1;i>=0;i--) {
//    		demo = demo + arr.charAt(i);
//    	}
//    	System.out.println(demo);
    	
    	for(int i=str.length-1;i>=0;i--) {
    		
			
			demo = demo + str[i]+" ";
    	}
    	System.out.println(demo);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String a = "Java is Programing";
     //programing is java
     reverse(a);
	}

}
