package com.ofss;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {
	String brandName;
	
	CPU cpu1;
	
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computer(String brandName, CPU cpu1) {
		super();
		this.brandName = brandName;
		this.cpu1 = cpu1;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public CPU getCpu1() {
		return cpu1;
	}
	
	@Autowired
	public void setCpu1(CPU cpu1) {
		this.cpu1 = cpu1;
	}

	@Override
	public String toString() {
		return "Computer [brandName=" + brandName + ", cpu1=" + cpu1 + "]";
	}
	
	
	
}
