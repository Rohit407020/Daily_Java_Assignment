package com.innerc;
   interface Doable{
	   public void doIt();
   }
   class Car{
	   public void drive() {
		   System.out.println("I am Driving");
	   }
   }
   abstract class Cake{
	   abstract void doBaking();
   }
public class Annonyms {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Doable d1 = new Doable() {

			@Override
			public void doIt() {
				System.out.println("DO it ");	
			}
        	
        };
        d1.doIt();
        Car c1 = new Car(); 
        c1.drive();
        Cake ck = new Cake() {

			@Override
			void doBaking() {
				System.out.println("Cake");		
			}
        	
        };
        ck.doBaking();
	}

}
