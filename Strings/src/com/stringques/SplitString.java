package com.stringques;

public class SplitString {

	public static void SplitString(String arr) {
		String word= "";
		String[] st = new String[30];
		int temp=0;
		arr = arr+' ';
		for(int i = 0;i<arr.length();i++) {
			
			if(arr.charAt(i)!=' ') {
				word = word + arr.charAt(i);
			}
			else {
				st[temp] = word;
				temp++;
				word="";
			}
		}
		for(int i=0;i<temp;i++) {
			System.out.println(st[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a = "I Want to Eat Your Pancreas";
        SplitString(a);
	}

}
