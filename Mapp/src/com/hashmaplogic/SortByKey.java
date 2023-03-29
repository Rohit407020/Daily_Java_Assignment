package com.hashmaplogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortByKey {
	private static void sortedkay(HashMap<Integer, String> map) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
//		Collections.sort(list);
		Collections.reverse(list);
		for(Integer i:list) {
			System.out.println(i+" "+map.get(i) );
		}
//		LinkedHashMap<Integer,String> map1  
//		for(Integer i:list) {
//			map.put(i, map.get(i));
//		}
//		System.out.println(map);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer, String> map = new HashMap<>();
       map.put(1, "Java");
       map.put(6, "React");
       map.put(3, "Python");
       map.put(4, "c++");
       map.put(2, "php");
       map.put(5, "c");
       
       sortedkay(map);
	}

	

}
