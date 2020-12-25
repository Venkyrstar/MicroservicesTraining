package com.ofss;

import org.springframework.beans.factory.annotation.Autowired;

public class ClassRoom {
	
	@Autowired
	private Student student;

	public ClassRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student getStudent() {
		return student;
	}
	
	
	
	
	public ClassRoom(Student student) {
		super();
		System.out.println("constructor is being called");
		this.student = student;
	}
	
	public void setStudent(Student student) {
		System.out.println("Setter based DI on Students");
		this.student = student;
	}
	
	public void callStudent()
	{
		student.callingStudent();
	}
	
}
