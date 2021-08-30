package oops;

import java.util.Scanner;

public final class AccCycle {
	int accountNo;
	int noOfWheels;
	public AccCycle() {
		// TODO Auto-generated constructor stub
		
	}
	public AccCycle(int accountNo, int noOfWheels) {
		super();
		this.accountNo = accountNo;
		this.noOfWheels = noOfWheels;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:int accountNo,int noOfWheels ");
		AccCycle s1 = new AccCycle();
		AccCycle s2 = new AccCycle();
		s2.accountNo= sc.nextInt();
		s2.noOfWheels=sc.nextInt();
		
		System.out.println(" i am constructornn "+s2.accountNo);
		System.out.println("i am constructor  " +s2.noOfWheels);
		System.out.println(" i am default constructor"+ s1);
	}
	
	
	
}
