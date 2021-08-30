package oops;

public class Animal {
	String name;
	public void eat() {
		System.out.println("i can eat");
		
	}
}
//inherit from Animal to use extends keyword
class Dog extends Animal{
	public void display() {
		System.out.println("my name is" + name);
	}
}
class Main{
	public static void main(String[] args) {
		Dog petbull = new Dog();
		
		petbull.name="piku";
		petbull.display();
		//call method of superclass
		//using object of subclass
		petbull.eat();
	}

}
