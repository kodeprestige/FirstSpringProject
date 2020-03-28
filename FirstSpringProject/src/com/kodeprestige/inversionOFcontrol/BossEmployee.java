package com.kodeprestige.inversionOFcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BossEmployee implements Employee {
	
	private CreationReports newReport;
	
	//Creating the constructor that injects the dependency with @Autowired
	@Autowired
	public BossEmployee(CreationReports newReport) {
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
