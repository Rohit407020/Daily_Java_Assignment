package com.mock;
import java.util.*;
public class DetailsofBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan = new Scanner(System.in);
//		
//		Author a1 = new Author();
//		
//		System.out.println("Enter author id");
//		int id = scan.nextInt();
//		a1.setId(id);
//		System.out.println("Enter author Name");
//		String name = scan.next();
//		a1.setAuthorName(name);
//		
//		
//		Book b1 = new Book();
//	    System.out.println("Enter Book id");
//	    int id2 = scan.nextInt();
//	    
	  		  int a[] = {1,2,3,4,5,6,7,8,9,10};
	  		  
	  		  System.out.println(Arrays.toString(a));
	  		  // op => 4 6 8 10 12 16
	  		  // 1+3   2+4
	  		  int sum = 0;
//	  		  for(int i=0;i<a.length;i+=2) {
//	  			  for(int j=2;j<a.length;j+=2) {
//	  				  //1 
//	  				  sum = a[i]+a[j];
//	  				System.out.print(sum+" ");
//	  				  break;
//	  				  
//	  			  }
//	  		  }
	  		  
	  		  for(int i=0;i<a.length-2;i++) {
	  			  
	  			  sum = a[i] +a[i+2];
	  			System.out.print(sum+" ");
	  		  }
		
	}

}
