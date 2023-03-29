package com.hashmaplogic;

import java.util.HashMap;
import java.util.Map;
public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Student1, String> smap = new HashMap<>();
		
		smap.put(new Student1(1,"Pratik",89f), "Java");
		smap.put(new Student1(2,"Rohit",98.4f), "Python");
		smap.put(new Student1(3,"Datta",95.4f), "Java");
		smap.put(new Student1(4,"Sonay",80f), "Python");
		
		for(Map.Entry<Student1, String> sm:smap.entrySet())
		{
			if(sm.getValue().equals("Java"))
			{
				System.out.println(sm.getKey());
			}
		}
	}

}
