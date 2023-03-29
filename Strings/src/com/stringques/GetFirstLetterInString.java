package com.stringques;

import java.util.Arrays;

public class GetFirstLetterInString {
	 static void space(String a) {
//       String ch[] = a.split(" ");
   	char []ch = a.toCharArray();
   	char c;
       String demo = "";
       int flag = 0;
       for(int i=0;i<ch.length;i++) {
       	if(Character.isWhitespace(ch[i])) {
       		flag = 0;
       	}
       	else if(flag == 0) {
       		demo = demo + ch[i];
       		flag = 1;
       	}
       	
       }
       System.out.println(demo);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a = "I love  Mndia ";
      
      space(a);
	}

}
