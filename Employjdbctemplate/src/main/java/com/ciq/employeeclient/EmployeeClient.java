package com.ciq.employeeclient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.dao.Employimpl;
import com.ciq.pojo.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		
		
		List<Employee>em=new ArrayList<Employee>();
		em.add(new Employee(2,"kumar",750000.00));
		em.add(new Employee(3, "sriman", 720000.00));
		em.add(new Employee(4, "mahesh", 73000.00));
		em.add(new Employee(5, "pooja", 55000.00));
		em.add(new Employee(6, "ramya", 50000.00));
		Employee em1=new Employee(1, "Sweety", 56000.00);
		
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		Employimpl impl=(Employimpl) con.getBean("Dao");
		for (Employee employee : em) {
			impl.save(employee);
		}
//				impl.delete(6);
//				impl.update(em1);
	}

}
