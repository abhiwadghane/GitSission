package day1;

import java.util.*;

class swap
{
	public static void main(String []s)
	{
		int a,b;
		//Scanner class to read value
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter value of a: ");
		a=8;
		System.out.print("Enter value of b: ");
		b=7;

		System.out.println("Before swapping - a: "+ a +", b: " + b);
		////using thrid variable
		int temp;
		temp=a;
		a=b;
		b=temp;
		//////////////////////
		System.out.println("After swapping  - a: "+ a +", b: " + b);
	}
}
