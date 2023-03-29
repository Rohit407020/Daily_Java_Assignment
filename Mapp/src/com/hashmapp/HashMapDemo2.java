package com.hashmapp;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		HashMap<Integer, String> m = new HashMap<>();
		m.put(1, "JAVA");
		m.put(2, "C");
		m.put(3, "C");
		m.put(1, "JAVA");
		
//		Set<Entry<Integer,String>> e1 = m.entrySet();
		Set<Map.Entry<Integer,String>> e1 = m.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = e1.iterator();
        while(itr.hasNext()) {
        	Map.Entry<Integer, String> entry = itr.next();
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
        /// 2nd way
        for(Map.Entry<Integer,String> e2 : m.entrySet()) {
        	System.out.println(e2.getKey()+" "+e2.getValue());
        }
        ///3rd way
       
	}

}
