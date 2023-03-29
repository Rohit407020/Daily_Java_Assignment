package com.queuee;

import java.util.PriorityQueue;

public class PriorityQBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Book> pq = new PriorityQueue<>();
	    pq.add(new Book(1,"Otis",1235));
	    pq.add(new Book(3,"Neo",1555));
	    pq.add(new Book(2,"Nios",5412));
	   
	    
	    for(Book b: pq) {
	    	System.out.println(b);
	    }
	    
	}

}
