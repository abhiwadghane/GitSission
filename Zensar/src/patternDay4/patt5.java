package patternDay4;

import java.util.Scanner;

public class patt5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");

		int rows = sc.nextInt();

		for (int i = 0; i <= rows - 1; i++) { 

		for (int j = 0; j <= i; j++) { 

		System.out.print("*" + " "); 

		}

		System.out.println(""); 

		}

		for (int i = rows - 1; i >= 0; i--) { //For Loop for Row

		for (int j = 0; j <= i - 1; j++) { //For Loop for Col

		System.out.print("*" + " "); //prints * and blank space

		}

		System.out.println("");// new line

		}

		sc.close();

		}
}
