package com.encapsulation;

public class gettersetterdemo {
	 private long accountNumber;
     private String name;
     private double balance;
     private long debitCard;
     
//     public void setAccountNumber(long an) {
//   	  this.accountNumber = an;
//     }
//     public long getAccountNumber() {
//   	  return this.accountNumber;
//     }
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
}
