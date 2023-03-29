package com.stringques;

public class PrintAlphabetOfNextChar {
    public static void nextchar(String arr) {
    	char[] ch = arr.toCharArray();
    	
    	for(int i=0;i<ch.length;i++) {
    		ch[i] = (char) (ch[i]+1); 
    	}
    	 arr = new String(ch);
     	System.out.println(arr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Java => Kbwb
		
		String a = "Java";
		nextchar(a);
	}

}
