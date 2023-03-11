package com.ciq.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.pojo.Student;
import com.ciq.service.StudentServiceImpl;

@Controller("dao")
public class StudentController {
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	public int save(Student student) {
		return studentServiceImpl.save(student);
		
	}
public int delete(int id) {
	return studentServiceImpl.delete(id);
}
public int update(Student student) {
	return studentServiceImpl.update(student);
}
public List<Student>geStudents(){
	return studentServiceImpl.getStudents();
}
}
