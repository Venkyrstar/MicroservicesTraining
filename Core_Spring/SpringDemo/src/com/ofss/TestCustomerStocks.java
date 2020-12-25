package com.ofss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans2.xml");
		
		Customers cust1 = (Customers) ctx.getBean("cust1");
		System.out.println(cust1);

	}

}
