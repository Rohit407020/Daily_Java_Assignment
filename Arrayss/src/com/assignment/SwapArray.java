package com.assignment;

import java.util.Arrays;

public class SwapArray {
//	 WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9,0, 2, 4]
	
//	traverse
	public static void swap(int arr[]) {
		int j =arr.length/2; // 2 4
		int temp;
		for(int i =0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i]=arr[j];
			arr[j] = temp;
			j++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[] = {1,2,5,7,3,4,6};
         System.out.println(Arrays.toString(a));
         swap(a);
         System.out.println(Arrays.toString(a));
         
	}

}
