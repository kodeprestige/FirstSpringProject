package com.kodeprestige.inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

 		//Ask for the bean
 		Employee bossEmployee = context.getBean("bossEmployee", Employee.class);
 		Employee directorEmployee = context.getBean("directorEmployee", Employee.class);

 		//Use bossEmployee bean
 		System.out.println("\n**Use bossEmployee bean");
 		System.out.println(bossEmployee.getType());
 		System.out.println(bossEmployee.getReport() + "\n");
 		
 		//Use bossEmployee bean
 		System.out.println("\n**Use directorEmployee bean");
 		System.out.println(directorEmployee.getType());
 		System.out.println(directorEmployee.getReport() + "\n");
 		
 		//Close the xml file
 		context.close();

 	}
		

}
