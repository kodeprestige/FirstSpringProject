package inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//Load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Ask for the bean
		Employee employee = context.getBean("myEmployeeSetter", Employee.class);
		
		//Close the xml file
		context.close();
		
		//Use myEmloyee bean
		System.out.println("**Use myEmloyee bean");
		System.out.println(employee.getType());
		
		//Use myReport bean
		System.out.println("\n**Use myReport bean");
		System.out.println(employee.getReport());
		
		//Use field injection
		System.out.println("\n**Use field injection:");
		System.out.println("Company: " + ((SecretaryEmployee)employee).getCompanyName());
		System.out.println("Email: " + ((SecretaryEmployee)employee).getEmail());
		
	}

}
