package com.hashmapp;

import java.util.HashMap;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Employee,String> map = new HashMap<>();
     
     map.put(new Employee(101,"Pratik"), "Develpment");
     map.put(new Employee(102,"Rohit"), "Support");
     map.put(new Employee(103,"Shivam"), "IT");
     
     
	}

}
