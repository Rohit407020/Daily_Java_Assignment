package com.assignment;

import java.util.Arrays;

public class HalfSwap {
	public static void halfswap(int ar[]) {
    	
//		int j = ar.length/2;
		int temp;
		int i;
		for(i =0;i<ar.length/2;i++) {
			for(int j = i+1;j<ar.length/2;j++) {
				if(ar[i]>ar[j]) {
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
		
		int k = i;
		
		for(i =k;i<ar.length;i++) {
			for(int j = i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(ar));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a[] = {5,6,1,2,3,5,8,9};
		System.out.println(Arrays.toString(a));
		halfswap(a);
	}

}
