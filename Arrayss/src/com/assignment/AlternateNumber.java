package com.assignment;

import java.util.Arrays;

public class AlternateNumber {
	
	public static void alternatearray(int arra[],int arrb[]) {
		int c[] = new int [arra.length];
		int k=0;
		int i;
		int j = 0;
		for(i=0;i<arra.length;i+=2) {
			for(j=i+1;j<arrb.length;j+=2) {
				c[k++] = arra[i];
				
				c[k++]= arrb[j];
				break;
				
			}
		}
//		i--;
//		j--;
//		System.out.println(i+" "+j+ " "+k);
//		while(i<arra.length) {
//			c[k++] = arra[i++];
//		}
//		while(j<arrb.length) {
//			c[k++] = arrb[j++];
//			System.out.println(i+" "+j+ " "+k);
//}
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3,5,6,4,8};
		int b[] = {2,9,4,7,6};
		//op c[] = {1,9,5,7,4,10}
		
		alternatearray(a,b);
	}

}
