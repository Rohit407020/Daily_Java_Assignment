package com.treemap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "Java");
	       map.put(6, "React");
	       map.put(3, "Python");
	       map.put(4, "c++");
	       map.put(2, "php");
	       map.put(5, "c");
	       map.put(8, null);
	       
	       for(Map.Entry<Integer, String> en: map.entrySet()) {
	    	   System.out.println(en.getKey()+" "+en.getValue());
	       }
	       System.out.println(map.firstKey());
	       System.out.println(map.lastKey());
	       
	       
	       System.out.println(map.headMap(3, false));
	       
	       SortedMap<Integer, String> sm = map.headMap(5);
	       System.out.println(sm);
	       System.out.println("#########################");
	       SortedMap<Integer, String> sm2 = map.tailMap(5);
	       System.out.println(sm2);
	       System.out.println("&&&&&&&^&&&&&&&&&&&&&&&&&&&");
	       SortedMap<Integer, String> sm3 = map.subMap(2,5);
	       System.out.println(sm3);
	       System.out.println(map.keySet());
	}

}
