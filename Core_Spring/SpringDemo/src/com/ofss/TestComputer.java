package com.ofss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Computer comp1 = (Computer) ctx.getBean("comp1");
		System.out.println(comp1);
	}

}
