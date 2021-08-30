package oops_2;

public class UseThisKey {
	
	   String name; 
	   int id; 
	
	   UseThisKey  (String name, int id) 
	   { 
	     this.name=name; 
	     this.id=id; 
	    } 
	void display() 
	{ 
	   System.out.println(name+ " "+id); 
	 } 
	public static void main(String[] args) 
	{ 
		UseThisKey s = new UseThisKey("abhi", 121); 
	     s.display(); 
	  } 
	}
