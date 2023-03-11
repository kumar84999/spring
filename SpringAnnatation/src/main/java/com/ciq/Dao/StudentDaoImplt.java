package com.ciq.Dao;

import org.springframework.stereotype.Repository;

import com.ciq.pojo.Student;

@Repository
public class StudentDaoImplt implements StudentDao {
    
	public void save(Student student) {
		
		System.out.println("Student Dao controller");
	}

}
