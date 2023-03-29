package com.diamond;

public interface Flipcart {
	default void pay(){
		   System.out.println("Pay on Flipcart App");
		   cod();   
	}
	private void cod() {
		System.out.println("COD available");
	}
}
