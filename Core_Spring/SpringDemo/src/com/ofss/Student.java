package com.ofss;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getAge() {
		return age;
	}
	
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void callingStudent() {
		System.out.println("Calling Student from Student class");
		
	}
	
	
}
