package ArraySession;

import java.util.Scanner;



public class Demo_Array {
    public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter size of array:");
    	int size=sc.nextInt();
    	int[] arr=new int[size];
    	System.out.println("Enter "+ arr.length +" Element:");
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.nextInt();
    		
    	}
    	int min=arr[0];
    			for(int i=1;i<arr.length;i++)
    			{
    				if(min>arr[i])
    					min=arr[i];
    			}
    			System.out.println("minimun "+min);
    			
    			int max=arr[0];
    			for(int i=1;i<arr.length;i++)
    			{
    				if(max<arr[i])
    					max=arr[i];
    			}
    			System.out.println("maximum "+max);
    			
	}
}
