package com.arraylistprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElemntinArraylist {
    public static void SearchElement(ArrayList<String> list) {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter Character");
    	String a = scn.next();
    	int flag =0;
    	for(int i=0;i<list.size();i++) {
    		if(a.equals(list.get(i))) {
    			flag = 1;
    			}
    		
    	}
    	if(flag == 1) {
    		System.out.println(a+" is Present");
    		
    	}
    	else {
    		System.out.println(a+" is Not Present");
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ArrayList<String> list = new ArrayList<String>();
			       list.add("A");
			       list.add("B");
			       list.add("B");// autoboxing
			       list.add("X");
			       list.add("Y");
			       
			       SearchElement(list);
	}

}
