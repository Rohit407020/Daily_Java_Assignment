package com.pattern;
import java.util.*;
public class righttrpat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  1     
//  13
//  135
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			int k =1;
			for(int j=1;j<=i;j++) {
				if(k!=2) {
					
				System.out.print(k+"");
				k++;
				}
				k++;
			}
			System.out.println();
		}
	}

}
