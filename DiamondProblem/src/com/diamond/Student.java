package com.diamond;

public interface Student {
   default void display(){
	   System.out.println("THis is Student");
   }
}
