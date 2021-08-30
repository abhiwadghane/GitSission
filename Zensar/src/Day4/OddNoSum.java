package Day4;

import java.util.Scanner;

public class OddNoSum {

	    public static void main(String args[]) {
	        int n, i, sum = 0;
	 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        n = sc.nextInt();
	 
	        for(i = 0; i <= n; i++){
	            if((i%2) == 1){
	                sum += i;
	            }
	        }
	     
	        System.out.print("Sum of all odd numbers between 0 to "
	            + n + " = " + sum);
	    }
	}

