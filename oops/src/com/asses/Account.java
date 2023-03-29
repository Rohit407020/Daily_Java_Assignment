package com.asses;

public class Account {
    private int AcountNumber;
    private String Name;
    private float Amount;
    
    //only access in class
    
    public void openAccount() { 
    	fillDetails(123123,"RK",12321);
    }
    private void fillDetails(int an,String n,float a)
    {
    	AcountNumber = an;
    	Name = n;
    	Amount = a;
    }
    void showDetails() {
    	// default access
    	System.out.println("Name :"+Name);
    	System.out.println("Account NUmber :"+AcountNumber);
    	System.out.println("Amount :"+Amount);
    }
    public static void main(String args[]) {
    	//now create obj of account
    	Account a = new Account();
    	
    	
    }
}
