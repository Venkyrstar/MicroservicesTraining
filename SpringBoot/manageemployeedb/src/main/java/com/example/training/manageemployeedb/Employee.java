package com.example.training.manageemployeedb;

import javax.persistence.*;
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
	@Id //Primary key
	@Column(name = "EMP_ID")
	private Integer empId;
	@Column(name = "EMP_JOB")
	private String job;
	@Column(name = "EMP_NAME")
	private String name;
	@Column(name = "EMP_SALARY")
	private Double salary;
	@Column(name = "EMP_DEPARTMENT")
	private String department;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}

