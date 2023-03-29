package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> stud = new ArrayList<>();
	      stud.add("Pratik");
	      stud.add("Shivam");
	      stud.add("Pratik");//null aloloe
	      stud.add("Rohit");
	      stud.add("Pratik");//dupli allow
		  
	      Iterator<String> itr = stud.iterator();//cursor pos befor first obj
//	      while(itr.hasNext()) {
//	    	  System.out.println(itr.next());
//	    	  //iterator only for traversal
//	    	  
//	      }
	      System.out.println("$$$$$$$$4");
	      while(itr.hasNext()) {
	    	  String name = itr.next();
	    	  if(name.equals("Pratik")) {
	    		 itr.remove();
	    		  
	    	  }
	    	  System.out.println(stud);
	    	  //iterator only for traversal
	      }
	}

}
