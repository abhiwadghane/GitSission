package oops_2;

public class AreaOfCircle {
	  public static void main(String[] args)
	    {
	        Rectangle obj = new Rectangle();
	       
	        obj.Area(30, 20);
	        obj.Area(12.5, 4.5);
	        Circle obj1 = new Circle();
	                                     
	        obj1.Area(3);              // Calling function
	        obj1.Area(5.5);
	        Square obj2 = new Square();
	       
	        obj2.Area(20);        
	        obj2.Area(5.2);
	        
	    }
	}
	class Square 
	{
	   
	    void Area(double side)                 // Overloaded function to
	                                          // calculate the area of the square
	                                      // It takes one double parameter
	    {
	        System.out.println("Area of the Square: "+ side * side);
	    }
	   
	    // It takes one float parameter
	    void Area(float side)
	    {
	        System.out.println("Area of the Square: "+ side * side);
	    }
	}
	class Circle 
	{
	    static final double PI = Math.PI;
	  
	    // It takes one double parameter
	    void Area(double r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("The area of the circle is :" + A);
	    }
	  
	    // It takes one float parameter
	    void Area(float r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("The area of the circle is :" + A);
	    }
	}
	class Rectangle 
	{
	     
	    // It takes two double parameters
	    void Area(double l, double b)
	    {
	        System.out.println("Area of the rectangle: " + l * b);
	    }
	  
	    // It takes two float parameters
	    void Area(int l, int b)
	    {
	        System.out.println("Area of the rectangle: " + l * b);
	    }


}
