package com.ciq.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Dao.Studentimpl;
import com.ciq.pojo.Student;

public class StudentClient {
	public static void main(String[] args) {
		
		
		
		List<Student> l=new ArrayList<Student>();
		
		
		Student s=new Student(1, "kumar", 25000.00);
		l.add(new Student(2, "Sriman", 23500.00));
	    l.add(new Student(3, "mahesh", 26500.00));
	    l.add(new Student(4, "pooja", 24512.00));
	    l.add(new Student(5, "ramya", 23131.00));
	    
	    l.add(s);
	    ApplicationContext co=new ClassPathXmlApplicationContext("spring.xml");
	    Studentimpl impl=(Studentimpl) co.getBean("Dao");
	    for (Student student : l) {
	    	impl.save(student);
			
		}
//	    System.out.println(impl);
//	    Deleted
//	    impl.delete(5);
//	    
//	    update
	     impl.update(s);
//	     
//	   retrive
	  System.out.println(impl.getAllStudents());
	    
	    
		
	}
	

}
