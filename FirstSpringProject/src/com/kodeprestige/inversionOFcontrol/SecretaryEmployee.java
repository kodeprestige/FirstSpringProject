package com.kodeprestige.inversionOFcontrol;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SecretaryEmployee implements Employee, InitializingBean, DisposableBean {

	
	//dependency injection with class field (@Autowired)
	//specify a bean identifier (@Qualifier)
	@Autowired
	@Qualifier("financialReport")
	private Report newReport;
	
	//properties
	@Value("${email}")
	private String email;
	@Value("${companyName}")
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

	
	//Execute tasks after Bean construction @PostConstruct.
	public void postConstruct() {
		System.out.println("Tasks executed after Bean construction");
 	}
	
	
	//Execute tasks before Bean destruction @PreDestroy.
 	public void preDestroy() {
 		System.out.println("Tasks executed before bean destruction");
 	}	

    @Override
    public void afterPropertiesSet() throws Exception {
    	postConstruct();
    }

    @Override
    public void destroy() throws Exception {
    	preDestroy();
    }

	

}
