package inherit;

public class Person {
	private String name;
	private String address;
	private Car car;


	  public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public static void main(String[] args) {
		Person p1=new Person();
		p1.setAddress("Pune");
		p1.setName("Ayush");
		p1.setCar(new Swift());
		
		Person p2=new Person();
		p1.setAddress("Pune");
		p1.setName("Anand");
		p1.setCar(new HondaCity());
		
		
		  
		  
		  
	}
	}


