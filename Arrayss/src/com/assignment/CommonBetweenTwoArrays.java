package com.assignment;

public class CommonBetweenTwoArrays {
//	Write a Java program to find the common elements between two arrays (int values)
//	Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91,
//	66, 22], so common between two arrays are 23 and 91 
	
	public static void commonelement(int arra[],int arrb[]) {
		
		//traverse
		for(int i=0;i<arra.length;i++) {
			for(int j=0;j<arrb.length;j++) {
				if(arra[i]==arrb[j]) {
				System.out.println("Common element :"+arra[i]);
			}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {12, 23, 34, 67 ,78, 91, 56};
       int b[] = {39, 25, 15, 23, 55, 91,66, 22};
       
       commonelement(a,b);
	}

}
