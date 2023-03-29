package com.pattern;
import java.util.*;
public class squareadv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      ***
//      123
//      ***
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1;i<=n;i++) {
			if(i%2==0) {
				
				int k = 1;
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			}
			else {
				char ch = 'A';
				for(int j=1;j<=n;j++) {
//					System.out.print("*");
					System.out.print(ch+" ");
					ch++;
					
				}
				System.out.println();
			}
		}
	}

}
