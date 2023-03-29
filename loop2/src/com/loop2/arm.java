package com.loop2;
import java.util.*;
public class arm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number :");
		//num = 153 = > len ->3 , num cross check,counter
		int num = scan.nextInt();
		int originalnum = num;
		int digit=0;
		int armst =0;
		while(num!=0) {
			num = num/10;
			digit++;
			
		}
		System.out.println("number of digit "+digit);
		System.out.println("number of digit "+num);
		num = originalnum;
		while(num!=0) {
			int rem = num%10;
			num = num/10;
			//power calculate
			int n = 1;
			for(int i = 1;i<=digit;i++) {
				n = rem*n;
//				System.out.println("pow number "+n);
			}
			armst = armst+n;
//			System.out.println("value "+armst);
		}
		if(armst==originalnum) {
			System.out.println("It is armstrong number");
		}
		else {
			System.out.println("Not");
		}
	}

}
