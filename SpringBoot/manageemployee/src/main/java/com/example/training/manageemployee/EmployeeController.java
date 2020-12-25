package com.example.training.manageemployee;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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
}
