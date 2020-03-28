package inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Ask for bean
		Employee employee = context.getBean("SecretaryEmployee", Employee.class);
		
		//Use init-method and destroy-method
		System.out.println("\n" + employee.getType());
		
		//Close the xml file
		context.close();
		
	}

}
