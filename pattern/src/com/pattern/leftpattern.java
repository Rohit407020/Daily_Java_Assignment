package com.pattern;
import java.util.*;
public class leftpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int k =1;
     for(int i=1;i<=n;i++) {
    	 if(i%2!=0) {
    	 for(int j=1;j<=(n-i);j++) {
    		 System.out.print(" ");
    	 }
    	
    	 for(int l=1;l<=i;l++) {
    		 System.out.print(k+" ");
    		 k++;
    	 }
    	 System.out.println();
     }
    	 else {
    		 char ch ='A';
    		 for(int j=1;j<=(n-i);j++) {
        		 System.out.print(" ");
        	 }
        	
        	 for(int l=1;l<=i;l++) {
        		 System.out.print(ch+" ");
        		 ch++;
        	 }
        	 System.out.println();
         }
    	 }
     }
	}

