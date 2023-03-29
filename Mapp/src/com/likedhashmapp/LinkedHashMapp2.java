package com.likedhashmapp;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashMap<String,Double> lmap = new LinkedHashMap<>();
        
        lmap.put("Rohit", 85.2);
        lmap.put("Pratik", 84.2);
        lmap.put("Shivam", 80.2);
        lmap.put("Datta", 88.2);
        
       lmap.get("Pratik");
        for(Map.Entry<String , Double> en : lmap.entrySet()) {
        	System.out.println(en.getKey()+" "+en.getValue());
        	
        }
        
//        Set<String> name = lmap.keySet();
//        Iterator<String> itr = name.iterator();
//        while(itr.hasNext()) {
//        	String k = itr.next();
//        	System.out.println();
//        }
        
	}

}
