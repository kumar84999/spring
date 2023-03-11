package com.ciq.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Dao.StudentDaoImpl;
import com.ciq.bean.Student;

public class StudentClient {
	public static void main(String[] args) {
		ApplicationContext co=new ClassPathXmlApplicationContext("spring.xml");
		StudentDaoImpl Impl=(StudentDaoImpl) co.getBean("Dao");
		Impl.operation(1);
		
	}

}
