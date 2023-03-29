package com.nestedloops;

public class revt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1)	 	A
//		   AB
//		  ABC
//		 ABCD
//		ABCDE
		int n = 5;
		 char ch = 'A';
		 //A inrease to...
	     for(int i=1;i<=n;i++) {
	    	 //char ch = 'A';
	    	 //inner char gives 1st output
	    	 for (int j=1;j<=(n-i);j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 for(int k=1;k<=i;k++)
	    	 {
	    		 System.out.print(ch);
	    		 ch++;
	    	 }
	    	 System.out.println();
	     }
		}

	}
