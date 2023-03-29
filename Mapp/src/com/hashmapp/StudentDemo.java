package com.hashmapp;

import java.util.HashMap;
import java.util.Map;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Student, String> map = new HashMap<>();
      
	  map.put(new Student(101,"Pratik",23), "Java");
	  map.put(new Student(102,"Rohit",23), "C++");
	  map.put(new Student(103,"Shivam",25), "Java");
	  map.put(new Student(104,"Pratiki",24), "C");

	  for(Map.Entry<Student, String> sm:map.entrySet()) {
		  
		  if(sm.getValue()=="Java") {
			  System.out.println(sm.getKey());
		  }
	  }
	  /// replace
 for(Map.Entry<Student, String> sm:map.entrySet()) {
		  
		  if(sm.getValue()=="Java") {
			  sm.setValue("Core Java");
			  System.out.println(sm.getKey());
		  }
	  }
	
	
	}

}
