package com.arrayss;

import java.util.Scanner;

public class reverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Size of array");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("--------");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+"");
		}
		
		
	}
}
