package com.kodeprestige.inversionOFcontrol;

import org.springframework.stereotype.Component;

@Component
public class FinancialReport implements Report {

	@Override
	public String getReport() {
		
		return "This is the financial report";
		
	}

}
