package oops;

import java.util.Scanner;

public class Para_1 {
	int id;
	String name;
	public Para_1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("it is paramitrized constructor");
	}
	   void info(){
	        System.out.println("Id: "+id+" Name: "+name);
	   }
	
	
  public static void main(String[] args) {
	  
	  
	Para_1  a1=new Para_1(102,"abhi");
	
	a1.info();
	
}
	

}
