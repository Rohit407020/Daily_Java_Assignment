package com.hashmaplogic;

import java.util.Objects;

public class Course implements Comparable<Course> {
	
	private int cid;
	private String cname;
	private int fees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname, int fees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid, cname, fees);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return cid == other.cid && Objects.equals(cname, other.cname) && fees == other.fees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
	
	
		
		@Override
		public int compareTo(Course o) {
			 return cname.compareTo(cname);
		}
	
	
	

}
