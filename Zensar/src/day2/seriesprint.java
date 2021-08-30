package day2;

import java.util.Scanner;

public class seriesprint {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n,i,pr=0;
		   System.out.printf("Enter the range of number:");
		    n=sc.nextInt();
		    for(i=1;i<=n;i++)
		    {
		        pr=(pr*2)+1;
		    	System.out.print(pr+" ");
		    }
		    sc.close();
		}
	}
