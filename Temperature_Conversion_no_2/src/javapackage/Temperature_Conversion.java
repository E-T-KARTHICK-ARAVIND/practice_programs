package javapackage;

import java.util.Scanner;

public class Temperature_Conversion {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Select an option:\n\n 1. Convert Celsius to Fahrenheit\n 2. Convert Fahrenheit to Celsius");
		int a= scan.nextInt();
		System.out.println("enter the temperature which need to be converted");
		double degree=scan.nextDouble();
		Conversion c=new Conversion();
		switch(a)
		{
		case 1:
			double farenheit=Conversion.celsiusToFahrenheit(degree);
			System.out.println("the value of celcius converted to farenheit is "+farenheit);
			break;
			
		case 2:
			double celcius=Conversion.fahrenheitToCelsius(degree);
			System.out.println("the value of farenheit converted to celcius is "+celcius);

			break;
		}

	}

}
