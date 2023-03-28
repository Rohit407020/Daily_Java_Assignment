package com.abstactclass;

public abstract class Bank {
    int bankId;
    String bankName;
    
    abstract void setOfIntrest(float i);
    
    void getOfIntrest() {
    	System.out.println("Bank Id :"+bankId+" Bank Name :"+bankName);
    }
}
