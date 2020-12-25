package com.example.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	private Integer custId;
	private String custName;
	private Integer custPhone;
	private String custEmail;
	@Autowired
	private List<Address> custAddresses;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Integer getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(Integer custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public List<Address> getCustAddresses() {
		return custAddresses;
	}
	public void setCustAddresses(List<Address> custAddresses) {
		this.custAddresses = custAddresses;
	}
	
	

}
