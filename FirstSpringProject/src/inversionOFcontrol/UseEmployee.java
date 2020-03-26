package inversionOFcontrol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		
		//load the xml file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ask for the bean
		Employee employee = context.getBean("myEmployee", Employee.class);
		
		//close the xml file
		context.close();
		
		//use the bean
		System.out.println(employee.getType());
		

	}

}
