package com.arrayss;

public class DuplicatateArray {
        
	    public static void dublicate(int arr[])
	    {
			int temp;
			
			for(int i=0;i<arr.length;i++) {
				int count = 0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count>1){
					System.out.println(arr[i]);
				}
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		 int arr[] = {2,4,9,4,5,4,9};
		// {9,4,2,4,};
		 dublicate(arr);
 
}
}
