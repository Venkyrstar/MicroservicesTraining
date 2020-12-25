package com.example.training;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping(path = "/employees", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity getFindAllEmployees() {
		ResponseEntity response = null;
		Collection employees = service.findAllEmployees();
		response = new ResponseEntity(employees, HttpStatus.OK);
		return response;
	}
	
	@RequestMapping(path = "/employees/{id}", method = RequestMethod.GET)
	@ResponseBody	
	public ResponseEntity findEmployeeById(@PathVariable("id") Integer empId) {
		ResponseEntity response = null;
		try {
			Employee emp = service.findEmployeeById(empId);
			response = new ResponseEntity(emp, HttpStatus.OK);
		} catch (RuntimeException e) {
			response = new ResponseEntity("Employee Not Found in Database", HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@RequestMapping(path = "/employees/{id}", method = RequestMethod.DELETE)
	@ResponseBody	
	public ResponseEntity deleteEmployeeById(@PathVariable("id") Integer empId) {
		ResponseEntity response = null;
		try {
			service.deleteEmployee(empId);
			response = new ResponseEntity("Employee Found and Deleted", HttpStatus.OK);
		} catch (RuntimeException e) {
			response = new ResponseEntity("Employee Not Found in Database", HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@RequestMapping(path = "/employees", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity createEmployee(@RequestBody Employee employee) {
		ResponseEntity response = null;
		service.createEmployee(employee);
		response = new ResponseEntity("Employee Created Successfully", HttpStatus.CREATED);
		return response;
	}
	
	@RequestMapping(path = "/employees/{id}", method = RequestMethod.PUT)
	@ResponseBody	
	public ResponseEntity updateEmployeeById(@PathVariable("id") Integer empId, @RequestBody Employee emp) {
		ResponseEntity response = null;
		try {
			service.updateEmployee(emp);
			response = new ResponseEntity("Employee Found and Updated", HttpStatus.OK);
		} catch (RuntimeException e) {
			response = new ResponseEntity("Employee Not Found in Database", HttpStatus.NOT_FOUND);
		}
		return response;
	}



}
