package com.pattern;
import java.util.*;
public class advtriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1
//		12
//		123
//		12
//		1
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     for(int i =1;i<=n;i++) {
    	 int k =1;
    	 for(int j=1;j<=i;j++) {
    		 System.out.print(k+"");
    		 k++;
    	 }
    	 System.out.println();
     }
     for(int a=n-1;a>=0;a--) {
    	 int m = 1;
    	 for(int b =1;b<=a;b++) {
    		 System.out.print(m+"");
    		 m++;
    	 }
    	 System.out.println();
     }
	}

}
