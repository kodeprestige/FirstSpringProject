package com.kodeprestige.inversionOFcontrol;

import org.springframework.stereotype.Component;

@Component
public class FinancialReport implements CreationReports {

	@Override
	public String getReport() {
		
		return "This is the financial report";
		
	}

}
