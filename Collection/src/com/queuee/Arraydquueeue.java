package com.queuee;

import java.util.ArrayDeque;

public class Arraydquueeue {
	public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.add("Alice");
        deque.add("Bob");
        deque.add(null); // Add a null element
        deque.add("Charlie");

        // Print the deque
        System.out.println("Deque: " + deque);

        // Remove elements from the deque
        String first = deque.removeFirst();
        String last = deque.removeLast();

        // Print the first and last elements
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

}
