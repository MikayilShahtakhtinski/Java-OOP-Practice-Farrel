class JobApplicant{
	private String name;
	private int phone;
	private boolean processing,spreadsheets,databases,graphics;
	public JobApplicant(String name, int phone, boolean processing, boolean spreadsheets, boolean databases,
			boolean graphics) {
		super();
		this.name = name;
		this.phone = phone;
		this.processing = processing;
		this.spreadsheets = spreadsheets;
		this.databases = databases;
		this.graphics = graphics;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public boolean isProcessing() {
		return processing;
	}
	public void setProcessing(boolean processing) {
		this.processing = processing;
	}
	public boolean isSpreadsheets() {
		return spreadsheets;
	}
	public void setSpreadsheets(boolean spreadsheets) {
		this.spreadsheets = spreadsheets;
	}
	public boolean isDatabases() {
		return databases;
	}
	public void setDatabases(boolean databases) {
		this.databases = databases;
	}
	public boolean isGraphics() {
		return graphics;
	}
	public void setGraphics(boolean graphics) {
		this.graphics = graphics;
	}
	
}
public class job {
	public static void qualified(JobApplicant[] jobApplicant) {
		int count = 0;
		for(int i = 0 ; i < jobApplicant.length ; i++) {
			if(jobApplicant[i].isDatabases()) {
				count++;
			}else if(jobApplicant[i].isGraphics()) {
				count++;
			}else if(jobApplicant[i].isProcessing()) {
				count++;
			}else if (jobApplicant[i].isSpreadsheets()) {
				count++;
			}
			
			if(count>=3) {
				System.out.println("Qualified for an interview");
				continue;
			}else {
				System.out.println("Not Qualified");
			}
		}		
	}

	public static void main(String[] args) {
		JobApplicant jobApplicant1 = new JobApplicant("mika", 12, true, true, true, true);
		JobApplicant jobApplicant2 = new JobApplicant("mika", 12, true, true, true, false);
		JobApplicant jobApplicant3 = new JobApplicant("mika", 12, false, true, false, true);
		JobApplicant jobApplicant4 = new JobApplicant("mika", 12, true, false, true, false);
		JobApplicant[] jobApplicants = {jobApplicant1,jobApplicant2,jobApplicant3,jobApplicant4};
		qualified(jobApplicants);

	}

}
