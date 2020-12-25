package com.ofss;

public class CPU {
	int speed;
	String type;
	
	public CPU() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CPU(int speed, String type) {
		super();
		this.speed = speed;
		this.type = type;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CPU [speed=" + speed + ", type=" + type + "]";
	}
	
	

}
