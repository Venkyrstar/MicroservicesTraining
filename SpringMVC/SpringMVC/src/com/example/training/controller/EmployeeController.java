package com.example.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.training.service.EmployeeManager;

@Controller
@RequestMapping("/employeecontroller")
public class EmployeeController {
	@Autowired
	EmployeeManager manager;
	
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("employee", manager.getAllEmployees());
		return "EmployeeList";
	}
}
