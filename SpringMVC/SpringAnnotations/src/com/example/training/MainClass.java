package com.example.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String args[]) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Initializer.class);
		
		//MyCode code = new MyCode();
		MyCode code = ctx.getBean(MyCode.class); //Getting the MyCode Bean from Spring Container
		
		for(Employee emp: code.findAllEmployees()) {
			System.out.println(" Name: "+ emp.getEmpName());
			System.out.println(" Id: "+ emp.getEmpId());
			System.out.println(" Salary: "+ emp.getSalary());
			System.out.println(" ===========================" );
		}
	}
}
