package com.switchd;
import java.util.Scanner;
public class switchfunction {
	public static void main(String args[]) {
//		System.out.print("Hello");
		int p;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of person");
		p = scan.nextInt();
		
		switch(p) {
			case 1: 
			case 2:
			case 3:
			case 4:
				System.out.println("So lets go with Swift");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.println("Lets go with Ertiga");
			 	break;
			default:
				System.out.println("Let go with bus");
			
		}
	}

}

