package com.hashmapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String, String> m= new HashMap<>();
       m.put("Pratik", "C++");
       m.put("Shivam", "Java");
       m.put("Piyush", "C");
       m.put("Leo", "PHP");
       
       System.out.println(m);
       
//      m.replace("Shivam", "Core Java");
//      System.out.println(m);
      
      Set<Map.Entry<String, String>> e1 =  m.entrySet();
      Iterator<Map.Entry<String,String>> itr = e1.iterator();
      while(itr.hasNext()) {
    	  Map.Entry<String, String> entry = itr.next();
    	  if(entry.getValue() == "Java") {
    		  entry.setValue("Core Java");
//    		  ((HashMap<String, String>) entry).put(entry.getValue(),"Core Java");
//    	      m.put(entry.getValue(), "Core Java");
    	  }
    	  System.out.println(entry.getKey()+" "+entry.getValue());
      }
       
	}

}
