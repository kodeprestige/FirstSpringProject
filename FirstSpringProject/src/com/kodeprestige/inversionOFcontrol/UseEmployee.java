package com.kodeprestige.inversionOFcontrol;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

 		//Ask for the bean
 		Employee directorEmployee = context.getBean("secretaryEmployee", Employee.class);
 		
 		//Use bossEmployee bean
 		System.out.println("\n**Use directorEmployee bean");
 		System.out.println(directorEmployee.getType());
 		System.out.println("CompanyName: " + ((SecretaryEmployee)directorEmployee).getCompanyName());
 		System.out.println("Email: " + ((SecretaryEmployee)directorEmployee).getEmail());
 		System.out.println(directorEmployee.getReport() + "\n");
 		
 		//Close context
 		context.close();

 	}
		

}
