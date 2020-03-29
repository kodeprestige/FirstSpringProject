package com.kodeprestige.inversionOFcontrol;

import org.springframework.stereotype.Component;

@Component
public class CustumerReport implements Report {

	@Override
	public String getReport() {
		
		return "This is the custumer report";
	}

}
