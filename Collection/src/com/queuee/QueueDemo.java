package com.queuee;

class Myque{
	int front,rear;
	int size;
	int ar[];
	
	public Myque() {
		super();
	}
	public Myque(int size) {
		rear = 0;
		front =0;
		this.size = size;
		ar = new int[size];
	}
	
	public void insert(int data) {
		if(rear>size) {
			ar[rear] = data;
			rear++;
			System.out.println("Element add");
		}
		else {
			System.out.println("Queue is full");
		}
	}
	
}
public class QueueDemo {
     public static void main(String[] args) {
		
	}
}
