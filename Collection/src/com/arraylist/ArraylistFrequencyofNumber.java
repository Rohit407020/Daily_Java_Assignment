package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraylistFrequencyofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> list = new ArrayList<Integer>();
	       list.add(56);
	       list.add(98);
	       list.add(56);// autoboxing
	       list.add(53);
	       list.add(51);
	       
	     System.out.println(list);
	     int count;
	     for(int i=0;i<list.size();i++) {
	    	 if(list.get(i) == 1)
	    		 continue;
	    	 count =1;
	    	 for(int j=i+1;j<list.size();j++) {
	    		 if(list.get(i)==list.get(j)) {
					 count++;
					 list.set(j, 1);
				 }
	    	 }
	    	 System.out.println(list.get(i)+" :"+count);
	     }
	}

}
