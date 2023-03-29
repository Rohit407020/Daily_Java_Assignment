package com.arraylistprogram;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistsortnegativepositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(3);
		num.add(5);
		num.add(-10);
		num.add(-4);
		num.add(6);
		num.add(8);
		num.add(-1);
		
		System.out.println(num);
		int half = num.size();
		int temp;
		for(int i=0;i<half;i++) {
			for(int j=0;j<half;j++) {
				if(num.get(i)>num.get(j)) {
					temp = num.get(i);
					num.set(i, num.get(j));
					num.set(j, temp);
					
					
				}
				
				
			}
			
			
		}
		System.out.println(num);
	}

}
