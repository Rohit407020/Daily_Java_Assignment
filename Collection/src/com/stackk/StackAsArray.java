package com.stackk;

class Mystack{
      int top;
      int arr[];
      int size;
	public Mystack() {
		super();
	}
      
     
      public Mystack(int size) {
    	    top = -1;
    	    this.size = size;
    	    arr = new int[size];
    	}
      
      public void insert(int data) {
    	  if(top<size-1) {
    		  top++;
    		  arr[top] = data;
    		  
    	  }
    	  else {
    		  System.out.println("Stack is Full");
    	  }
      }
      public void delete() {
    	   if(top!=-1) {
    		   System.out.println("ELement Delete "+arr[top] );
    	       top--;
    	   }
      }
      public void peek() {
    	  System.out.println(arr[top]);
      }
      public void show() {
    	    if (top != -1) {
    	        for (int i = 0; i <= top; i++) {
    	            System.out.println(arr[i]);
    	        }
    	    } else {
    	        System.out.println("Empty");
    	    }
    	}
}

public class StackAsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mystack m = new Mystack(4);
      
       m.insert(50);
       m.insert(52);
       m.insert(12);
       m.show();
       m.delete();
       m.show();
       
	}

}
