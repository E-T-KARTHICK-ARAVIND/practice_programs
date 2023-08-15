package javapackage;

import java.util.Scanner;

public class Bitwise_Swapper {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first integer:");
    int a=scan.nextInt();
    System.out.println("Enter the second integer:");
    int b=scan.nextInt();
    Demo demo=new Demo();
    Demo.swapUsingBitwise(a,b);
    
    
	}

}
