package com.hashmaplogic;

import java.util.ArrayList;
import java.util.HashMap;

public class StoreNumber {
    public static String Covert(int n) {
		
    	String word = "";
    	
    	switch(n) {
    	case 1: word = "One";
    			break;
    	case 2: word = "Two";
    	break;
    	case 3: word = "Three";
    	break;
    	case 7: word = "Seven";
    	break;
    	
    	
    			
    	}
    	
    	
    	
    	return word;
    	
    }
    
    public static void occ(ArrayList<Integer> list) {
    	HashMap<String,Integer> map = new HashMap<>();
//    	int n = map.get(map);
    	for(int s: list) {
    		String w = Covert(s);
    		int c = 1;
    		if(map.containsKey(w)) {
    			c = map.get(w);
    			map.put(w, c+1);
    		}
    		else {
    			map.put(w, c);
    		}
    	}
    	System.out.println(map);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   1//   2//   3//   1//   4//   7//   1//   2
		
//		1:3
//		2:3
//		3:1
//		4:1
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(7);
		al.add(3);
		al.add(1);
		al.add(7);
		al.add(1);
	    
		occ(al);
		
	}

}
