package com.stringques;

public class RemoveExtraSpace {
    static void space(String a) {
//        String ch[] = a.split(" ");
    	char []ch = a.toCharArray();
    	char c;
        String demo ;
        boolean lastchar = false;
        int flag = 0;
        for(int i=0;i<ch.length;i++) {
        	if(Character.isWhitespace(ch[i])) {
        		if(!lastchar) {
        			ch[flag++] = ' ';
        		}
        		lastchar = true;
        	}
        	else {
        		ch[flag++]= ch[i];
        		lastchar = false;
        	}
        }
        demo = new String(ch,0,flag);
        System.out.println(demo);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a = "I love  India ";
       
       space(a);
	}

}
