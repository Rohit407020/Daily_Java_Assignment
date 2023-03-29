package com.encapsulation;
import java.util.*;
public class PhonePay {
	
	public void transaction(double balance,BankAcount na) {
		System.out.println("Welcome to Atm ");
		System.out.println("Enter Your Choice");
		System.out.println("1 : Credit Amount");
		System.out.println("2 : Debit Amount");
		System.out.println("3 : View Account");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		switch(ch) {
				case 1: System.out.println("Your Balance : "+na.getBalance());
						double pamt = na.getBalance();
						Scanner scan1 = new Scanner(System.in);
						System.out.println("Enter Credit Amount : "); 
						double namt = scan1.nextDouble();
						double amt = pamt + namt;
						System.out.println(na.display());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner name , bala, number
		//initially zero
		//switch add balance 
		// view            
		// debit balcance
		// view 
//		 private long accountNumber;
//	      private String name;
//	      private double balance;
//	      private long debitCard;
		Scanner scan = new Scanner(System.in);
		System.out.println("=========BackTech Bank=========");
		System.out.println("Enter New Account Number");
		long accountNumber = scan.nextLong();
		System.out.println("Enter Account Holder Name");
		String name = scan.next();
		System.out.println("Enter Balance (Initially Zero)");
		double balance = scan.nextDouble();
		System.out.println("Enter Debit Card Number");
		long debitCard = scan.nextLong();
		System.out.println("=========BackTech Bank=========");
		
		BankAcount newAccount = new BankAcount();
		newAccount.setAccountNumber(accountNumber);
		newAccount.setName(name);
		newAccount.setBalance(balance);
		newAccount.setDebitCard(debitCard);
		
		newAccount.display();
//		transaction(balance, newAccount);
		
        
	}

}
