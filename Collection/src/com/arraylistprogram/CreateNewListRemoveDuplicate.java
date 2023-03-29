package com.arraylistprogram;

import java.util.ArrayList;
import java.util.List;

public class CreateNewListRemoveDuplicate {
    public static void Createlist(ArrayList<String> list) {
    	
    	ArrayList<String> ulist = new ArrayList<>();
    	for(int i=0;i<list.size();i++) {
    		if(!ulist.contains(list.get(i))) {
    			ulist.add(list.get(i));
    		}
    	}
    	System.out.println(ulist);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
	       list.add("A");
	       list.add("B");
	       list.add("B");// autoboxing
	       list.add("X");
	       list.add("Y");
	       
	       Createlist(list);
	}

}
