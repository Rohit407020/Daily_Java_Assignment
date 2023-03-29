package com.loops;

public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num = 1234;
     int sum =0;
     // num!=0
     while(num!=0) {
    	 int r = num%10;
    	 num = num/10;
    	 System.out.println(r);
    	 sum=sum+r;
    	 
     }
     System.out.println(sum);
	}

}
