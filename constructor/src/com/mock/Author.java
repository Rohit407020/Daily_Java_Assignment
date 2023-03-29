package com.mock;

public class Author {
     private int id;
     private String authorName;
     
   
     
    public Author() {
    	
    }
    public Author(int id,String authorName) {
    	this.id = id;
    	this.authorName = authorName;
    }
    
    //getter Setter
    
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + "]";
	}
	
	
    
     
     
}
