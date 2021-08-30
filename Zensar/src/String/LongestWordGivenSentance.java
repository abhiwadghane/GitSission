package String;
import java.util.*;
public class LongestWordGivenSentance {
	  static int LongestWordLength(String str)

	    {

	    int n = str.length();

	    int res = 0, curr_len = 0;

	    for (int i = 0; i < n; i++)

	    {
              if (str.charAt(i) != ' ')// If current character is not
	        	   curr_len++;          // end of current wo
              else
	        	 {                         // If end of word is found

	            res = Math.max(res, curr_len);

	            curr_len = 0;

	        }

	    }
	 

	    // We do max one more time to consider

	    // last word as there won't be any space

	    // after last word.

	    return Math.max(res, curr_len);

	    }
	 

	    public static void main(String[] args)

	    {

	        String s = "I am currently undergoing traning at thinkQuatient";

	        System.out.println(LongestWordLength(s));

	    }
	}

