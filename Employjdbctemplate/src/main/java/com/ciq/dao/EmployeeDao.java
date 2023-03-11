package com.ciq.dao;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeDao {
	
	int save(Employee employee);
	int update(Employee employee);
	int delete(int id);
	
	List<Employee>getallemp();

}
