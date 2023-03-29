package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MethodsOfArrayss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> stud = new ArrayList<>();
      stud.add("Pratik");
      stud.add("Shivam");
      stud.add("Pratik");//null aloloe
      stud.add("Rohit");
      stud.add("Pratik");//dupli allow
	  
     System.out.println(stud);
     
     List<String> list =  stud.subList(1, 3);
//     System.out.println(list);
     
     for(int i=0;i<stud.size();i++) {
//    	 if(stud.get(i) == "Pratik") {
//    		 stud.remove(i);
//    	 }
    	 if(stud.contains("Pratik")) {
    		 stud.remove(stud.get(i));
    	 }
     }
     System.out.println(stud);
    
	}
      
	
}
