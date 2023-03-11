	package com.ciq.Servicess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Dao.StudentDaoImplt;
import com.ciq.pojo.Student;

@Service
public class StudentServiceImplt implements StudentServicess {

	@Autowired
	private StudentDaoImplt Daoimplt;
	
	public void SetDaoimplt(StudentDaoImplt daoImplt) {
		Daoimplt=daoImplt;
		
}
	public void save(Student student) {
		System.out.println("student service implementation");
		Daoimplt.save(student);
	}
}