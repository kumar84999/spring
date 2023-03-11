package com.ciq.controller;

import org.springframework.stereotype.Controller;

import com.ciq.Servicess.StudentServiceImplt;
import com.ciq.pojo.Student;


@Controller("studcontroller")
public class Controllers {
    
	private StudentServiceImplt serviceimplt;
	
	public void SetServiceimplt(StudentServiceImplt serviceImplt) {
		this.serviceimplt=serviceImplt;
	}
	public void save(Student student) {
		System.out.println("Employee controller");
		//serviceimpl.save(student);
	}
}
