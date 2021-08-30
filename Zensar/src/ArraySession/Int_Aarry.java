package ArraySession;

import java.util.Scanner;



public class Int_Aarry {
	public static void main(String[] args) {
		
	
     
	int[] arr= new int[8];
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter 7 number:");
	
	
	for(int i=0;i<=7;i++){
        arr[i]=sc.nextInt();
	}
	for(int i=0;i<=7;i++)
		System.out.println(arr[i]);
}
}