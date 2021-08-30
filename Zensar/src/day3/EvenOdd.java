package day3;
import java.util.Scanner;
public class EvenOdd {
         public static void main(String[] args) {
			int n;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Any Integer Value:");
		  n=sc.nextInt();
		  switch(n%2){
			  case 0:
			  System.out.println("Number is even");
			  break;
			  default:
				  System.out.println("Number is odd");
		  }
			  
			
		}
}
