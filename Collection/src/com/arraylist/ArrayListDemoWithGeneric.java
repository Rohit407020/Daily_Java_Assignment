package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoWithGeneric {
/// retrict data type type sefty
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> list = new ArrayList<Integer>();
       list.add(56);
       list.add(98);
       list.add(9);// autoboxing
       list.add(53);
       list.add(3, 66);
       
       for(int i=0;i<list.size();i++) {
    	   
    	   System.out.println(list.get(i)+5);
       }
	}

}
