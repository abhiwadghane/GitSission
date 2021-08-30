package String;
import java.util.Scanner;

public class IndexOccurance {
	
		public static void main(String[] args) {
			String firstCharStr;
			char ch;
			
			Scanner sc= new Scanner(System.in);

			System.out.print("Please Enter String to find First Occurrence =  ");
			firstCharStr = sc.nextLine();
			
			System.out.print("Enter the Character to Find =  ");
			ch = sc.next().charAt(0);
			
			int x = firstCharStr.indexOf(ch);
			
			System.out.format("The First Character Occurrence of %c at %d position", 
					firstCharStr.charAt(x), x);
		}
}
