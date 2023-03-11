package com.ciq.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ciq.Dao.Employeeimpl;

@Configurable
@ComponentScan(basePackages = "com.ciq.*")
public class EmployConfig {
	@Bean
	public Employeeimpl impl() {
		return new Employeeimpl();
		}

}
