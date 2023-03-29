package com.pattern;
import java.util.*;
public class squarenum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      123      
//      456
//      789
		Scanner scan = new Scanner(System.in);
		//how many iteration
		int n = scan.nextInt();
		//require another variable to in =creament loop k = 1 because start with 1
		int k = 1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
