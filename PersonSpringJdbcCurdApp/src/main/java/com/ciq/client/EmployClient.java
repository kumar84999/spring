package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.Employeeimpl;
import com.ciq.pojo.Employee;

public class EmployClient {

	public static void main(String[] args) {
		 Employee em =new Employee(100, "kumar", 22522.00);
		 ApplicationContext con=new ClassPathXmlApplicationContext("");
		 Employeeimpl impl=(Employeeimpl) con.getBean("dao");
		 impl.save(em);

	}

}
