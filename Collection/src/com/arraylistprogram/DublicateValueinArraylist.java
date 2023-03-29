package com.arraylistprogram;

import java.util.ArrayList;
import java.util.List;

public class DublicateValueinArraylist {
  public static void duplicatevalue(List<Integer> list) {
	  
	  for(int i=0;i<list.size();i++) {
			 for(int j=i+1;j<list.size();j++) {
				 if(list.get(i)==list.get(j)) {
					 System.out.println(list.get(j));
				 }
			 }
		 }
		 
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
	       list.add(56);
	       list.add(98);
	       list.add(56);// autoboxing
	       list.add(53);
	       list.add(51);
	       
	       duplicatevalue(list);
	}

}
