package com.ciq.client;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext co=new ClassPathXmlApplicationContext("spring.xml");
	BasicDataSource b1=((BasicDataSource) co.getBean("Dao"));
	try {
		System.out.println(b1.getConnection());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
