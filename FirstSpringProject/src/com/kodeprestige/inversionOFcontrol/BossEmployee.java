package com.kodeprestige.inversionOFcontrol;


public class BossEmployee implements Employee {
	
	private Report newReport;
	
	//Creating the constructor that injects the dependency
	
	public BossEmployee(Report newReport) {
		this.newReport = newReport;
	}

	@Override
	public String getType() {
		
		return "I am a boss";
		
	}

	@Override
	public String getReport() {
		return "Boss: " + newReport.getReport();
	}

}
