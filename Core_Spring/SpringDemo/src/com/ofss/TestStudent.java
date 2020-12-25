package com.ofss;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		
		ClassRoom cr=(ClassRoom)ctx.getBean("cr1");
		cr.callStudent();
		System.out.println(cr.getStudent().getName());
		System.out.println(cr.getStudent().getAge());
	}

}
