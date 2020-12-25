package com.example.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@Component //Asking Spring Container to create object for MyCode
@ComponentScan(basePackages = "com.example.training") //Asking Spring Container to search for classes with @Component in ‘com.example.training’
public class MyCode {
	@Autowired
	EmployeeDAO dao;
	
	public List<Employee> findAllEmployees(){
		return dao.getAllEmployees();
	}
}
