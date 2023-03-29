package com.arraylistprogram;
import java.util.*;
public class DublicateUniqukArraylist {

	public static void dublicate(ArrayList<String> a,ArrayList<String> b)
	{
		for(int i=0;i<a.size();i++) {
			
			if(a.contains(b.get(i))) {
				System.out.println(a.get(i));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		ArrayList<String> a= new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		
		a.add("Java");
		a.add("c");
		a.add("python");
		a.add("html");
		
		/////
		b.add("Java");
		b.add("Angular");
		b.add("c");
		b.add("c++");
		
		dublicate(a,b);
		
		
	}

}
