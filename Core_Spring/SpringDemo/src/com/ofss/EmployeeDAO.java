package com.ofss;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	JdbcTemplate jdbcTemplate;

	public EmployeeDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertAnEmployee(Employee emp)
	{
		int empId=emp.getEmpId();
		String empName=emp.getEmpName();
		double empSalary=emp.getSalary();
		String empCity=emp.getCity();
		
		// INSERT INTO EMPLOYEES1 VALUES(1,'GURU',12345.6,'BANGALORE')
		String sqlQuery="INSERT INTO EMPLOYEE VALUES("+empId+",'"+empName+"',"+empSalary+",'"+empCity+"')";
		jdbcTemplate.update(sqlQuery);
		System.out.println("Inserted a record successfully");
	}
	
	public void deleteAnEmployee(Employee emp)
	{
		String sqlQuery="DELETE FROM EMPLOYEE WHERE EMPID="+emp.getEmpId();
		jdbcTemplate.update(sqlQuery);
		System.out.println("Deleted a record successfully");
	}

	
}
