package com.payment;

class Shopping implements Payment{
	int amount;
	
	Shopping(){
		
	}
	Shopping(int n){
		this.amount = amount;
	}
	public void pay() {
		System.out.println("Amount Bill :"+amount);
	}
}

class Business implements Payment{
	int tax;
	int amount;
	Business(){
		
	}
	Business(int salary,int tax){
		this.amount = salary;
		this.tax = tax;
	}
	public void pay() {
		amount = this.amount - this.tax;
		System.out.println("Amount Bill :"+amount);
	}
}



public class PaymentDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shopping p1 = new Shopping(5000);
       p1.pay();
	}

}
