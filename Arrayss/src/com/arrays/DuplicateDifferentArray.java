package com.arrays;

public class DuplicateDifferentArray {
	
	public static void duplicate(int arr[],int brr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<brr.length;j++) {
				if(arr[i] != brr[j]) {
					System.out.println(arr[i]);
					
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {1,2,3,4,5};
       int b[]= {1,2,3,9,10,11};
       
       duplicate(a,b);
    		   }

}
