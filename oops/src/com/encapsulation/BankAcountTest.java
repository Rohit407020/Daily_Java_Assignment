package com.encapsulation;
import java.util.*;
public class BankAcountTest {
//	private long accountNumber;
//    private String name;
//    private double balance;
//    private long debitCard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		BankAcount ba =new BankAcount();
	    ba.setAccountNumber(1234653);
		ba.setName("RK");
		ba.setBalance(16613);
		ba.setDebitCard(987654321);
		ba.display();
		
	}

}
