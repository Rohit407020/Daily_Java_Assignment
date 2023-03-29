package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List list = new ArrayList();
       list.add("Pratik");
       list.add(98);
       list.add(9.2f);// autoboxing
       list.add('c');
       list.add(3, "hello");
       
       for(int i=0;i<list.size();i++) {
    	   System.out.println(list.get(i));
       }
	}

}
