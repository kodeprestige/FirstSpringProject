package com.kodeprestige.inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

 		//Ask for the bean
 		Employee employee1 = context.getBean("secretaryEmployee", Employee.class);
 		Employee employee2 = context.getBean("secretaryEmployee", Employee.class);

 		//Close the xml file
 		context.close();

 		//Use myEmloyee bean
 		System.out.println("**Use secretaryEmployee bean");
 		System.out.println(employee1.getType() + "\n");

 		//true: Singelton false: Prototype
 		if(employee1 == employee2) {
 			System.out.println("**Spring uses Singelton by default"); 
 			System.out.println("Both objects point to the same memory address");
 		} else {
 			System.out.println("**secretaryEmployee -> @Scope(\"prototype\")"); 
 			System.out.println("Objects are different");
 		}
 		System.out.println(employee1);
 		System.out.println(employee2);

 	}
		

}
