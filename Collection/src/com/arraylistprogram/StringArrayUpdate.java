package com.arraylistprogram;

import java.util.ArrayList;

public class StringArrayUpdate {
    public static void update(ArrayList<String> list) {
    	// shuruti@gmail.com
    	String a = "@gmail.com";
    	
    	for(int i=0;i<list.size();i++) {
    		list.set(i, list.get(i)+a);
    	}
    	System.out.println(list);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
	       list.add("Shuruti");
	       list.add("Pratik");
	       list.add("Shivam");// autoboxing
	       list.add("Datta");
	       
	       
	       update(list);
	}

}
