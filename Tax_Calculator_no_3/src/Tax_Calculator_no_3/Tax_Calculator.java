package Tax_Calculator_no_3;

import java.util.Scanner;

public class Tax_Calculator {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double a=scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double b=scan.nextDouble();
		Demo demo=new Demo();
		double res=Demo.calculateTotalWithTax(a, b);
		System.out.println("Total cost including tax: " +res );

	}

}
