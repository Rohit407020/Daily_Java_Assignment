package com.loop2;
import java.util.*;
public class alternateprime {

		public static void main(String[] args) {
			int num= 20;
			int flag = 1;
			System.out.println("upto 20 prime number");
		    for(int i=2;i<=num;i++) {
		    	if(num%i == 0) {
		    		flag =0;
		    		break;
		    	}
		    	
		    
		    }
		    if(flag==1) {
		    	System.out.println(num);
		    }
		
		}
}