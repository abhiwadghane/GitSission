package day1;

import java.util.Scanner;

public class subject
{
public static void main(String args[])
{
     float eng, phy, chem, math, comp; 
     double total, average, percentage;
    Scanner op=new Scanner(System.in);
    System.out.println("Enter marks of five subjects:");
    System.out.print("Enter marks of English subjects:");
    eng=89f;
    System.out.print("Enter marks of physics subjects:");
    phy=88f;
    System.out.print("Enter marks of chemistry subjects:");
    chem=87f;
    System.out.print("Enter marks of maths subjects:");
    math=90f;
    System.out.print("Enter marks of computers subjects:");
    comp=77f;

   
    total = eng + phy + chem + math + comp;
    average = (total / 5.0);
    percentage = (total / 500.0) * 100;

    /* Print all results */
    System.out.println("Total marks ="+total);
    System.out.println("Average marks = "+average);
    System.out.println("Percentage = "+percentage);

   }
}
