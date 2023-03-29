package com.nestedloops;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1 2 
		// 1 + 2 =3 // 2 + 3= 5
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
