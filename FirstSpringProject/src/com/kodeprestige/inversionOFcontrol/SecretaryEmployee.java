package com.kodeprestige.inversionOFcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecretaryEmployee implements Employee {
	
	//Ex: 3
	//dependency injection with class field
	@Autowired
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


//	//Ex: 1
//	//Creating the setter that injects the dependency with @Autowired
//	@Autowired
//	public void setNewReport(CreationReports newReport) {
//		this.newReport = newReport;
//	}
	
//	//Ex: 2
//	//Creating the method that injects the dependency with @Autowired
//	@Autowired
//	public void newReport(CreationReports newReport) {
//		this.newReport = newReport;
//	}
	
	public void setNewReport(CreationReports newReport) {
		this.newReport = newReport;
	}

	@Override
	public String getReport() {
		return "Secretary: " + newReport.getReport();
	}

	@Override
	public String getType() {
		return "I am a Secretary";
	}

	

}
