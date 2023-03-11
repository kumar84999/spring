package com.ciq.controller;

import com.ciq.Service.StudentServiceImplt;
import com.ciq.pojo.Student;

public class controller {
	private StudentServiceImplt serviceImplt;
	
	
    public void setServiceImplt(StudentServiceImplt serviceImplt) {
		this.serviceImplt = serviceImplt;
	}


	public void save(Student student) {
	System.out.println("Employee controller");
	serviceImplt.save(student);
}
}
