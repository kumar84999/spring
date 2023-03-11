package com.ciq.clint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.Controllers;
import com.ciq.pojo.Address;
import com.ciq.pojo.Student;


public class StudentClint {
	public static Logger logger=LoggerFactory.getLogger( StudentClint.class);
	public static void main(String[] args) {
		Address address =new Address("TS","mncl","504208");
		Student s=new Student(100,"kumar","mncl");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Controllers s1= (Controllers) context.getBean("studcontroller");
		System.out.println(s1);
		s1.save(s);
		logger.info("Application track{}",s);
	}

}
