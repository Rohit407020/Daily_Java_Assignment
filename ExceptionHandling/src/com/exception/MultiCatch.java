package com.exception;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {1,2,3,4,5};
      
      try { 
    	  for(int i=0;i<=a.length;i++) {
    		  a[i] = a[i]/a[i+1];
    		  System.out.println(a[i]);
    	  }
       
      }
      catch(ArithmeticException e) {
    	  
      	   System.out.println(e.getMessage());
         }
      catch(Exception e) {
   	   System.out.println(e.getMessage());
      }
      
	}

}
