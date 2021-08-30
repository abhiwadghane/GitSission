package oops;

import java.util.Objects;

public class HashCode {
	
   String name;
   
   public static void main(String[] args) {
	     
	   Student s1 = new Student();
	   Student s2 = new Student();
	   s1.name="abhi";
	   s2.name="nil";
	   System.out.println("diffrent hascode two object");
	   
}

@Override
public int hashCode() {
	return Objects.hash(name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	HashCode other = (HashCode) obj;
	return Objects.equals(name, other.name);
	
}
}  
    

