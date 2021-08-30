package patternDay4;
import java.util.Scanner;
public class patt6 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in); 

	System.out.println("Enter row value ");

	int r = sc.nextInt();

	for (int i = r; i >= 1; i--) { 

	for (int j = r; j > i; j--) { 

	System.out.print(" "); 

	}

	for (int k = 1; k <= i; k++) {

	System.out.print("*"); 

	}

	System.out.println(" "); 

	}

	sc.close();

	}

	}

