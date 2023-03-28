package com.arrayss;

import java.util.Scanner;

public class Maxinarrayy {
 
	static void checkmax(int ar[]) {
		int max =ar[0];
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
		}
		System.out.println("Max Value "+max);
	}
	static void checkmin(int ar[]) {
		int min =ar[0];
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		System.out.println("Max Value "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Size of array");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		checkmax(arr);
		checkmin(arr);
	}

}
