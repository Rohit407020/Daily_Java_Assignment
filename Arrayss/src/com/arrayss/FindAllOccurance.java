package com.arrayss;

import java.util.Scanner;

public class FindAllOccurance {
	
	 static void  search(int ar[],int value) {
		 int pos = 0;
         for(int i = 0; i<ar.length;i++)
         {
        	
        	if(ar[i] == value) {
        		pos = pos + i;
        		System.out.println(value+" present");
        		System.out.println("POsition "+(pos));
        	}
        	
         }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 Scanner scan =  new Scanner(System.in);
	        System.out.println("Enter SIze");
	        int size = scan.nextInt();
	        int arr[] = new int[size];
	        
	        for(int i = 0; i<arr.length;i++) {
	        	 arr[i] = scan.nextInt();
	        }
	        System.out.println("Enter search value");
	        int value = scan.nextInt();

	        search(arr,value);
	}
}