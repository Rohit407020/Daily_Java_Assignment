package com.arrays;

public class DuplicateDifferentArray2 {
	
	public static void duplicate(String arr[],String brr[]) {
		int flag = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<brr.length;j++) {
				if(brr[j].equals(arr[i])) {
					flag = 1;
					break;
				}
				if(flag == 0) {
					System.out.println(brr[j]);
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a[] = {"rk@gmail.com","pk@gmail.com","gk@gmail.com"};
       String b[]= {"rk@gmail.com","pk@gmail.com","gk@gmail.com","lk@gmail.com"};
       
       duplicate(a,b);
    		   }

}
