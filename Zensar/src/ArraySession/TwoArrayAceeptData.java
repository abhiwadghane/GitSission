package ArraySession;

public class TwoArrayAceeptData {
	
	 public static void main(String[] args)
	   {
	      // Array of size 4x3 to hold integers.
	      int[][] values =
	      {
	         { 10, 20, 30 ,45}, { 40, 50, 60,76 }, { 70, 80, 90,75 },
	        
	      };

	      // Nested loops to print the array in tabular form.
	      for (int row = 0; row < 3; row++)
	      {
	         for (int col = 0; col < 4; col++)
	         {
	            System.out.print(values[row][col] + " ");
	         }

	         System.out.println();    // Print new line.
	      }
	   }
	}

