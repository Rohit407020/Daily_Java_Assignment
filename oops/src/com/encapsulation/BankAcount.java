package com.encapsulation;

public class BankAcount {
//      private int acid;
      private long accountNumber;
      private String name;
      private double balance;
      private long debitCard;
      
      ///getter setter
//      public void setDeptid(int did) {
//  		this.deptId=did;
//  	}
//  	public int getDeptid() {
//  		return this.deptId;
//  	}
      public long getAccountNumber() {
  		return accountNumber;
  	}
  	public void setAccountNumber(long accountNumber) {
  		this.accountNumber = accountNumber;
  	}
  	public String getName() {
  		return name;
  	}
  	public void setName(String name) {
  		this.name = name;
  	}
  	public double getBalance() {
  		return balance;
  	}
  	public void setBalance(double balance) {
  		this.balance = balance;
  	}
  	public long getDebitCard() {
  		return debitCard;
  	}
  	public void setDebitCard(long debitCard) {
  		this.debitCard = debitCard;
  	}
  	
  	public void display() {
  		System.out.println("=====================================");
  		System.out.println("Account Number : "+this.accountNumber);
  		System.out.println("Account Holder Name : "+this.name);
  		System.out.println("Account Balance : "+this.balance);
  		System.out.println("Account Debitcard : "+this.debitCard);
  		System.out.println("=====================================");
  	}
  }
