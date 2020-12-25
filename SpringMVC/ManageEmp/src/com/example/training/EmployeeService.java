package com.example.training;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
	
	public boolean deleteEmployee(Integer empId) {
		if(repository.deleteEmployee(empId))
			return true;
		else
			throw new RuntimeException("Employee Not Found");
	}
	
	public void createEmployee(Employee emp) {
		repository.createEmployee(emp);
	}
	
	public void updateEmployee(Employee emp) {
		boolean result = repository.updateEmployee(emp);
		if(result != true)
			throw new RuntimeException("Record can't be updated, as employee not found");
	}



}
