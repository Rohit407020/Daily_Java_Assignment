package com.assign;

public class Student {
      private int sRoll,mPhysics,mChemistry,mMaths;
      private String sName;
       
      public Student() {
    	  this(101, 88, 88, 88, "Pratik");
    	  
    	  System.out.println("Default Constructor");
      }
      public Student(int sRoll,int mPhysics,int mChemistry,int mMaths,String sName)
      {
    	  this.mChemistry = mChemistry;
    	  this.mMaths = mMaths;
    	  this.mPhysics = mPhysics;
    	  this.sName = sName;
    	  this.sRoll = sRoll;
    			  
      }
	@Override
	public String toString() {
		return "Student [sRoll=" + this.sRoll + ", mPhysics=" + this.mPhysics + ", mChemistry=" + this.mChemistry + ", mMaths="
				+ this.mMaths + ", sName=" + this.sName + "]";
	}
	
	
      
      
}
