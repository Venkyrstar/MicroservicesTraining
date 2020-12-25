package com.example.training;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	
	static Map<Integer, Employee> database;

	static {
		database = new HashMap<Integer, Employee>();
	}
	
	public EmployeeRepository() {
		Employee james = new Employee();
		Department dep1 = new Department();
		dep1.setDeptName("Sales");
		james.setEmpId(100);
		james.setEmpName("James Cooper");
		james.setEmpSalary(12345.0);
		james.setEmpEmailId("james.cooper@gmail.com");
		james.setDepartment(dep1);
	
		Employee steven = new Employee();
		Department dep2 = new Department();
		dep2.setDeptName("Support");
		steven.setEmpId(200);
		steven.setEmpName("Steven King");
		steven.setEmpSalary(12345.0);
		steven.setEmpEmailId("steven.king@gmail.com");
		steven.setDepartment(dep2);
		
		database.put(100, james);
		database.put(200, steven);
	}
	
	public Collection<Employee> getAllEmployees(){
		return database.values();
	}
	
	public Employee getEmployeeById(Integer empId) {
		return database.get(empId);
	}
	
	public boolean deleteEmployee(Integer empId) {
		Employee emp = this.getEmployeeById(empId);
		if(emp!=null) {
			database.remove(empId);
			return true;
		}else
			return false;
	}
	
	public boolean createEmployee(Employee emp) {
		System.out.println("Employee: "+ emp.getEmpId() + ","+ emp.getEmpName());
		database.put(emp.getEmpId(), emp);
		return true;
	}
	
	public boolean updateEmployee(Employee emp) {
		if(database.get(emp.getEmpId()) != null) {
			database.put(emp.getEmpId(), emp);
			return true;
		}else {
			return false;
		}
	}



}
