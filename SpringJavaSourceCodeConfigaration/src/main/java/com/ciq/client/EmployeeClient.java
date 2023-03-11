package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.Dao.Employeeimpl;
import com.ciq.config.EmployConfig;
import com.ciq.pojo.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee em=new Employee(1, "kumar", 2500.00);
		ApplicationContext con=new AnnotationConfigApplicationContext(EmployConfig.class);
		Employeeimpl imp=(Employeeimpl) con.getBean("dao");
	imp.save(em);
	}

}
