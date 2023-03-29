package com.innerc;
class Mall{
	String name = "DMART";
	
	void doShopping() {
		class cart{
			int cId;
			String itemName;
			int price;
			static float bill = 0.0f;
			public void addBill(String itemName,int price) {
				this.itemName = itemName;
				this.price = price;
			}
			public void display() {
				System.out.println("--------");
				
			}
		}
	}
}
public class LocalInner {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
