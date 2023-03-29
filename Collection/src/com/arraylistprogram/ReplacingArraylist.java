package com.arraylistprogram;

import java.util.ArrayList;
import java.util.List;

public class ReplacingArraylist {
//replace  below 30 to 40
	public static void replace(List<Integer> list) {
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<40) {
				list.set(i, 40);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
	       list.add(56);
	       list.add(98);
	       list.add(56);// autoboxing
	       list.add(23);
	       list.add(31);
	       System.out.println(list);
	       replace(list);
	       System.out.println(list);
	}

}
