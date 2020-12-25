package com.example.training.manageemployee;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	static Map<Integer, Employee> database;

	static {
		database = new HashMap<Integer, Employee>();
	}
	
	public EmployeeRepository() {
		Employee james = new Employee();
		james.setEmpId(100);
		james.setEmpName("James Cooper");
		james.setEmpSalary(12345.0);
	
		Employee steven = new Employee();
		steven.setEmpId(200);
		steven.setEmpName("Steven King");
		steven.setEmpSalary(12345.0);
		
		database.put(100, james);
		database.put(200, steven);
	}
	
	public Collection<Employee> getAllEmployees(){
		return database.values();
	}
	
	public Employee getEmployeeById(Integer empId) {
		return database.get(empId);
	}
}

