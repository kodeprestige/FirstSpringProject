package com.kodeprestige.inversionOFcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

@Scope("prototype")
public class SecretaryEmployee implements Employee {

	
	//dependency injection with class field (@Autowired)
	//specify a bean identifier (@Qualifier)
	@Autowired
	@Qualifier("custumerReport")
	private Report newReport;
	
	
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
	
	public void setNewReport(Report newReport) {
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
