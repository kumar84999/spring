package com.ciq.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.model.GreetingMasg;
import com.ciq.model.Student;

public class Clint {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		GreetingMasg m=(GreetingMasg) context.getBean("message");
		m.msg();
		Student em=(Student) context.getBean("employee");
		System.out.println(em);
	}

}
