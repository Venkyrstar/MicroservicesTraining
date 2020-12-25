package com.ofss;

import java.util.List;

public class Customer {
	int custId;
	String custName;
	Address add;
	Project proj;
	List<String> products;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// constructor based DI
	public Customer(int custId, String custName, Address add, Project proj, List<String> products) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.add = add;
		this.proj = proj;
		this.products = products;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
		System.out.println("Customer Address : Setter based DI is called");
	}

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}
	

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", add=" + add + ", proj=" + proj
				+ ", products=" + products + "]";
	}

	public void m1() {
		System.out.println("Initialization is being done....");
	}
	
	public void m2() {
		System.out.println("Clean up is being done....");
	}
}

