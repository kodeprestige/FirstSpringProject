package inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//Use init-method and destroy-method
		System.out.println("**Use init-method and destroy-method\n");
		
		//Load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Ask for the bean
		Employee employee = context.getBean("myEmployeeConstructor", Employee.class);
		
		//Use init-method and destroy-method
		System.out.println("\n" + employee.getReport() + "\n");
		
		//Close the xml file
		context.close();
		
	}

}
