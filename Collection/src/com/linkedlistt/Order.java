package com.linkedlistt;

public class Order {
     private int oid;
     private String oname;
     private float price;
     
     public Order() {
 	
 	}
	public Order(int oid, String oname, float price) {
		
		this.oid = oid;
		this.oname = oname;
		this.price = price;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
     
     
}
