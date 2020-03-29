package com.kodeprestige.inversionOFcontrol;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

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
 		
 		//Close context
 		context.close();

 	}
		

}
