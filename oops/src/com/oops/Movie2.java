package com.oops;

public class Movie2 {
   int yearOfRelease;
   float profit;
   String actor,producer;
   
   void acceptDetails(int y,float p,String pr, String a) {
	   yearOfRelease = y;
	   profit =p;
	   actor =a;
	   producer = pr;
   }
   void showDetails() {
	   System.out.println("Movie Profit "+profit);
	   System.out.println("Movie Producer "+producer);
	   System.out.println("Movie Actor "+actor);
	   System.out.println("Movie Release "+yearOfRelease);
   }
   public static void main(String args[]) {
	   Movie2 titanic = new Movie2();
	   titanic.acceptDetails(1989, 120000.0f, "Mr r", " Mr k");
	   titanic.showDetails();
	   
	   
	   
   }
}
