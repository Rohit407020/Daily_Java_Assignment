package com.assign;

public class Employee {
      private int eId;
      private String eName;
      private float sal,empHr,daAllowance;
      float total;
      
	 public Employee() {
		    System.out.println("Default Constructor");
	 }
	 public Employee(int eId,String eName,float sal) {
		 this.eId = eId;
		 this.eName = eName;
		 this.sal = sal;
		 this.empHr = (float) (0.35*this.sal);
		 this.daAllowance = (float) (0.3*this.sal);
	 }
	 
	 public float sallary() {
		 total = (float) (this.sal+this.empHr+this.daAllowance);
		return total;
		 
	 }
	 public void display() {
		 System.out.println("##################################");
		 System.out.println("Id :"+this.eId);
		 System.out.println("Name :"+this.eName);
		
		 System.out.println("Basic Sallary :"+this.sal);
		 System.out.println("Other Allowance :"+this.empHr+" and "+this.daAllowance );
		System.out.println("Total Sallary :"+total);
		 System.out.println("##################################");
	 }
}
