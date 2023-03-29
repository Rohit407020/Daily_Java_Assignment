package com.pattern;
import java.util.Scanner;
public class advtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		12345
//		1234
//		123
//		12
//		1
//		12
//		123
//		1234
//		12345
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     
     for(int i=n-1;i>=0;i--) {
    	 int k = 1;
    	 for(int j = 0;j<=i;j++) {
    		 System.out.print(k+" ");
    		 k++;
    	 }
    	 System.out.println();
     }
     for(int a=1;a<=n;a++) {
    	 if(a==1) {
    		 continue;
    	 }
    	 int m =1;
    	 for(int b =1;b<=a;b++) {
    		 System.out.print(m+" ");
    		 m++;
    	 }
    	 System.out.println();
     }
	}

}
