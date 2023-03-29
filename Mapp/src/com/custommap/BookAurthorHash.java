package com.custommap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookAurthorHash {

	private static void CreateAuthor(ArrayList<Book> al) {
HashMap<Aurthor, Integer> authmap= new HashMap<>();
		
		Iterator<Book> itr= al.iterator();
		int count;
		while(itr.hasNext())
		{
			count=1;
			Book b= itr.next();
			if(!authmap.containsKey(b.getA()))
			{				
				authmap.put(b.getA(), count);
			}
			else
			{
				count= authmap.get(b.getA());
				authmap.put(b.getA(), count+1);
			}
			
			
		}
		for(Map.Entry<Aurthor, Integer> en: authmap.entrySet())
		{
			
			System.out.println(en.getKey().getName()+" :"+en.getValue());
			
			System.out.println();
			System.out.println("===========================================================");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Book> bal = new ArrayList<>();
        
        bal.add(new Book(1001,"Nutan",786f,new Aurthor(1,"Ronik")));
        
        bal.add(new Book(1002,"No home",1786f,new Aurthor(2,"Neolik")));
        bal.add(new Book(1003,"Harry Potter",286f,new Aurthor(3,"Jk Rolling")));
        
        bal.add(new Book(1004,"Jio",186f,new Aurthor(2,"Ronik")));
        
        CreateAuthor(bal);
	}

	

}
