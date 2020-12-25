package com.ofss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

// client code
public class TestCustomer {

	public static void main(String[] args) {
//		Address a=new Address(10, "M.G.Road", "Bangalore");
//		Customer c1=new Customer(100, "Guru", a);
//		
//		System.out.println(c1);
		
		// Method 2: using Spring Framework
		// Start Spring IOC Container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans1.xml");
		//AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("D:\\Microservices training\\MyBeans.xml");
		//Request 1
		Customer c1=(Customer)ctx.getBean("cust");
		//Request 2
		//Customer c2=(Customer)ctx.getBean("cust");
		System.out.println(c1);
		//System.out.println(c1==c2);
		//ctx.registerShutdownHook(); // to shutting down IOC Container

	}

}
