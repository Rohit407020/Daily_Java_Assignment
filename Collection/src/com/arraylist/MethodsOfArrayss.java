package com.arraylist;

import java.util.ArrayList;

public class MethodsOfArrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> stud = new ArrayList<>();
      stud.add("Pratik");
      stud.add("Shivam");
      stud.add(null);//null aloloe
      stud.add("Rohit");
      stud.add("Pratik");//dupli allow
	  
      System.out.println(stud);
      // add in index
      stud.add(2,"Rak");
      System.out.println("###########");
      System.out.println(stud);
      ArrayList<String> stud2 = new ArrayList<>();
      stud2.add("Leo");
      stud2.add("Mord");
      stud2.add("Bandeta");
      stud2.add("Aldus");
      System.out.println("###########");
      System.out.println(stud2);
      System.out.println("###########");
      stud.addAll(stud2);
      System.out.println(stud);
      System.out.println("###########");
      stud.remove("Pratik");///only the first occurance
      System.out.println(stud);
      System.out.println("###########");
//      stud.removeAll(stud2);///only the collection all remove
//      System.out.println(stud);
//      System.out.println("###########");
//      stud.retainAll(stud2);
//      System.out.println(stud2);
      
      System.out.println(stud.size());
	}
      
	
}
