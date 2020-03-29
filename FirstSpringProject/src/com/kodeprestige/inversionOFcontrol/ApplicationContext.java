package com.kodeprestige.inversionOFcontrol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:dataCompanies.properties")
public class ApplicationContext {
	
	//Define bean for FinancialReport
	//bean identifier is method name (financialReport)
	@Bean
	public FinancialReport financialReport() {
		return new FinancialReport();
	}
	
	
	//Define Bean
	//bean identifier is method name (bossEmployee)
	@Bean
	public Employee bossEmployee() {
		return new BossEmployee(financialReport());
	}

}
