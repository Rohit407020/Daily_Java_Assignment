package com.oops;

public class Movie {
	//properties
   int yearOfRelease;
   float profit;
   String producerName,actorName;
   
   //behavoiur => method name
   
   void acceptDetails()
   {
	   yearOfRelease = 1997;
	   profit = 1200000.0f;
	   producerName = "Mr. James";
	   actorName = "Leonardo";
   }
   
   void showDetails(){
	   System.out.println("Movie Profit :"+profit);
	   System.out.println("Movie Producer :"+producerName);
	   System.out.println("Movie Actor :"+actorName);
	   System.out.println("Movie Release :"+yearOfRelease);
   
   
   }
   public static void main(String args[]) {
	
//	   Movie tatanic
	//   tatanic = new Movie();   we can also write this
	   Movie titanic = new Movie();
	   
	   titanic.showDetails();
//	   Movie Profit :0.0
//	   Movie Producer :null
//	   Movie Actor :null
//	   Movie Release :0
	   titanic.acceptDetails();
	   System.out.println("");
	   titanic.showDetails();
	   
//	   Movie Profit :1200000.0
//	   Movie Producer :Mr. James
//	   Movie Actor :Leonardo
//	   Movie Release :1997
	   
	   //object =>stack 
	   //propertie =>heap
}
   
}
