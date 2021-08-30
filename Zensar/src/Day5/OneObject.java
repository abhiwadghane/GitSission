package Day5;

public class OneObject {
	int refno;  
	 String refname;  
	 OneObject (int i, String n) {  
	  refno = i;  
	  refname = n;  
	 }  
	 OneObject(OneObject e) {  
	  refno = e.refno;  
	  refname = e.refname;  
	 }  
	 void display() {  
	  System.out.println(refno + " " + refname);  
	 }  
	 public static void main(String[] args) {  
		 OneObject e1 = new OneObject(123, "raman");  
		 OneObject e2 = new OneObject(e1);  
	  e1.display();  
	  e2.display();  
	 }  
	}

