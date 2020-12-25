package com.example.training.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.training.model.Employee;

@Repository
public class EmployeeDAOCachedImpl implements EmployeeDAO{
	public List<Employee> getAllEmployees() {
		List employees = new ArrayList();
		
		Employee james = new Employee();
		james.setId(100);
		james.setFirstName("James");
		james.setLastName("Cooper");
		employees.add(james);
		
		Employee steven = new Employee();
		steven.setId(200);
		steven.setFirstName("Steven");
		steven.setLastName("King");
		employees.add(steven);
		
		return employees;
	}

}
