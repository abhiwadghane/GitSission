package Day4;

import java.util.Scanner;

public class EvenSum {
public static void main(String[] args) {
        
        int n, sum = 0;
        
        System.out.println("Enter a number:");
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        //Sum of all even numbers between 1 to n
        
        for(int i = 2; i <= n; i++) {
                  
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }
        
        System.out.println("The sum of all even numbers between 1 to " + n + " is " + sum);
    }
    
}

