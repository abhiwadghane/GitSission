package day2;

public class evennumber {

	    public static void main(String args[]){
	        int sum = 0, avg = 0;
	        for(int i = 2;i<10;i=i+2) {
	            sum = sum + i;
	            avg = sum/10;
	            
	        }
	        System.out.println("avg = " + sum);
	    }
	}
