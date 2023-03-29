package com.stringques;

import java.util.Arrays;

public class SplitStringIntoEqualParts {

	public static void splitintoequal(String arr) {
		int len = arr.length();
		int n = 3;
		int noOfchar = len/n;
		String[] splitstr = new String[n];
		int temp = 0;
		if(len%n!=0) {
			System.out.println("Cannot Divide into equa; parts");;
		}
		else {
			for(int i=0;i<arr.length();i+=noOfchar) {
				splitstr[temp] = arr.substring(i, i+noOfchar);
			    temp++;
			}
			System.out.println(Arrays.toString(splitstr));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String a = "Programmings";
		splitintoequal(a);
	}

}
