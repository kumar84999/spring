package com.ciq.Service;

import com.ciq.dao.Studentdaoimplt;
import com.ciq.pojo.Student;

public class StudentServiceImplt implements StudentService{
	
	private Studentdaoimplt Daoimpl;
	
	
	public void setDaoimpl(Studentdaoimplt daoimpl) {
		Daoimpl = daoimpl;
	}

	public void save(Student student) {
		System.out.println("Student Service implementation");
		Daoimpl.save(student);
		
		
	}

	public void delete(Student student) {
		
		
	}

}
