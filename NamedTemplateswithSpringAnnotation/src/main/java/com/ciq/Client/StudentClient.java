package com.ciq.Client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.ciq.Controller.StudentController;
import com.ciq.pojo.Student;

public class StudentClient {
public static void main(String[] args) {
	
	
	
	Student st1=new Student(1, "kumar", 25425.00);
	Student st2=new Student(2, "sriman", 65242.22);
	Student st3=new Student(3, "mahaansh", 1236.00);
	Student st4=new Student(4, "sweety", 45631.00);
	Student st5=new Student(5, "mahaa", 23425.00);
	Student[]s= {st1,st2,st3,st4,st5};

	
	//	Student s1 = new Student(4, "kumm", 226545.00);

	
	ApplicationContext co=new ClassPathXmlApplicationContext("namedtemplate.xml");
	StudentController controller=co.getBean("dao",StudentController.class);
	
	for (Student student : s) {
		System.out.println(controller.save(student));
		
	}
	//save
//	controller.save(st4);
	
	
	//update
//	controller.update(st3);
	//delete
//	controller.delete(5);
	//retrive;
	
//	List<Student>students=controller.geStudents();
//	for (Student student : students) {
//		System.out.println(student);
//		
//	}
	
}

}
