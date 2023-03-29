package com.stringques;

import java.util.Scanner;

public class CountFrequency {
	
	public static void countfrequency(char[] arr){
		
		int flag;
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			if(arr[i] == 1)
				continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count ++;
					arr[j] = 1;
				}
			}
			System.out.println(arr[i]+" :"+count);
		}
	}
	///duplicate char print and count
	
	public static void duplicatechar(char[] arr){
			
			int flag=0;
			for(int i=0;i<arr.length;i++) {
				int count = 1;
				if(arr[i] == 1)
					continue;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i] == arr[j]) {
						count ++;
						arr[j] = 1;
						break;
					}
				}
				if(count>1) {
					System.out.println("Duplicate elemnts :"+arr[i]+" ");
					flag++;
				}
				
			}
			System.out.println("Duplictate count : "+flag);
		}
	public static void uniquecharacter(char[] arr){
		
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			if(arr[i] == 1)
				continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count ++;
					arr[j] = 1;
					break;
				}
			}
			if(count==1) {
				System.out.println("Duplicate elemnts :"+arr[i]+" ");
				flag++;
			}
			
		}
		System.out.println("Duplictate count : "+flag);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char[] b = new char[10];
		char[] a = {'a','b','c','c','s','b','c'};
//		Scanner scan = new Scanner(System.in);
//		for(int i =0;i<10;i++) {
//		 b = scan.next().charAt(i);
//		}
		countfrequency(a);
		//duplicatechar(a);
//		uniquecharacter(a);
	}

}
