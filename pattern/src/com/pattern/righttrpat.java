package com.pattern;
import java.util.*;
public class righttrpat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       1
//       123
//       1234
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		int k=1;
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=i;j++) {
				
				System.out.print(k+"");
				k++;
			}
			System.out.println();
		}
	}

}
