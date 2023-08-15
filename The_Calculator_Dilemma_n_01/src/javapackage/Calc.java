package javapackage;

import java.util.Scanner;

public class Calc {
	

	public void calc(int operation) 
	{
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter first number");
	    int number1 = scan.nextInt();

	    System.out.println("Enter second number");
	    int number2 = scan.nextInt();

	    
		switch(operation)
		{
	      case '+':
	       int a = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + a);
	        break;

	      case '-':
	        int b = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + b);
	        break;

	      case '*':
	        int c = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + c);
	        break;

	      case '/':
	        int d = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + d);
	        break;
	        
	      case '%':
		        int e = number1 % number2;
		        System.out.println(number1 + " / " + number2 + " = " + e);
		        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	   
	  }
	
		
	}

