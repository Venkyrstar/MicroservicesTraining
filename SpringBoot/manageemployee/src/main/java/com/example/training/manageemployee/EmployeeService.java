package com.example.training.manageemployee;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public Collection<Employee> findAllEmployees(){
		return repository.getAllEmployees();
	}
	public Employee findEmployeeById(Integer empId) {
		Employee emp = repository.getEmployeeById(empId);
		if(emp == null)
			throw new RuntimeException("Employee Not Found");
		else
			return emp;
	}
	private EmployeeService() {		
	}
	public static EmployeeService getInstance() {
		return new EmployeeService();
	}

}

