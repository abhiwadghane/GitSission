package oops;

public class Create_Defalut {
	 int length;
	    int breadth;
	    int height;
	    public int getVolume() {
	        return (length * breadth * height);
	    }

	    Create_Defalut() {
	        length = 10;
	        breadth = 10;
	        height = 10;
	    }

	   

	    public static void main(String[] args) {
	        
	    	Create_Defalut Obj = new Create_Defalut();
	        
	        System.out.println("I am default constructor");
	}

}
