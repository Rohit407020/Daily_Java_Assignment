package com.queuee;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueee {
    public static void main(String[] args) {
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	
    	pq.add(76);
    	pq.add(61);
    	pq.add(11);
    	pq.add(22);
    	pq.add(53);
    	
    	System.out.println(pq);
    	Iterator<Integer> itr = pq.iterator();
    	while(itr.hasNext()) {
    		System.out.println(itr.next());
    	}
    	
	}
	
}
