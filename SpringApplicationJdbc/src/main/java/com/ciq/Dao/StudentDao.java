package com.ciq.Dao;

import java.util.List;

import com.ciq.pojo.Student;

public interface StudentDao {
	
	
	int save(Student student);
	void delete(int id);
	void update(Student student);
	List<Student>getAllStudents();

}
