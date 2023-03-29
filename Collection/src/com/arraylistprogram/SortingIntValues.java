package com.arraylistprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingIntValues {
	public static void sortvalue(List<Integer> list) {
		int temp;
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(list.get(i)<list.get(j)) {
					temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
	}
  public static void main(String arg[]) {
	  List<Integer> list = new ArrayList<Integer>();
      list.add(56);
      list.add(98);
      list.add(56);// autoboxing
      list.add(53);
      list.add(51);
      
      System.out.println(list);
      sortvalue(list);
      System.out.println(list);
  }
}
