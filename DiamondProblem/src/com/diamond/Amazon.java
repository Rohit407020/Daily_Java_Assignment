package com.diamond;

public interface Amazon {
	default void pay(){
		   System.out.println("Pay on Amazon App");
	   }
}
