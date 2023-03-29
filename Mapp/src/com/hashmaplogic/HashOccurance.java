package com.hashmaplogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashOccurance {
    public static void occurance(ArrayList<String> list) {
    	HashMap<String,Integer> map = new HashMap<>();
    	
    	for(String s:list) {
    		int count = 1;
    		if(map.containsKey(s)) {
    			count = map.get(s);
    			map.put(s, count+1);
    		}
    		else {
    			map.put(s, count);
    		}
    	}
//    	System.out.println(map);
    	for(Map.Entry<String, Integer> en:map.entrySet())
    	{
    		System.out.println(en.getKey()+" "+en.getValue());
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> al = new ArrayList<>();
         al.add("Pratik");
         al.add("Shivam");
         al.add("Pratik");
         al.add("Leo");
         al.add("Datta");
         al.add("ABD");
         al.add("Leo");
         
         occurance(al);
         
	}

}
