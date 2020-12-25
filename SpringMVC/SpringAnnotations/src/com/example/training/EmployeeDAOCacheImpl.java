package com.example.training;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


//@Component
public class EmployeeDAOCacheImpl implements EmployeeDAO{
	@Override
	public List<Employee> getAllEmployees() {
		List employees = new ArrayList();
		
		Employee james = new Employee();
		james.setEmpId(100);
		james.setEmpName("James Cooper");
		james.setSalary(12345.0);
		
		Employee scott = new Employee();
		scott.setEmpId(200);
		scott.setEmpName("Scott");
		scott.setSalary(23454.0);
		
		employees.add(james);
		employees.add(scott);
		
		return employees;
	}
}
