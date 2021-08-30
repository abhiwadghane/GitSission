package day3;

import java.util.Scanner;
public class VowelConstant {
   public static void main(String[] args) {
    int i=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Charcter:");
    char ch = sc.next().charAt(0);
    
    switch(ch) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case 'A':
    case 'E':
    case 'I':
    case 'O':
    case 'U':i++;
    }
    if(i==1) 
    	System.out.println("Entered charcter "+ch+"is Vowel");
    	else if(ch>='a'&&ch<='z'||(ch>'A'&&ch<'Z'));
    	System.out.println("Entered charcter"+ch+"is Consonet");
			
		
    	}
    }


