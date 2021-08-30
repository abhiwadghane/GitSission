package oops;

public class Account_1 {
	
	    // Instance Variables 

	    String name; 
        int id; 
        public Account_1(String name,int id) 

	    { 

	        this.name = name; 
            this.id = id; 

	    }  

	    public String getName() 

	    { 

	        return name; 

	    } 

	     public static void main(String[] args) 

	    { 

	        // creating object using new operator 

	    	Account_1 s1 = new Account_1("Ravi",23); 

	          System.out.println(s1.getName());
	      
	    } 
}
