package com.assignment;

import java.util.Arrays;

public class SecondMinNumFInd {
//	 WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90]
	public static void secondmax(int arr[]) {
		// first sort and then find
		int temp;
		int secondMin;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		secondMin = arr[1];
		System.out.println(Arrays.toString(arr));
		System.out.println("Second min "+arr[secondMin]);
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = {20, 0, 31, 45, 100, 1, 105, 90};
        
//        Second max call
        secondmax(a);
	}
}
