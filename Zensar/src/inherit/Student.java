package inherit;

public class Student {
		private int sid;
		private String sname;
		static int c=0;


		private CompanyTraining company;
		public Student() {
			// TODO Auto-generated constructor stub
		}
		public Student(int sid, String sname, CompanyTraining company) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.company = company;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public CompanyTraining getCompany() {
			return company;
		}
		public void setCompany(CompanyTraining company) {
			this.company = company;
		}





		}




