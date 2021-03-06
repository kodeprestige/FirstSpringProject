package com.kodeprestige.inversionOFcontrol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DirectorEmployee implements Employee {
	
	private Report newReport;
	
	//Creating the constructor that injects the dependency
	public DirectorEmployee(@Qualifier("financialReport")Report newReport) {
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
	
	//Spring init method
	public void init() {
		System.out.println("Tasks executed before bean initiation");
	}
	
	
	//Spring destroy method
	public void destroy() {
		System.out.println("Tasks executed before bean destruction");
	}
	

}
