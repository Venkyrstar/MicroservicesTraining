package com.example.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Initializer {
	@Bean
	public EmployeeDAOCacheImpl getCacheInstance() {
		return new EmployeeDAOCacheImpl();
	}
	
	@Bean
	public MyCode getMyCodeInstance() {
		return new MyCode();
	}
}
