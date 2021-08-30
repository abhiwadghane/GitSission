package inherit;

public class TestMain {
	public static void main(String[] args) {
		
		int a=90;
		Trainer t1=new Trainer();
		t1.setTid(101);
		t1.setTid(109);
		t1.setTrainername("Deepa");
		
		CompanyTraining c1=new CompanyTraining();
		c1.setCompanyid(1);
		c1.setCompanyname("Zensar");
		c1.setTrainer(t1);
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("Anand");
		s1.setCompany(c1);
		
		
		Trainer t2=new Trainer(2,"Deven");
		CompanyTraining c2=new CompanyTraining(2, "Zensar", t2);
		Student s2=new Student(2,"Pavan",c2);
		
		
		
	}
	}


