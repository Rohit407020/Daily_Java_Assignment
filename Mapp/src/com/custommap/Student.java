package com.custommap;

import java.util.Objects;

public class Student {
	
	private int sid;
	private String sname;
	private int sage;
	private Course c;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int sage, Course c) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.c = c;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	@Override
	public int hashCode() {
		return Objects.hash(c, sage, sid, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(c, other.c) && sage == other.sage && sid == other.sid
				&& Objects.equals(sname, other.sname);
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", c=" + c + "]";
	}
	
	

}
