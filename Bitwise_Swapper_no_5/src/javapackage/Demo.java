package javapackage;

public class Demo {
	public static void swapUsingBitwise(int m, int n) {
		
		m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("After Swapping");
        System.out.println("First :"+m);
        System.out.println("Second :"+n);
	}

}
