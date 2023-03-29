package com.custommap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentTest {
	
	public static void searchStudentFromCourse(ArrayList<Student> stud)
	{
		HashMap<String, ArrayList<String>> coumap = new HashMap<>();
		
		Iterator<Student> itr = stud.iterator();
		ArrayList<String> Studentlist;
		while(itr.hasNext())
		{
			Student s= itr.next();
			if(!coumap.containsKey(s.getC().getCname()))
			{
				Studentlist= new ArrayList<>();
				
			}
			else
			{
				Studentlist= coumap.get(s.getC().getCname());
				
			}
			Studentlist.add(s.getSname());
			coumap.put(s.getC().getCname(), Studentlist);
			
		}
		
		for(Map.Entry<String, ArrayList<String>> en: coumap.entrySet())
		{
			
			System.out.println("Course Name: "+en.getKey());
			System.out.println("Name :");
			Studentlist= en.getValue();
			for(String s:Studentlist)
			{
				System.out.print(s+"  ");
			}
			System.out.println();
			System.out.println("===========================================================");
		}
		
		
	}
	

	public static void main(String[] args) {
		ArrayList<Student> sal = new ArrayList<>();
		
		sal.add(new Student(101,"Rohit",22,new Course(1,"Java")));
		sal.add(new Student(102,"Shivam",25,new Course(1,"AWS")));
		sal.add(new Student(103,"Datta",24,new Course(1,"Data Science")));
		sal.add(new Student(104,"Harish",26,new Course(1,"AWS")));
		sal.add(new Student(105,"Pratik",23,new Course(1,"Java")));
		
		searchStudentFromCourse(sal);
	}

}
