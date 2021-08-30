package day3;

import java.util.Scanner;

public class digitword {
  public static void main(String[] args) {
	   int i;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Digit:");
	   i =sc.nextInt();
	   
	   switch(i) {
	   case(0):
		   System.out.println("zero");
	        break;
	   case(1):
		   System.out.println("One");
	        break;
	   case(2):
		   System.out.println("two");
	        break;
	   case(3):
		   System.out.println("three");
	        break;
	        
	   case(4):
		   System.out.println("four");
	        break;
	        
	    default:
	       System.out.println("the number is invalid");
		   
	   }
	   
	   
	   
	   
}
}
