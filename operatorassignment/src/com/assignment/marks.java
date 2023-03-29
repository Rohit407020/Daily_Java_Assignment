package com.assignment;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chem,math,physics,bio,eng,cal;
		double avg,per;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks of chemistry");
		chem = scan.nextInt();
		System.out.println("Enter marks of Maths");
		math = scan.nextInt();
		System.out.println("Enter marks of Physics");
		physics = scan.nextInt();
		System.out.println("Enter marks of Biology");
		bio = scan.nextInt();
		System.out.println("Enter marks of English");
		eng= scan.nextInt();
		
		cal = chem+math+physics+bio+eng;
		per = cal/5;
		
		System.out.println("Total Marks "+cal+"/500");
		System.out.println("Percentage "+per);
		
		
		
		
		scan.close();
	}

}
