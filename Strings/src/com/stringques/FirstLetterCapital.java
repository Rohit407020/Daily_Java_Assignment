package com.stringques;

import java.util.Arrays;

public class FirstLetterCapital {
     static void capital(String a) {
    	 char ch[] = a.toCharArray();
    	 int flag = 0;
    	 for(int i=0;i<ch.length;i++) {
    		 if(Character.isWhitespace(ch[i])) {
//    			 ch[i] = Character.toUpperCase(ch[i]);
    			 flag = 0;
    		 }
    		 else if(flag == 0) {
    			 ch[i] = Character.toUpperCase(ch[i]);
    			 flag = 1;
    		 }
    	 }
    	 String n = new String(ch);
    	 System.out.println(n);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a = "I love my india";
       // I Love My India
       capital(a);
      
	}

}
