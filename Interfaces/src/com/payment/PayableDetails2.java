package com.payment;


class Shopping implements Payment{
	int amount;
	String Name;
	Shopping(){
		
	}
	Shopping(int amount,String Name){
		this.amount = amount;
		this.Name = Name;
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





public class PayableDetails2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
