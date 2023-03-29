package com.hashmaplogic;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private int age;
	public Student() {
		super();
	}
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(this.getClass()!=o.getClass()) {
			return false;
		}
		Student s = (Student)o;
		if(this.id!=s.id) {
			return false;
		}
		else if(this.name == null) {
			return false;
		}
		else if(s.name == null) {
			return false;
		}
		else if(!this.equals(s.name)) {
			return false;
		}
		else if(this.age!=s.age)
		{
			return false;
		}
	return true;	
		
	}
     
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
    
    
}
