package com.arraylistss;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Arraylistans extends Arraylistabs{

	

	@Override
	void itrate(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("dfsd");
		
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	@Override
	void usingForloop(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	@Override
	void usingForeach(ArrayList<Integer> list) {
		for(Integer l:list) {
			System.out.println(l);
		}
		
	}
	@Override
	void removeElement(ArrayList<String> list) {
		// TODO Auto-generated method stub
		
		System.out.println(list);
		list.remove("Shivam");
		System.out.println(list);
	}
//	@Override
//	void removeAllElement(ArrayList<String> list2) {
//		// TODO Auto-generated method stub
//		   list.removeAll(list);
//		   
//	}
	@Override
	void retainAllElements(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println(list);
		list.retainAll(list);
		System.out.println(list);
	}
	@Override
	void knowHowManyElements(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int ele = list.size();
		System.out.println(ele);
		
	}
	@Override
	void arrayListEmptyOrNot(ArrayList<String> list) {
		// TODO Auto-generated method stub
		System.out.println(list);
		//have null value
	}
	@Override
	void searchElement(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("Enter Element");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int flag = 0;
		for(int i=0;i<list.size();i++) {
			if(list.contains(s)) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println(s+" element is present");
		}
		else {
			System.out.println(s+ " Not present");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylistabs ans = new Arraylistans();
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Integer");
		
			list.add(5);
			list.add(1);
			list.add(4);
			list.add(3);
			ArrayList<String> list2 = new ArrayList<>();
			
			list2.add("Pratik");
			list2.add("Rohit");
			list2.add("Shivam");
			list2.add("Om");
			list2.add(null);
			
		
//		ans.itrate(list);
//		ans.usingForloop(list);
//		ans.usingForeach(list);
//		ans.removeElement(list2);
//		ans.removeAllElement(list);
//		ans.retainAllElements(list);
//		ans.knowHowManyElements(list);
//			ans.arrayListEmptyOrNot(list2);
			ans.searchElement(list);
			
	}
	

	

	
	
	

	

}
