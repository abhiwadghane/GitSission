package inherit;

public class CompanyTraining 
	{
	private int companyid;
	private String companyname;
	private Trainer trainer;

	int c=0;


	public CompanyTraining() {
		// TODO Auto-generated constructor stub
	}

	public CompanyTraining(int companyid, String companyname, Trainer trainer) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
		this.trainer = trainer;
	}

	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}



	}


	class Trainer
	{
		private int tid;
		private String trainername;
		
		public Trainer(int tid, String trainername) {
			super();
			this.tid = tid;
			this.trainername = trainername;
		}
		
		
		public Trainer() {
			// TODO Auto-generated constructor stub
		}


		public int getTid() {
			return tid;
		}


		public void setTid(int tid) {
			this.tid = tid;
		}


		public String getTrainername() {
			return trainername;
		}


		public void setTrainername(String trainername) {
			this.trainername = trainername;
		}
		
		
		
		
	}

