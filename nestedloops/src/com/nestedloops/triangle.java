package com.nestedloops;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int n=4;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1;i<=n;i++) {
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
