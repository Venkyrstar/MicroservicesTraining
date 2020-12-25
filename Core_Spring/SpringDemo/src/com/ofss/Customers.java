package com.ofss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Customers {
	
	private Integer custId;
	private String custName;
	private List<Stock> stocks;
	
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(Integer custId, String custName, List<Stock> stocks) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.stocks = stocks;
	}

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

	public List<Stock> getStocks() {
		return stocks;
	}
	
	@Autowired
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", custName=" + custName + ", stocks=" + stocks + "]";
	}
	
	

}
