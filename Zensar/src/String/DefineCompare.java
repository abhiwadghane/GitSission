package String;

public class DefineCompare {
	public static void main(String[] args) {
		String  s1="hello";
		String  s2="hello";
		String  s3="hemlo";
		String  s4="flag";
		
		System.out.println(s1.compareTo(s2));//0 because both r equal
		
		System.out.println(s1.compareTo(s3));//-1 because 'l'only one time 
		                                     //lower than 'm'
		
		System.out.println(s1.compareTo(s4));//2 because 'h' is two times
		                                     //greater than 'f'
	}

}
