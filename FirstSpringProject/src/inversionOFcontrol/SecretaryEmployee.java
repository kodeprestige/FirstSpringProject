package inversionOFcontrol;

public class SecretaryEmployee implements Employee {
	
	private CreationReports newReport;
	
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
