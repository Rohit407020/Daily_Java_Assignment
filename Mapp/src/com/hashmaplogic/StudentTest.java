package com.hashmaplogic;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentTest {
	private static void searching(HashMap<Student, String> mp, String name) {
		Student s = null;
		String course = null;
		
		for(Entry<Student, String> en:mp.entrySet())
		{
			s.en.getKey();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HashMap<Student,String> mp = new HashMap<>();
		mp.put(new Student("Pratik",101,23), "JAVA");
		mp.put(new Student("Leo",102,24), "C++");
		mp.put(new Student("Datta",103,25), "PHP");
		
		//searching
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		searching(mp,name);
	}
	
	

}
