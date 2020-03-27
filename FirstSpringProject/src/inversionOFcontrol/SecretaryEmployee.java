package inversionOFcontrol;

public class SecretaryEmployee implements Employee {
	
	private CreationReports newReport;
	
	
	private String email;
	private String companyName;
	
	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	//Creating the setter that injects the dependency
	public void setNewReport(CreationReports newReport) {
		this.newReport = newReport;
	}



	@Override
	public String getType() {

		return "I am a Secretary";
		
	}

	@Override
	public String getReport() {
		return "Secretary: " + newReport.getReport();
	}

}
