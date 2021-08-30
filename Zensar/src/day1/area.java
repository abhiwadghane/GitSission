package day1;

import java.util.Scanner;
	public class area
	{
	    public static void main(String[] args) 
	    {
	        int r;
	        double pi = 3.14, area;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter radius of circle:");
	        r = 6;
	        area = pi * r * r;
	        System.out.println("Area of circle:"+area);
	    }            
	}
