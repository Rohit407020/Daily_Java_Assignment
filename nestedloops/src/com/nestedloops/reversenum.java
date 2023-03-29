package com.nestedloops;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		     1 
//		    1 2 
//		   1 2 3 
//		  1 2 3 4 
//		 1 2 3 4 5 
//		1 2 3 4 5 6 

		int n = 6;
	     for(int i=1;i<=n;i++) {
            char ch ='A';
	    	 for (int j=1;j<=(n-i);j++)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 for(int k=1;k<=i;k++)
	    	 {
	    		 //Space gives pyramid
	    		 System.out.print(k+" ");
	    	 }
	    	 System.out.println();
	     }
		}

	}

