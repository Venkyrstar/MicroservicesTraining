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
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@RequestMapping(path = "/Customers", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity getFindAllCustomers() {
		ResponseEntity response = null;
		Collection Customers = service.findAllCustomers();
		response = new ResponseEntity(Customers, HttpStatus.OK);
		return response;
	}
	
	@RequestMapping(path = "/Customers/{id}", method = RequestMethod.GET)
	@ResponseBody	
	public ResponseEntity findCustomerById(@PathVariable("id") Integer custId) {
		ResponseEntity response = null;
		try {
			Customer cust = service.findCustomerById(custId);
			response = new ResponseEntity(cust, HttpStatus.OK);
		} catch (RuntimeException e) {
			response = new ResponseEntity("Customer Not Found in Database", HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@RequestMapping(path = "/Customers/{id}", method = RequestMethod.DELETE)
	@ResponseBody	
	public ResponseEntity deleteCustomerById(@PathVariable("id") Integer custId) {
		ResponseEntity response = null;
		try {
			service.deleteCustomer(custId);
			response = new ResponseEntity("Customer Found and Deleted", HttpStatus.OK);
		} catch (RuntimeException e) {
			response = new ResponseEntity("Customer Not Found in Database", HttpStatus.NOT_FOUND);
		}
		return response;
	}
	
	@RequestMapping(path = "/Customers", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity createCustomer(@RequestBody Customer Customer) {
		ResponseEntity response = null;
		service.createCustomer(Customer);
		response = new ResponseEntity("Customer Created Successfully", HttpStatus.CREATED);
		return response;
	}
	
	@RequestMapping(path = "/Customers/{id}", method = RequestMethod.PUT)
	@ResponseBody	
	public ResponseEntity updateCustomerById(@PathVariable("id") Integer custId, @RequestBody Customer cust) {
		ResponseEntity response = null;
		try {
			service.updateCustomer(cust);
			response = new ResponseEntity("Customer Found and Updated", HttpStatus.OK);
		} catch (RuntimeException e) {
			response = new ResponseEntity("Customer Not Found in Database", HttpStatus.NOT_FOUND);
		}
		return response;
	}



}
