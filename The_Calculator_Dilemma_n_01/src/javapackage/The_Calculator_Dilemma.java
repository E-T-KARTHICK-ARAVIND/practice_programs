package javapackage;

import java.util.Scanner;

public class The_Calculator_Dilemma {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, /, or %");
    char a=scan.next().charAt(0);
    Calc calc=new Calc();
    calc.calc(a);
	}

}
