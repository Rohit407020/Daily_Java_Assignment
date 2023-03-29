package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Exersise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> list = new ArrayList<>();
     
     list.add("S1");
     list.add("S2");
     list.add("S3");
     list.add("S4");
     list.add("S5");
     list.add("S2");
     list.add("S3");
     
     System.out.println(list);
     for(int i=0;i<list.size();i++) {
    	 System.out.println(list.get(i));
     }
     System.out.println("Other Method for traverse");
	 for(String s:list) {
		 System.out.println(s);
	 }
	 System.out.println("Remove duplicate");
	 for(int i=0;i<list.size();i++) {
		 for(int j=i+1;j<list.size();j++) {
			 if(list.get(i)==list.get(j)) {
				 list.remove(j);
			 }
		 }
	 }
	 System.out.println(list);
	 Iterator<String> itr = list.iterator();//cursor pos befor first obj
     while(itr.hasNext()) {
   	  System.out.println(itr.next());
   	  //iterator only for traversal
   	  
     }
	}

}
