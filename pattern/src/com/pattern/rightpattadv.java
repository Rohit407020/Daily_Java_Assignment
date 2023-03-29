package com.pattern;
import java.util.*;
public class rightpattadv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       1
//       AB
//       123
//       ABCD
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				char ch = 'A';
				for(int j=1;j<=i;j++) {
					System.out.print(ch+"");
				    ch++;
				}
				System.out.println();
			}
			else {
				int ch = 1;
				for(int j=1;j<=i;j++) {
					System.out.print(ch+"");
				    ch++;
				}
				System.out.println();
			}
			
			
		}
	}

}
