package com.practice;

import java.util.Arrays;

public class HalfSort {
    public static void halfsort(int arr[]) {
//    	 int a[] = {9,7,2,1,0,1,4,9};
    	int temp;
    	for(int i = 0;i<arr.length/2;i++) {
    		for(int j = 0;j<arr.length/2;j++) {
    			if(arr[i]>arr[j]) {
    				temp = arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    			
    		}
    	}
    	System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {7,2,1,9,1,9,0,4};
      System.out.println(Arrays.toString(a));
      halfsort(a);
	}

}
