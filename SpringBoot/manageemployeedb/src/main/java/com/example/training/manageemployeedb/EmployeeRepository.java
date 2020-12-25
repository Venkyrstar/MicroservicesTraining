package com.example.training.manageemployeedb;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	public Iterable<Employee> findBySalary(Double salary);
	//SELECT * FROM EMPLOYEES WHERE EMP_SALARY = ?
}

