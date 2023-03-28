package com.assignment;

public class PrintPrimeArrays {
	
	public static void primenumber(int n) {
		int flag = 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag = 1;
			    break;
			}
			
		}
		if(flag == 0) {
			System.out.print(n+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {1,2,3,5,6,4,7,8,9};
      for(int i=0;i<a.length;i++) {
    	  if(a[i]==1) 
    		  continue;
    	      primenumber(a[i]);
    		  
    	  
      }
     
	}

}
