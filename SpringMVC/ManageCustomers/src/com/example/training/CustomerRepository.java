package com.example.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
	static Map<Integer, Customer> database;

	static {
		database = new HashMap<Integer, Customer>();
	}
	
	public CustomerRepository() {
		Customer james = new Customer();
		Address add1 = new Address("Flat 50","Royal street","Bangalore","Karnataka","India");
		Address add2 = new Address("Flat 34","Ram street","Chennai","Tamil Nadu","India");
		List<Address> jamesAddr = new ArrayList();
		jamesAddr.add(add1);
		jamesAddr.add(add2);
		james.setCustId(100);
		james.setCustName("James Cooper");
		james.setCustPhone(123344556);
		james.setCustEmail("james.cooper@gmail.com");
		james.setCustAddresses(jamesAddr);
	
		Customer steven = new Customer();
		Address add3 = new Address("Flat 51","Royals street","Mumbai","Maharashtra","India");
		Address add4 = new Address("Flat 35","krishna street","Hyderabad","Telangana","India");
		List<Address> stevenAddr = new ArrayList();
		stevenAddr.add(add3);
		stevenAddr.add(add4);
		steven.setCustId(200);
		steven.setCustName("Steven King");
		steven.setCustPhone(3456728);
		steven.setCustEmail("steven.king@gmail.com");
		steven.setCustAddresses(stevenAddr);
		
		database.put(100, james);
		database.put(200, steven);
	}
	
	public Collection<Customer> getAllCustomers(){
		return database.values();
	}
	
	public Customer getCustomerById(Integer custId) {
		return database.get(custId);
	}
	
	public boolean deleteCustomer(Integer custId) {
		Customer cust = this.getCustomerById(custId);
		if(cust!=null) {
			database.remove(custId);
			return true;
		}else
			return false;
	}
	
	public boolean createCustomer(Customer cust) {
		database.put(cust.getCustId(), cust);
		return true;
	}
	
	public boolean updateCustomer(Customer cust) {
		if(database.get(cust.getCustId()) != null) {
			database.put(cust.getCustId(), cust);
			return true;
		}else {
			return false;
		}
	}

}
