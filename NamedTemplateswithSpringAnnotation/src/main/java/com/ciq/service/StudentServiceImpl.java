package com.ciq.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.Dao.StudentDaoImpl;
import com.ciq.pojo.Student;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired

private StudentDaoImpl studentDaoImpl;

	public int save(Student student) {
		
		return studentDaoImpl.save(student);
		
	}

	public int delete(int id) {
		
		return studentDaoImpl.delete(id);
	}

	public int update(Student student) {
		return studentDaoImpl.update(student);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentDaoImpl.getStudents();
		}

	public ArrayList<Student> allStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
