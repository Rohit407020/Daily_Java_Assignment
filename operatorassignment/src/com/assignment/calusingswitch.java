package com.assignment;


	import java.util.Scanner;

	class calusingswitch {
	  public static void main(String[] args) {

	    char operator;
	    Double number1, number2, result;

	    
	    Scanner scan = new Scanner(System.in);

	   
	   

	    
	    System.out.println("Enter first number");
	    number1 = scan.nextDouble();

	    System.out.println("Enter second number");
	    number2 = scan.nextDouble();
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = scan.next().charAt(0);

	    switch (operator) {

	      
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	     
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	    
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	   
	  }
	}

