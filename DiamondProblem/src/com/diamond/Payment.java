package com.diamond;

public class Payment implements Amazon, Flipcart{
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		Amazon.super.pay();
		Flipcart.super.pay();
	}
	
		// TODO Auto-generated method stub
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Amazon S = new Amazon();
	        S.pay();
		}
	}

	


