package Lab_Session;
import java.util.Scanner;

public class MaxMin_No {
	
	    public static void main(String args[]) {
	        
	        Scanner in = new Scanner(System.in);
	        
	        System.out.print("Enter First Number: ");
	        int a = in.nextInt();
	        System.out.print("Enter Second Number: ");
	        int b = in.nextInt();
	        System.out.print("Enter Third Number: ");
	        int c = in.nextInt();
	        
	        int g = Math.max(a, b);
	        g = Math.max(g, c);
	        
	        System.out.println("Greatest Number = " + g);
	    }
	}
