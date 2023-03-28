package com.arrayss;

import java.util.Arrays;


public class SortingArray {
	public static void sorting(int ar[])
	{
		int temp;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("After SOrting :");
	     System.out.println(Arrays.toString(ar));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[] = {5,6,4,1,2};
     
     System.out.println("Before SOrting :");
     System.out.println(Arrays.toString(a));
     sorting(a);
     
     
     
	}

}
