package com.innerc;

import com.innerc.Bank.Locker;

class Bank{
	private static String bankName = "SBI";
	 String bankLocation;
	 int regNo;
	 
	 {
		 bankLocation = "Delhi";
		 regNo = 789;
	 }

	@Override
	public String toString() {
		return "Bank [bankLocation=" + bankLocation + ", regNo=" + regNo + "]";
	}
	 //class locker
	class Locker{
		int lId;
		String custName;
		static int lockerRent=2000;
		
		public void enter(int id,String name) {
			lId = id;
			custName = name;
			System.out.println("The locker "+lId+" Bank"+bankName+" Customer "+custName);
		}
		void rentdisplay() {
			System.out.println("Rent :"+lockerRent);
		}
	}
 }
public class SimpleInner {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1st way
		Bank b1 = new Bank();
		Bank.Locker l1 = b1.new Locker();
		l1.enter(1, "Pratik");
		//2nd way
		Bank.Locker lock = new Bank().new Locker();
		lock.enter(1, "Pratik");
		l1.rentdisplay();
	}

}
