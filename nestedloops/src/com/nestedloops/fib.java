package com.nestedloops;
import java.util.*;
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        // 1 2 
		// 1 + 2 =3 // 2 + 3= 5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter upto number");
		int n = scan.nextInt();
		
		int a =1;
		int b =2;
		System.out.println(a);
		System.out.println(b);
		for(int i =1;i<=n;i++) {
			int c =a+b;
			//1+2 =3   //
			a=b;
			b=c;
			System.out.println(b);
		}
	}

}
