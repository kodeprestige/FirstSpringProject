package inversionOFcontrol;

public class DirectorEmployee implements Employee {
	
	private CreationReports newReport;
	
	//Creating the constructor that injects the dependency
	public DirectorEmployee(CreationReports newReport) {
		this.newReport = newReport;
	}

	@Override
	public String getType() {
		
		return "I am a director" ;
		
	}

	@Override
	public String getReport() {
		return "Director: " + newReport.getReport();
	}

}
