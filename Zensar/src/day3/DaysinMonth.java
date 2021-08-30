package day3;

import java.util.Scanner;

public class DaysinMonth {
      public static void main(String[] args) {
    	  int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month Number form 1 To 12:(1=jan, And 12=Dec:)");
		month = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("\n 31 days in this Month");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("\n 30 days in this Month");
			break;
			
		case 2:
			System.out.println("\n 28 or 28 days in this month");
			break;
			
	    default:
	    	System.out.println("\n Enter valid days");
		
		
		}
		
	}
}
