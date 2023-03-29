package com.stringques;

import java.util.Arrays;

public class FrequencyOfEachWord {
     
	public static void Frequency(String arr) {
		int count;
		String str[] = arr.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			count = 1;
			if(str[i] == "1")
				continue;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;	
				str[j] = "1";
				break;
				}
				
				
			}
			System.out.println(str[i]+" :"+count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "Hello Java Welcome Hello";
      Frequency(a);
	}

}
