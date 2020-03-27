package inversionOFcontrol;

public class SecretaryEmployee implements Employee {
	
	private CreationReports newReport;
	
	//Creating the constructor that injects the dependency
	public SecretaryEmployee(CreationReports newReport) {
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
