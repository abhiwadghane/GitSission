package oops;

public class Student {
     int id;
     String name;
    
      public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id=102;
		s1.name="Abhi";
		s2.id=103;
		s2.name="Nil";
		
		System.out.println("Student 1:"+ s1.id +" "+ s1.name);
		System.out.println("Student 2:"+ s2.id+" "+ s2.name);

		
      }
}
