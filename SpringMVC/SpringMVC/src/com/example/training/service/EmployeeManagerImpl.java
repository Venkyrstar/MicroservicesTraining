package com.example.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.training.dao.EmployeeDAO;
import com.example.training.model.Employee;

@Service
public class EmployeeManagerImpl implements EmployeeManager{
	
	@Autowired
	EmployeeDAO dao;
	
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

}
