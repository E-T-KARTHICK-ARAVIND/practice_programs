package javapackage;

import java.util.Scanner;

public class Logical_Operator_Validator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("  Is input valid (true/false):");
		boolean input1=scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean input2=scan.nextBoolean();
		Demo demo=new Demo();
		Demo.isValidInput(input1, input2);

		

	}

}
