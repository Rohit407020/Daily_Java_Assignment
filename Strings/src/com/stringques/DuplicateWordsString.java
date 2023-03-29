package com.stringques;

import java.util.Arrays;

public class DuplicateWordsString {
	public static void DuplicateWord(String arr)
	{
		int flag = 0;
		
		String[] str = arr.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			if(str[i]=="1") 
				continue;
			int count = 1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="1";
				}
			}
			if(count>1)
			System.out.println("Duplicate word :"+str[i]);
		}
	}
	//count word
	public static void CountWord(String arr)
	{
		int flag = 0;
		
		String[] str = arr.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			
			
				flag++;
			}
		
			System.out.println("Count word :"+flag);
		}
	
	//unique
	public static void UniqueWords(String arr)
	{
		int flag = 0;
		
		String[] str = arr.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			if(str[i]=="1") 
				continue;
			int count = 1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="1";
				}
			}
			if(count==1)
			System.out.println("Unique word :"+str[i]);
		}
	}
	//frequency
	public static void FrequencyOfWord(String arr)
	{
		int flag = 0;
		
		String[] str = arr.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			if(str[i]=="1") 
				continue;
			int count = 1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="1";
					break;
				}
				
			}
			System.out.println("Frequncy word :"+str[i]+" :"+count);
			
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "Hello Java Hello";
      
//      DuplicateWord(a);
//      CountWord(a);
//      UniqueWords(a);
      FrequencyOfWord(a);
	}

}
