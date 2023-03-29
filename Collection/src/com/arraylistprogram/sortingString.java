package com.arraylistprogram;

import java.util.ArrayList;

public class sortingString {
 public static void sort(ArrayList<String> list) {
	 String temp;
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(list.get(i).compareTo(list.get(j))>0) {
					temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
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
	       
	       sort(list);
	}

}
