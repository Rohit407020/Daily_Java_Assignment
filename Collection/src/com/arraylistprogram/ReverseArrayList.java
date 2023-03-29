package com.arraylistprogram;

import java.util.ArrayList;

public class ReverseArrayList {
  public static void reverese(ArrayList<String> list) {
	  
	  for(int i=list.size()-1;i>=0;i--) {
		  list.add(list.get(i));
		  
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
	       list.add("Pratik");
	       list.add("Akshay");
	       list.add("Shivam");// autoboxing
	       list.add("Leomord");
	       list.add("Datta");
	       
	       reverese(list);
	       System.out.println(list);
	}

}
