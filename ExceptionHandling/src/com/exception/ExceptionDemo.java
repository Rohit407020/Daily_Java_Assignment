package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a1 = 0;
      int b1 =90;
      try {
      int c1= b1/a1;
      System.out.println(c1);
      }
      catch(ArithmeticException e) {
    	  System.out.println("Exceptoin :"+e.getMessage());
      }
      System.out.println("Hello");
      ////
//      float a = 0;
//      float b =90;
//      
//      float c = b/a;
//      System.out.println(c);//infinity
//	}
	}

}
