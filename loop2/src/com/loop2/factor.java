package com.loop2;

public class factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num = 20;
      //6 => 2*3 
      int factor=0;
      for(int i = 2;i<=num/2;i++) {
    	  if(num%i==0) {
    		  System.out.println(i);
    	  }
      }
	}

}
