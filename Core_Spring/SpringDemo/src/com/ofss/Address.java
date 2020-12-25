package com.ofss;

public class Address {
	int flatNo;
	String streetName;
	String city;
	
	
	// Generate default constructor
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	// Generate parameterized contructor

	public Address(int flatNo, String streeName, String city) {
		super();
		this.flatNo = flatNo;
		this.streetName = streeName;
		this.city = city;
		System.out.println("Address : Constructor based DI is called");
	}


	public int getFlatNo() {
		return flatNo;
	}


	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}


	public String getStreeName() {
		return streetName;
	}


	public void setStreeName(String streeName) {
		this.streetName = streeName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", streeName=" + streetName + ", city=" + city + "]";
	}
	
	// Generate setter & getter methods
	
	
	
	
}

