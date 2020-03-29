package com.kodeprestige.inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		//Bean construction
		System.out.println("Bean construction");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

 		//Ask for the bean
 		Employee employee = context.getBean("secretaryEmployee", Employee.class);

 		//Use myEmloyee bean
 		System.out.println("\n**Use secretaryEmployee bean");
 		System.out.println(employee.getType() + "\n");
 		
 		//Close the xml file
 		//Bean destruction
 		
 		context.close();
 		System.out.println("Bean destruction");

 	}
		

}
