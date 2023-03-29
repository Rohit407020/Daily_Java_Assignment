package com.hashmaplogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortByValue {
	private static void sortedvalue(HashMap<Integer, String> map) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>(map.values());
		Collections.sort(al);
		LinkedHashMap<Integer,String> lmap = new LinkedHashMap<>();
		int k;
		for(String s:al) {
			for(Map.Entry<Integer, String> en: map.entrySet()) {
				if(en.getValue().equals(s)) {
					k = en.getKey();
					if(!lmap.containsKey(k)) {
						lmap.put(k, s);
					}
				}
			}
		}
		System.out.println(lmap);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> map = new HashMap<>();
	       map.put(1, "java");
	       map.put(6, "react");
	       map.put(3, "python");
	       map.put(4, "c++");
	       map.put(2, "php");
	       map.put(5, "c");
	       
	       sortedvalue(map);
	}

	

}
