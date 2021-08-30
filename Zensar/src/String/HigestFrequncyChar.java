package String;
import java.util.Scanner;
public class HigestFrequncyChar {
		public static void main(String[] args) {
			String maxOccStr;
			char maxChar = ' ';
			int i, max = -1;
			int[] charFreq = new int[256];
			
			Scanner sc= new Scanner(System.in);

			System.out.print("Enter String to find Maximum Char Occurrence =  ");
			maxOccStr = sc.nextLine();
			
			for(i = 0; i < maxOccStr.length(); i++)
			{
				charFreq[maxOccStr.charAt(i)]++;
			}
			for(i = 0; i < maxOccStr.length(); i++) 
			{
				char ch = maxOccStr.charAt(i);
				if(max < charFreq[ch]) {
					max = charFreq[ch];
					maxChar = ch;
				}
			}
			System.out.println("The Maximum Occurring Character = " +  maxChar);
			System.out.format("'%c' Character Occurs %d Times ", maxChar, max);	

			
		}
	}

