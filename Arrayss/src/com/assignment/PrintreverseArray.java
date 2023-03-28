package com.assignment;

import java.util.Arrays;

public class PrintreverseArray {
//	WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your
//			output must be 78, 37, 29, 45, 90, 3
	
	public static void reversearray(int arr[]) {
//		   int newarr[] = new int[arr.length];
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[j]+", "); 
			}
			

	}
	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		
		int a[] = {3, 90, 45, 29, 37, 78};
		System.out.println("Before Array");
		System.out.println(Arrays.toString(a));
		reversearray(a);
		
	}

}
