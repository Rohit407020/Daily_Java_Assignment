package com.pattern;
import java.util.*;
public class rightpattr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    2
//    46
//    81012
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = 2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+"");
				k=k+2;
			}
			System.out.println();
		}
	}

}
