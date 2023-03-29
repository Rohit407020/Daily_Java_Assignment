package com.stringss;

import java.util.Arrays;

public class SortStringLength {
    public static void sort(String arr[]) {
    	String temp;
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i].length()==arr[j].length()) {
		    			if((arr[i].compareTo(arr[j]))>1) {
		    				temp = arr[i];
		    				arr[i] = arr[j];
		    				arr[j] = temp;
		    			}
    			}
    			else if(arr[i].length()>arr[j].length()) {
    				temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String at[] = {"java","c","asp.net","go","angular"};
      
      sort(at);
	}

}
