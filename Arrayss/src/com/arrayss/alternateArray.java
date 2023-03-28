package com.arrayss;

import java.util.Scanner;

public class alternateArray {
	  
//	 static void  array(int ar[]) {
//      for(int i = 0; i<ar.length;i++)
//      {
//     	if(i%2==0) {
//     		
//     		System.out.println(ar[i]+" ");
//     	}
//      }
//      return 
	
      static void  array(int ar[]) {
          for(int i = 0; i<ar.length;i+=2)
          {
         	
         		
         		System.out.println(ar[i]+" ");
         	
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
//        for(int i = 0; i<arr.length;i++)
//        {
//        	
//        }
        array(arr);
        
	}

}
