package com.arrayss;

public class Callbyreferece {
	static void productOfNumber(int a[]) {
		int product = 1;
		for(int i:a) {
			product = product*i;
		}
		System.out.println(product);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = new int[5];
		
		int a[] = {2,3,4,5,6};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		productOfNumber(a);
		
		
	}
	

}
