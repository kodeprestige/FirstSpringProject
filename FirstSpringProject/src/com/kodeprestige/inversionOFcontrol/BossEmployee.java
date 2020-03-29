package com.kodeprestige.inversionOFcontrol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BossEmployee implements Employee {
	
	private Report newReport;
	
	//Creating the constructor that injects the dependency
	
	public BossEmployee(@Qualifier("custumerReport")Report newReport) {
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
