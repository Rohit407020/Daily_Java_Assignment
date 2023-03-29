package com.linkedlistt;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("PHP");
		list.add("CSS");
		list.add("APL");
		list.add(".Net");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@2");
		// desending ir=terator 
		Iterator<String> itr2 = list.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		/// listIterator
		ListIterator<String> litr = list.listIterator(list.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	}

}
