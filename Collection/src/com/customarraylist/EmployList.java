package com.customarraylist;

import java.util.ArrayList;

public class EmployList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<Employee> el = new ArrayList<>();
		el.add(new Employee("Pratik",78000));
		el.add(new Employee("Shivam",79000));
		el.add(new Employee("RK",45000));
	   
		for(int i=0;i<el.size();i++) {
			 Employee el2 = el.get(i);
			 System.out.println(el2);
		}
	}

	 

}
