package com.ofss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// client code
public class TestEmployee {

	public static void main(String[] args) {

		// Start Spring IOC Container
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Beans3.xml");
		EmployeeDAO ed=(EmployeeDAO)ctx.getBean("edao");
		
		// Let's create Employee object
		Employee e1 = new Employee(9, "Venkatesh", 972454.1, "Vizag");
		ed.insertAnEmployee(e1);
		//ed.deleteAnEmployee(e1);

	}

}
