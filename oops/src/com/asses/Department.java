package com.asses;

public class Department {
	private int deptId;
	private String dname;
	private String location,headOfDept;
	
	public void setDeptid(int did) {
		this.deptId=did;
	}
	public int getDeptid() {
		return this.deptId;
	}
	
	public void setDname(String dn) {
		this.dname=dn;
	}
	public String getDname() {
		return this.dname;
	}
	
	public void setLocation(String l) {
		this.location = l;
	}
	
	public String getLocation() {
		return this.location;
	}
	

}
