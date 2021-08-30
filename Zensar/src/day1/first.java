package day1;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any two positive integer numbers:");

        
        int p = 5;
        int q = 8;
        int sum, sub, mul, mod;
        float div;

        sum = 5+ 8;
        sub = 5- 8;
        mul = 5* 8;
        div = 5/ 8;
        mod = 5% 8;

        System.out.println("\nSUM         " + p + " + " + q + " = " + sum);
        System.out.println("DIFFERENCE  " + p + " - " + q + " = " + sub);
        System.out.println("PRODUCT     " + p + " * " + q + " = " + mul);
        System.out.println("QUOTIENT    " + p + " / " + q + " = " + div);
        System.out.println("MODULUS     " + p + " % " + q + " = " + mod);
    }
}


 


 