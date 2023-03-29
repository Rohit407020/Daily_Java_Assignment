package com.bankdemo;


class SBI{
	public void getInstrest() {
		System.out.println("SBI Rate of Intrest : 4%");
	}
}
class ICICI extends SBI{
	@Override
	public void getInstrest() {
		System.out.println("ICICI Rate of Intrest : 7%");
	}
}
class KOTAK extends ICICI{
	@Override
	public void getInstrest() {
		System.out.println("KOTAK Rate of Intrest : 5%");
	}
}

public class Bank {
   public static void main(String args[]) {
	   SBI s = new SBI();
	   s.getInstrest();
	   ICICI i = new ICICI();
	   i.getInstrest();
	   KOTAK k = new KOTAK();
	   k.getInstrest();
   }
}
