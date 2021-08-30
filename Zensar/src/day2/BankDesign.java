package day2;

import java.util.*;
public class BankDesign {
public static void main(String args[])
	throws InputMismatchException{

	Scanner sc=new Scanner(System.in);
	int amt;

	System.out.print("Enter a five-digit amount : ");
	amt=sc.nextInt();

	if(amt>88888){
	System.out.println("INVALID AMOUNT.");}
	else{
	int a[]={1000,500,100,50,20,10,5,2,1};int i,p,r,b,t;

	    p=amt;
	 for(i=0;i< a.length;i++){
	   t=amt/a[i];
	if(t!=0){
	System.out.println(a[i]+"X"+t+"="+(t*a[i]));
	amt=amt%a[i];
	}
	}

	   String ones[]={"one","two","three","four","five",
	  "six","seven","eight","nine"};
	    r=0;
	 while(p>0){
	  r=r*10+p%10;
	  p/=10;
	  }

	while(r>0){
	 b=r%10;
	System.out.print(ones[b-1].toUpperCase()+" ");
	r/=10;
	}
	 }
	}
	}