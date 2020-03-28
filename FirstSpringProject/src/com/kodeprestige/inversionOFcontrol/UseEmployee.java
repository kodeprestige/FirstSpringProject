package com.kodeprestige.inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Ask for bean
		Employee employee = context.getBean("secretaryEmployee", Employee.class);
		
		//Use init-method and destroy-method
		System.out.println("\n" + employee.getType());
		System.out.println("\n" + employee.getReport());
		
		//Close the xml file
		context.close();
		
	}

}
