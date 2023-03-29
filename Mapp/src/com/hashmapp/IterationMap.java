 package com.hashmapp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IterationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashMap<String,Double> m = new HashMap<>();
		m.put("Pratik", 97.0);
		m.put("Leo", 96.2);
		m.put("Abhi", 77.3);
		m.put("Neo", 86.6);
		m.put(null, null);
		m.put("Pratiki", null);
		
		System.out.println(m);
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		Set<String> keySet = m.keySet();
		
		for(String k:keySet) {
			System.out.println(k);
		}
		
		/// key value pair//
		
		Set<String> k1 = m.keySet();
		Iterator<String> itr = k1.iterator();
		while(itr.hasNext()) {
			String k = itr.next();
			System.out.println(k+" "+m.get(k));
		}
		
		System.out.println(m.entrySet());
		
		System.out.println(m.get(keySet));
		System.out.println(m.entrySet());
	}

}
