package com.kodeprestige.inversionOFcontrol;

import org.springframework.stereotype.Component;

@Component
public class AnnualReport implements Report {

	@Override
	public String getReport() {
		return "This is the annual report";
	}

}
