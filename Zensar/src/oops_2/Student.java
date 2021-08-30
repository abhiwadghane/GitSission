package oops_2;

public class Student {
	    private String Name;
	    private int age;
	    private String adress;

	    public Student(String name, int age) {
	        this.Name = name;
	        this.age =age ;
	    }
	    public Student() {
	        this.Name = "Unknown";
	        this.age = 0;
	        this.adress = "Not available";
	    }
	    public  Student(String Name, int age, String adress) {
	        this.Name = Name;
	        this.age = age;
	        this.adress = adress;
	    }

	    public void setName(){
	        this.Name= Name;
	    }
	    public String getName(){
	        return Name;
	    }
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getAdress() {
	        return adress;
	    }

	    public void setAdress(String adress) {
	        this.adress = adress;
	    }


	    public void setInfo(){
	        System.out.printf("%s,%s,%s",Name,age,adress);}

	    public void setInfo(String name,int age ){
	        System.out.printf("%s,%s,%s",Name,age);
	    }    

	   public static void main(String[] args){

	        Student Stu1[]= new Student[10];
	        Student Stu2[]= new Student[10];

	        Stu2[0] =new Student("Abhi",26,"Pune");
	        Stu2[0].setInfo();
	        System.out.println();

	        Stu2[1]= new Student("Nil",25,"Mumbai");
	        Stu2[1].setInfo();
	        System.out.println();

	       Stu1[2]=new Student("keshav",20);
	        Stu1[2].setInfo();
	        System.out.println();

	        Stu1[3]=new Student("Ram",22);
	        Stu1[3].setInfo();
	        System.out.println();

	        Stu1[4]=new Student("jay",18);
	        Stu1[4].setInfo();
	        System.out.println();

	        }
	    }

