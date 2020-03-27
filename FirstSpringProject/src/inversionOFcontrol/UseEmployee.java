package inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Ask for the bean
		Employee employee1 = context.getBean("myEmployeeSetter", Employee.class);
		Employee employee2 = context.getBean("myEmployeeSetter", Employee.class);
		
		//Close the xml file
		context.close();
		
		//true: Singelton false: Prototype
		if(employee1 == employee2) {
			System.out.println("**Spring uses Singelton by default"); 
			System.out.println("Both objects point to the same memory address");
		} else {
			System.out.println("**applicationContext,xml -> bean: myEmployeeSetter -> scope=\"prototype\""); 
			System.out.println("Objects are different");
		}
		
	}

}
