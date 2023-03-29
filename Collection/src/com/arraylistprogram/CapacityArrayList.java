package com.arraylistprogram;

import java.util.ArrayList;

public class CapacityArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list1 = new ArrayList<>(20);
        	
        list1.add(1);
        list1.add(2);
       System.out.println(); list1.trimToSize();
	}

}
