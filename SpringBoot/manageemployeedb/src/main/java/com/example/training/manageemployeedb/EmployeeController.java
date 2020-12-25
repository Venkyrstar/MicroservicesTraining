package com.example.training.manageemployeedb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
//@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;
	
	@RequestMapping(path="/employees", method=RequestMethod.GET)
	public Iterable<Employee> getAllEmployees(){
		Iterable<Employee> employees  = repository.findAll();
		return employees;
	}
	
	//@RequestMapping(path="/allemployees", method=RequestMethod.GET)
	@GetMapping(path="/allemployees")
	public Iterable<Employee> findBySalary(@RequestParam(name = "salary") Double salary){
		Iterable<Employee> employees = repository.findBySalary(salary);
		return employees;
	}
	
	@PutMapping(path="/employees/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable("id") Integer empId, @RequestBody Employee emp) {
		java.util.Optional<Employee> result = repository.findById(empId);
		if(result.isPresent()) {
			repository.save(emp);
			return new ResponseEntity("Employee found and updated", HttpStatus.OK);
		}else {
			return new ResponseEntity("Employee not found", HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(path="/employees")
	public ResponseEntity<String> createEmployee(@RequestBody Employee emp){
		repository.save(emp);
		return new ResponseEntity("Employee Created", HttpStatus.CREATED);
	}
	
	@DeleteMapping(path="/employees/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer empId) {
		java.util.Optional<Employee> result = repository.findById(empId);
		if(result.isPresent()) {
			repository.deleteById(empId);
			return new ResponseEntity("Employee found and deleted", HttpStatus.OK);
		}else {
			return new ResponseEntity("Employee not found", HttpStatus.NOT_FOUND);
		}
	}


}

