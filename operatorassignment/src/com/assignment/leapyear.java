package com.assignment;
import java.util.*;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//The year is a multiple of 400.
		//The year is multiple of 4 but not 100.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year :");
		int y = scan.nextInt();
		
		if(((y%4==0) && (y%100!=0)) || (y%400==0))
		{
			System.out.println(y+" is leap year");
		}
		else {
			System.out.println(y+" is not leap year");
		}
		scan.close();
		
	}

}
