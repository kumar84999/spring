package com.ciq.clint;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.pojo.Address;
import com.ciq.pojo.Student;
import com.ciq.controller.controller;

public class StudentClint {

	public static void main(String[] args) {
		
		Address address =new Address("mncl", "telangana", "75000.00");
	    Student s=new Student();
	    
	    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	    controller s1=(controller) context.getBean("controller");
	    //System.out.println(s1);
	    s1.save(s);
	}

}
