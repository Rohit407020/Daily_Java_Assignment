package com.pattern;
import java.util.*;
public class suarepatadv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      *1*1
//      *2*2
//      *3*3
      Scanner scan = new Scanner(System.in);
      // iteration
      int n = scan.nextInt();
      for(int i=1;i<=n;i++) {
    	  int k=1;
    	  for(int j=1;j<=n;j++) {
    		  if(k%2==0) {
    			  System.out.print(k/2+"");
//    			  k++;
    		  }
    		  else {
    			  System.out.print("*");
    		  }
    		  k++;
    		  
    	  }System.out.println();
      }
    		  
	}

}
