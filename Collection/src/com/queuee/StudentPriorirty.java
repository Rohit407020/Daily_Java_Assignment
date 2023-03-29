package com.queuee;

import java.util.PriorityQueue;
class MarksComparator implements Comparable<Student>{

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
public class StudentPriorirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       PriorityQueue<Student> pqs = PriorityQueue<>(10,new MarksComparator());
	}

}
