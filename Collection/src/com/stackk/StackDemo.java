package com.stackk;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.push("DairyMIlk");
		stk.push("5Star");
		stk.push("Perk");
		stk.push("Kitkat");
		
		System.out.println(stk);
		Enumeration e = stk.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		stk.pop();
		System.out.println(stk);
		System.out.println(stk.search("5Star"));
		
	}
}
