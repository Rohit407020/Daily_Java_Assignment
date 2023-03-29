package com.stringques;

public class ChangeCaseOfChar {
	
    public static void changecase(String arr) {
    	char chars[] = arr.toCharArray();
    	for(int i=0;i<chars.length;i++) {
    		char c =chars[i];
    		if(Character.isLowerCase(c)) {
    			chars[i] = Character.toUpperCase(c);
    		}
    		else if(Character.isUpperCase(c)) {
    			chars[i] = Character.toLowerCase(c);
    		}
    	}
     arr = new String(chars);
    	System.out.println(arr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // JaVa => jAvA
		
		String a = "JaVa";
		changecase(a);
	}

}
