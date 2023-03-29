package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorIterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
Vector<String> n = new Vector<>();
		
		n.add("OO");
		n.add("II");
		n.add("EE");
		n.add("DD");
		n.add("AA");
		n.add("CC");
		
		System.out.println(n);
		
		// iterate 
		Enumeration e = n.elements();
		
		while(e.hasMoreElements()) {
			String sr = (String) e.nextElement();
			System.out.println(sr);
			if(sr.equals("AA")) {
				n.remove("AA");
			}
		}
		
		System.out.println(n);
	}

}
