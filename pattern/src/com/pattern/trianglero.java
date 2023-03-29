package com.pattern;
import java.util.*;
public class trianglero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      1234
//	    123
//	    12
//	    1
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		/// i = row -1, i>=0,i--; 
	    for(int i=n-1;i>=0;i--) {	
	    	int k =1;
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(k+"");
	    		k++;
	    	}
	    	System.out.println();
	    }
	}

}
