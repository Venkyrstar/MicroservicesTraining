package com.example.training;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	
	public Collection<Customer> findAllCustomers(){
		return repository.getAllCustomers();
	}
	public Customer findCustomerById(Integer custId) {
		Customer cust = repository.getCustomerById(custId);
		if(cust == null)
			throw new RuntimeException("Customer Not Found");
		else
			return cust;
	}
	
	public boolean deleteCustomer(Integer custId) {
		if(repository.deleteCustomer(custId))
			return true;
		else
			throw new RuntimeException("Customer Not Found");
	}
	
	public void createCustomer(Customer cust) {
		repository.createCustomer(cust);
	}
	
	public void updateCustomer(Customer cust) {
		boolean result = repository.updateCustomer(cust);
		if(result != true)
			throw new RuntimeException("Record can't be updated, as Customer not found");
	}



}
