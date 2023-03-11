package com.ciq.Dao;

import java.util.List;

import com.ciq.pojo.Employee;

public interface EmployeeDao {
	void save(Employee  employee);
	void delete(int id);
	void update(Employee employee);
	List<Employee>getEmployees();

}
